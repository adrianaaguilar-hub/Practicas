package Programación2.POO.Persona;

public class Persona {

    String name;
    int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Hola() {
        System.out.println("Mi nombre es " + name + " y tengo " + age + " años");
    }
}
