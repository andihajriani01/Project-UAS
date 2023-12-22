/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndiHajriani_JSONProcessing;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
/**
 *
 * @author Andi Hajriani
 */
public class JSONProcessing {
    
    public static void main(String[] args) {
        try {
            // Objek Java yang akan diubah menjadi JSON
            Person person = new Person("Andi Hajriani", 23, "andihajriani@gmail.com");

            // Menggunakan Gson untuk mengonversi objek Java menjadi JSON
            Gson gson = new Gson();
            String json = gson.toJson(person);

            System.out.println("Objek Java ke JSON: " + json);

            // Mengonversi JSON yang tidak valid kembali ke objek Java (menyebabkan exception)
            String invalidJson = "{ \"name\": \"John\", \"age\": \"twenty\", \"email\": \"john@example.com\" }";
            Person newPerson = gson.fromJson(invalidJson, Person.class);
            System.out.println("JSON ke Objek Java: " + newPerson.getName());
        } catch (JsonSyntaxException e) {
            System.err.println("Exception occurred: Invalid JSON syntax");
            e.printStackTrace();
        }
    }

}
