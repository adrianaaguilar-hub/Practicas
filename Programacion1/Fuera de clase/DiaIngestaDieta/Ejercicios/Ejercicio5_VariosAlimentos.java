// package DiaIngestaDieta;
import java.util.Scanner;

public class Ejercicio5_VariosAlimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // EJERCICIO 5: Guardar múltiples alimentos en una posición
        // Objetivo: Permitir agregar varios alimentos a la misma ingesta
        // Los guardamos separados por comas en el mismo String
        
        // Crear 5 días con 5 ingestas cada uno
        String[] Dia1 = {"", "", "", "", ""};
        String[] Dia2 = {"", "", "", "", ""};
        String[] Dia3 = {"", "", "", "", ""};
        String[] Dia4 = {"", "", "", "", ""};
        String[] Dia5 = {"", "", "", "", ""};
        
        String[] nombresIngestas = {"Desayuno", "Media mañana", "Almuerzo", "Merienda", "Cena"};
        
        System.out.println("=== EJERCICIO 5: Varios alimentos por ingesta ===");
        System.out.println("Paciente: Jose Manuel R.");
        System.out.println();
        
        // Bucle principal
        int dia = -1;
        while (dia != 0) {
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.print("Seleccione día (1-5) o 0 para salir: ");
            dia = scanner.nextInt();
            scanner.nextLine();
            
            if (dia == 0) {
                break;
            }
            
            if (dia < 1 || dia > 5) {
                System.out.println("Día inválido.");
                continue;
            }
            
            // Menú de ingestas
            int ingesta = -1;
            while (ingesta != -1) {
                System.out.println();
                System.out.println("--- DIA " + dia + " ---");
                System.out.println("1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                System.out.print("Opción: ");
                ingesta = scanner.nextInt();
                scanner.nextLine();
                
                if (ingesta == -1) {
                    break;
                }
                
                if (ingesta < 1 || ingesta > 5) {
                    System.out.println("Opción inválida.");
                    continue;
                }
                
                int indiceIngesta = ingesta - 1;
                String nombreIngesta = nombresIngestas[indiceIngesta];
                
                // Agregar múltiples alimentos
                String alimentoInput = "";
                while (true) {
                    System.out.print("Ingrese un alimento del " + nombreIngesta + " del día " + dia);
                    System.out.println(" (-1 para terminar / -2 para listar)");
                    alimentoInput = scanner.nextLine();
                    
                    if (alimentoInput.equals("-1")) {
                        break; // Terminar esta ingesta
                    }
                    
                    if (alimentoInput.equals("-2")) {
                        // Mostrar alimentos actuales
                        String alimentosActuales = "";
                        if (dia == 1) {
                            alimentosActuales = Dia1[indiceIngesta];
                        } else if (dia == 2) {
                            alimentosActuales = Dia2[indiceIngesta];
                        } else if (dia == 3) {
                            alimentosActuales = Dia3[indiceIngesta];
                        } else if (dia == 4) {
                            alimentosActuales = Dia4[indiceIngesta];
                        } else if (dia == 5) {
                            alimentosActuales = Dia5[indiceIngesta];
                        }
                        
                        if (alimentosActuales.equals("")) {
                            System.out.println("  (Vacío)");
                        } else {
                            System.out.println("  Alimentos: " + alimentosActuales);
                        }
                        continue;
                    }
                    
                    // Agregar alimento
                    // Si ya hay alimentos, agregamos con coma
                    // Si está vacío, es el primero
                    if (dia == 1) {
                        if (Dia1[indiceIngesta].equals("")) {
                            Dia1[indiceIngesta] = alimentoInput;
                        } else {
                            Dia1[indiceIngesta] = Dia1[indiceIngesta] + ", " + alimentoInput;
                        }
                    } else if (dia == 2) {
                        if (Dia2[indiceIngesta].equals("")) {
                            Dia2[indiceIngesta] = alimentoInput;
                        } else {
                            Dia2[indiceIngesta] = Dia2[indiceIngesta] + ", " + alimentoInput;
                        }
                    } else if (dia == 3) {
                        if (Dia3[indiceIngesta].equals("")) {
                            Dia3[indiceIngesta] = alimentoInput;
                        } else {
                            Dia3[indiceIngesta] = Dia3[indiceIngesta] + ", " + alimentoInput;
                        }
                    } else if (dia == 4) {
                        if (Dia4[indiceIngesta].equals("")) {
                            Dia4[indiceIngesta] = alimentoInput;
                        } else {
                            Dia4[indiceIngesta] = Dia4[indiceIngesta] + ", " + alimentoInput;
                        }
                    } else if (dia == 5) {
                        if (Dia5[indiceIngesta].equals("")) {
                            Dia5[indiceIngesta] = alimentoInput;
                        } else {
                            Dia5[indiceIngesta] = Dia5[indiceIngesta] + ", " + alimentoInput;
                        }
                    }
                    
                    System.out.println("Alimento agregado.");
                }
            }
        }
        
        // Resumen final
        System.out.println();
        System.out.println("=== RESUMEN FINAL ===");
        System.out.println();
        
        for (int d = 1; d <= 5; d++) {
            System.out.println("Dia " + d + ":");
            for (int i = 0; i < 5; i++) {
                String alimentos = "";
                if (d == 1) {
                    alimentos = Dia1[i];
                } else if (d == 2) {
                    alimentos = Dia2[i];
                } else if (d == 3) {
                    alimentos = Dia3[i];
                } else if (d == 4) {
                    alimentos = Dia4[i];
                } else if (d == 5) {
                    alimentos = Dia5[i];
                }
                
                if (!alimentos.equals("")) {
                    System.out.println("  " + nombresIngestas[i] + ": " + alimentos);
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
