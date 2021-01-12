package learn.nio.mynio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * NIO非阻塞通信
 */
public class Server {

    public static void main(String[] args) throws IOException {


        // 1.获取通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 2.切换非阻塞模式
        serverSocketChannel.configureBlocking(false);
        // 3. 绑定链接端口
        serverSocketChannel.bind(new InetSocketAddress(9999));
        // 4.获取选择器
        Selector selector = Selector.open();
        // 5.将通道都注册到选择器上去,并且开始制定监听接受时间
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        // 6.使用selector选择器轮训已经就绪好的事情
        while (selector.select() > 0) {
            //7.获取选择其中的所有注册的通道中就绪好的时间
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey sk = iterator.next();
                if (sk.isAcceptable()) {
                    // 获取当前客户端通道
                    SocketChannel client = serverSocketChannel.accept();
                    // 切换成非阻塞模式
                    client.configureBlocking(false);
                    // 将客户端通道注册到选择器
                    client.register(selector, SelectionKey.OP_READ);
                } else if (sk.isReadable()) {
                    // 获取当前选择器上的读就绪时间
                    SocketChannel readChannel = (SocketChannel) sk.channel();
                    // 读数据
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int len = 0;

                    while ((len = readChannel.read(buffer)) > 0) {
                        buffer.flip();
                        System.out.println(new String(buffer.array(), 0, len));
                        buffer.clear();
                    }

                }
                iterator.remove();
            }


        }

    }
}
