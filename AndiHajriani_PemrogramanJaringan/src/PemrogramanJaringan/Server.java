package PemrogramanJaringan;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running. Waiting for clients...");

            // Menerima koneksi dari klien
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket);

            // Input stream untuk menerima data dari klien
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Membaca data yang diterima dari klien
            String message = in.readLine();
            System.out.println("Received from client: " + message);

            // Menutup koneksi
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
