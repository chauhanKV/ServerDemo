import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoHttpServer {

    public static void main(String[] args) {
            System.out.println("starting server");
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 9090), 10);
            server.createContext("/hello", new HelloHandler());
            server.setExecutor(Executors.newFixedThreadPool(5));
            server.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
