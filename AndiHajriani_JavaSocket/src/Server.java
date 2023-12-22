import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int portNumber = 8081;

        try {
            // Membuat ServerSocket yang mendengarkan pada port 8080
            ServerSocket serverSocket = new ServerSocket(8080);

            System.out.println("Server menunggu koneksi...");

            // Menerima koneksi dari client
            Socket clientSocket = serverSocket.accept();

            System.out.println("Koneksi diterima dari: " + clientSocket.getInetAddress());

            // Buat BufferedReader untuk membaca data dari client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Baca data yang dikirim oleh client
            String clientData = reader.readLine();
            System.out.println("Data from client: " + clientData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
