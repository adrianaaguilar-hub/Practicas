package Programación2.POO.Estudiante;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Estudiante estudiante1 = new Estudiante("Adriana");
        
        int nota;
        System.out.println("Ingresa la calificación 1:");
        nota = entrada.nextInt();
        estudiante1.AñadirCalificacion(nota);
        
        System.out.println("Ingresa la calificación 2:");
        nota = entrada.nextInt();
        estudiante1.AñadirCalificacion(nota);
        
        
        
        entrada.close();
    }
}
