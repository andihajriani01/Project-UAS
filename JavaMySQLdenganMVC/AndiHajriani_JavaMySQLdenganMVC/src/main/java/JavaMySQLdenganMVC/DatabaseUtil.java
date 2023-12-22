/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaMySQLdenganMVC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Andi Hajriani
 */
public class DatabaseUtil {
    // Gantilah informasi berikut sesuai dengan konfigurasi database Anda
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/andiDB";
    private static final String USERNAME = "Andi";
    private static final String PASSWORD = "Admin01";

    // Load driver JDBC saat class ini pertama kali diakses
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Mendapatkan koneksi ke database MySQL
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
}

