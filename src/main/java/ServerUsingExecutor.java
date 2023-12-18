import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerUsingExecutor {
    public void Server()
    {
        System.out.println("Starting Server . . .");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String data = sc.nextLine();

            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.println("Printing Data entered by the user : " + data + " in " + Thread.currentThread().getName() + " Thread");
        }
    }
}
