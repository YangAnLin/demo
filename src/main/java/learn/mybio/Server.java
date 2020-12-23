package learn.mybio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static List<Socket> all = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true) {
            Socket accept = serverSocket.accept();

            all.add(accept);

            new ServerReaderThread(accept).start();

        }
    }

}
