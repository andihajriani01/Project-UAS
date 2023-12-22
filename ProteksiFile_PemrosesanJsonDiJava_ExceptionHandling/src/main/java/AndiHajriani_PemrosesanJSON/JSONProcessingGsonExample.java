/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndiHajriani_PemrosesanJSON;

import com.google.gson.Gson;

/**
 *
 * @author Andi Hajriani
 */
public class JSONProcessingGsonExample {

    public static void main(String[] args) {
        // Objek Java yang akan diubah menjadi JSON
        Person person = new Person("Andi Hajriani", 23, "andihajriani@gmail.com");

        // Menggunakan Gson untuk mengonversi objek Java menjadi JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println("Objek Java ke JSON: " + json);

        // Mengonversi JSON kembali ke objek Java
        Person newPerson = gson.fromJson(json, Person.class);
        System.out.println("JSON ke Objek Java: " + newPerson.getName());
    }
}

// Contoh kelas Person
class Person {

    private String name;
    private int age;
    private String email;

    // Konstruktor, getter, setter, dll.
    // Konstruktor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

// Getter
    String getName() {
        return name;
    }
}
