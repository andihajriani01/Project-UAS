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
public class UserController {
    private UserView userView;
    private UserModel userModel;

    public UserController(UserView userView, UserModel userModel) {
        this.userView = userView;
        this.userModel = userModel;
    }

    public void runApplication() {
        int choice;
        do {
            choice = userView.showMenu();
            switch (choice) {
                case 1:
                    // Tambah Pengguna
                    UserModel newUser = userView.getUserInput();
                    userModel.setUsername(newUser.getUsername());
                    userModel.setPassword(newUser.getPassword());
                    userModel.saveToDatabase();
                    break;

                case 2:
                    // Lihat Pengguna
                    // Implementasikan logika untuk menampilkan pengguna dari database
                    break;

                case 3:
                    System.out.println("Keluar dari Aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 3);
    }
}