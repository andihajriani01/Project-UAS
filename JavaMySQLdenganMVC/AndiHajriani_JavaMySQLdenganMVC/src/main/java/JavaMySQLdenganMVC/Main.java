package JavaMySQLdenganMVC;
import java.util.Scanner;
/**
 *
 * @author Andi Hajriani
 */
public class Main {
    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        UserView userView = new UserView();
        UserController userController = new UserController(userView, userModel);

        // Menjalankan aplikasi
        userController.runApplication();
    }
}