package Programación2.POO.Estudiante;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programaActivo = true;
        int nota;
        

        Estudiante estudiante1 = new Estudiante("Adriana");
        
        do {
            ImprimirMenu();
            
            String comando = scanner.nextLine().toUpperCase();

            switch (comando) {
                case "A" -> {
                    if (estudiante1.contador < 10) {
                        System.out.println("Ingresa la calificación:");
                        nota = scanner.nextInt();
                        scanner.nextLine(); 
                        estudiante1.AñadirCalificacion(nota);
                        System.out.println("✓ Calificación agregada!");
                    } else {
                        System.out.println("Ya tienes 10 calificaciones, no puedes agregar más");
                    }
                }
                case "V" -> estudiante1.MostrarCalificacion();
                case "P" -> estudiante1.MostrarPromedio();
                case "S" -> {
                    System.out.println("Saliendo del programa...");
                    programaActivo = false;
                }
                default -> System.out.println("Comando no reconocido");
            }
        
        } while (programaActivo);
        
        scanner.close();
    }

    static void ImprimirMenu() {
        System.out.println("\n=== MENÚ DE CALIFICACIONES ===");
        System.out.println("Puedes ingresar hasta 10 notas");
        System.out.println("[A] Agregar una nota nueva");
        System.out.println("[V] Ver todas tus calificaciones");
        System.out.println("[P] Ver tu promedio");
        System.out.println("[S] Salir del programa");
        System.out.print("Elige una opción: ");
    }

    }

