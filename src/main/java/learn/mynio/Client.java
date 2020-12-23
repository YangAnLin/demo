package learn.mynio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {


        SocketChannel open = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9999));

        open.configureBlocking(false);

        ByteBuffer buffer = ByteBuffer.allocate(2014);

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("说话:");
            String s = scanner.nextLine();
            buffer.put(("波仔:" + s).getBytes());
            buffer.flip();
            open.write(buffer);
            buffer.clear();
        }

    }
}
