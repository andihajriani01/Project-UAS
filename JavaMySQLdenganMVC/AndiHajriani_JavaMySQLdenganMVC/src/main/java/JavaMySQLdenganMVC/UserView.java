/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMySQLdenganMVC;
import java.util.Scanner;
/**
 *
 * @author Andi Hajriani
 */
public class UserView {
    private Scanner scanner = new Scanner(System.in);

    // Menampilkan menu
    public int showMenu() {
        System.out.println("=== Aplikasi Manajemen Pengguna ===");
        System.out.println("1. Tambah Pengguna");
        System.out.println("2. Lihat Pengguna");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu (1-3): ");
        return scanner.nextInt();
    }

    // Menerima input untuk pembuatan pengguna baru
    public UserModel getUserInput() {
        System.out.print("Masukkan nama pengguna: ");
        String username = scanner.next();
        System.out.print("Masukkan kata sandi: ");
        String password = scanner.next();

        return new UserModel(username, password);
    }

    // Menampilkan data pengguna
    public void displayUser(UserModel user) {
        System.out.println("=== Informasi Pengguna ===");
        System.out.println("ID: " + user.getUserId());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("===========================");
    }
}