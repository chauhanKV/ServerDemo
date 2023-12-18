import java.util.Scanner;

public class BasicServer {
    public void Server()
    {
        System.out.println("Starting Server . . .");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String data = sc.nextLine();
            System.out.println("Printing Data entered by the user : " + data + " in " + Thread.currentThread().getName() + " Thread");
        }
    }
}
