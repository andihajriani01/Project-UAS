/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndiHajriani_ProteksiFile;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Andi Hajriani
 */
public class proteksiFile {
    
    public static void main(String[] args) {
        try {
            // Membuat objek File
            File file = new File("data.txt");

            // Mengecek apakah file sudah ada, jika tidak, membuat file baru
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File baru 'data.txt' berhasil dibuat.");
            }

            // Mengatur hak akses file
            file.setExecutable(false); // File tidak dapat dieksekusi
            file.setReadable(true);    // File bisa dibaca
            file.setWritable(true);    // File bisa ditulis

            // Menampilkan informasi hak akses file
            System.out.println("Hak akses file: "
                    + "Read - " + file.canRead()
                    + ", Write - " + file.canWrite()
                    + ", Execute - " + file.canExecute());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
