package JavaSocket;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to server.");

            // Membuat thread untuk menerima pesan dari server
            Thread messageReceiver = new Thread(() -> {
                try {
                    Scanner serverScanner = new Scanner(socket.getInputStream());
                    while (serverScanner.hasNextLine()) {
                        String message = serverScanner.nextLine();
                        System.out.println("Server: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            messageReceiver.start();

            // Membaca input dari pengguna dan mengirimkannya ke server
            Scanner userInputScanner = new Scanner(System.in);
            PrintWriter clientWriter = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                System.out.print("You: ");
                String message = userInputScanner.nextLine();
                clientWriter.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
