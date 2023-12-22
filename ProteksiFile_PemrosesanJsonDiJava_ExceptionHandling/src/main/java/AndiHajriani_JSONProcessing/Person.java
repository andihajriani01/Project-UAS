/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AndiHajriani_JSONProcessing;

/**
 *
 * @author Andi Hajriani
 */
public class Person {

    private String name;
    private int age;
    private String email;

    // Konstruktor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Getter untuk umur dan email bisa ditambahkan jika diperlukan
    public int getAge() {
        return age;
    }

    // Setter bisa ditambahkan jika diperlukan
    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public String getEmail() {
        return email;
    }

// Setter
    public void setEmail(String email) {
        this.email = email;
    }

}
