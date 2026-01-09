// package DiaIngestaDieta;
import java.util.Scanner;

public class Ejercicio4_MenuSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // EJERCICIO 4: Menú simple que se repite
        // Objetivo: Crear un menú que permita elegir día e ingesta repetidamente
        
        // Crear 5 días con 5 ingestas cada uno
        String[] Dia1 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia2 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia3 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia4 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia5 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        
        String[] nombresIngestas = {"Desayuno", "Media mañana", "Almuerzo", "Merienda", "Cena"};
        
        System.out.println("=== EJERCICIO 4: Menú simple ===");
        System.out.println("Paciente: Jose Manuel R.");
        System.out.println();
        
        // Bucle principal - se repite hasta que el usuario escriba 0
        int dia = -1;
        while (dia != 0) {
            // Menú de días
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.print("Seleccione día (1-5) o 0 para salir: ");
            dia = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            if (dia == 0) {
                System.out.println("¡Hasta luego!");
                break; // Salir del bucle
            }
            
            if (dia < 1 || dia > 5) {
                System.out.println("Día inválido. Intente de nuevo.");
                System.out.println();
                continue; // Volver al inicio del bucle
            }
            
            // Menú de ingestas
            int ingesta = -1;
            while (ingesta != -1) {
                System.out.println();
                System.out.println("--- DIA " + dia + " ---");
                System.out.println("Seleccione ingesta:");
                System.out.println("1 (Desayuno)");
                System.out.println("2 (Media mañana)");
                System.out.println("3 (Almuerzo)");
                System.out.println("4 (Merienda)");
                System.out.println("5 (Cena)");
                System.out.println("-1 (Volver al menú anterior)");
                System.out.print("Opción: ");
                ingesta = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                if (ingesta == -1) {
                    break; // Volver al menú de días
                }
                
                if (ingesta < 1 || ingesta > 5) {
                    System.out.println("Ingesta inválida. Intente de nuevo.");
                    continue;
                }
                
                // Pedir alimento
                System.out.print("Ingrese el alimento: ");
                String alimento = scanner.nextLine();
                
                // Guardar en la posición correcta
                int indiceIngesta = ingesta - 1;
                
                if (dia == 1) {
                    Dia1[indiceIngesta] = alimento;
                } else if (dia == 2) {
                    Dia2[indiceIngesta] = alimento;
                } else if (dia == 3) {
                    Dia3[indiceIngesta] = alimento;
                } else if (dia == 4) {
                    Dia4[indiceIngesta] = alimento;
                } else if (dia == 5) {
                    Dia5[indiceIngesta] = alimento;
                }
                
                System.out.println("¡Alimento guardado!");
            }
        }
        
        // Mostrar resumen final
        System.out.println();
        System.out.println("=== RESUMEN FINAL ===");
        System.out.println();
        
        System.out.println("Dia 1:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia1[i]);
        }
        System.out.println();
        
        System.out.println("Dia 2:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia2[i]);
        }
        System.out.println();
        
        System.out.println("Dia 3:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia3[i]);
        }
        System.out.println();
        
        System.out.println("Dia 4:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia4[i]);
        }
        System.out.println();
        
        System.out.println("Dia 5:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia5[i]);
        }
        
        scanner.close();
    }
}
