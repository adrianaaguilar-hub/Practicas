package Programación2.POO.Estudiante;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programaActivo = true;
        int nota;

        Estudiante estudiante1 = new Estudiante("Adriana");
        do {
        
        System.out.println("Ingresa la calificación 1:");
        nota = scanner.nextInt();
        estudiante1.AñadirCalificacion(nota);
        
        System.out.println("Ingresa la calificación 2:");
        nota = scanner.nextInt();
        scanner.nextLine();
        estudiante1.AñadirCalificacion(nota);
        
        System.out.println("Si desea ver su promedio presione P");
        System.out.println("Si desea salir del programa presione S");
        String comando = scanner.nextLine();

       switch (comando) {
            case "P" -> estudiante1.MostrarPromedio();
            case "S" -> programaActivo = false;

        
            default -> System.out.println("Comando no reconocido");
               
        }

        } while (programaActivo);
        

        
        scanner.close();
    }

    }

