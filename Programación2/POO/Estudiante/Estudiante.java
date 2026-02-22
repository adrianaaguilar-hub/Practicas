package Programación2.POO.Estudiante;

import java.util.Scanner;

public class Estudiante {
    
    String nombre;
    int [] calificacion = new int [10];

    int contador = 0;

    public Estudiante (String nombre, int [] calificacion) {
        this.nombre = nombre;
        
    }


    public void AñadirCalificacion (int nota) {
        if (contador < 10) {
            calificacion[contador] = nota;  // GUARDA la nota
            System.out.println("Has agregado la nota: " + nota);
            contador = contador + 1;
        } else {
            System.out.println("Llegaste al máximo de notas, 10");
        }
    }

    public void PromedioDeCalificaciones () {
        if (contador == 0) {
            return 0;
        }
        
    }

}
