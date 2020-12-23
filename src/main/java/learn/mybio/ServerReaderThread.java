package learn.mybio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread {

    private Socket socket;

    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg ;
            while ((msg = bufferedReader.readLine()) != null) {
                sendAll(msg);
            }
        } catch (Exception e) {
            System.out.println("有人下线了");
            Server.all.remove(socket);
        }


    }

    /**
     * 发送给所有人
     * @param msg
     */
    private void sendAll(String msg) {

        Server.all.forEach(one->{
            PrintStream printStream = null;
            try {
                printStream = new PrintStream(one.getOutputStream());
                printStream.println(msg);
                printStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
