package PemrogramanJaringan;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Membuat koneksi ke server dengan IP dan port tertentu
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            // Output stream untuk mengirim data ke server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Mengirim pesan ke server
            out.println("Hello, Server!");

            // Menutup koneksi
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
