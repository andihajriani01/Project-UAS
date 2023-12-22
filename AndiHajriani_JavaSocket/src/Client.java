import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // Membuat koneksi ke server pada IP 'localhost' dan port 8080
            Socket socket = new Socket("localhost", 8080);

            System.out.println("Koneksi berhasil ke: " + socket.getInetAddress());

            // Lakukan operasi lain sesuai kebutuhan

            // Tutup socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
