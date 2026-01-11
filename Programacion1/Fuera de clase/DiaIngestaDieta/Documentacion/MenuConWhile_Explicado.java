import java.util.Scanner;

public class MenuConWhile_Explicado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para guardar los alimentos (iniciamos vacíos)
        String[] Dia1 = {"", "", "", "", ""};
        String[] Dia2 = {"", "", "", "", ""};
        String[] Dia3 = {"", "", "", "", ""};
        String[] Dia4 = {"", "", "", "", ""};
        String[] Dia5 = {"", "", "", "", ""};
        
        String[] nombresIngestas = {"Desayuno", "Media mañana", "Almuerzo", "Merienda", "Cena"};
        
        System.out.println("=== TUTORIAL: Menu con While ===");
        System.out.println();
        
        // ============================================
        // PASO 1: BUCLE PRINCIPAL - SELECCIONAR DÍA
        // ============================================
        // Este while se repite hasta que el usuario decida salir
        
        int diaSeleccionado = -1;
        
        while (diaSeleccionado != 0) {  // Se repite mientras NO sea 0
            
            System.out.print("Seleccione día (1-5) o 0 para salir: ");
            diaSeleccionado = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            // Si elige 0, salimos
            if (diaSeleccionado == 0) {
                System.out.println("¡Hasta luego!");
                break; // break SALE del while
            }
            
            // Validar que sea un día válido
            if (diaSeleccionado < 1 || diaSeleccionado > 5) {
                System.out.println("Día inválido. Intente de nuevo.");
                continue; // continue VUELVE al inicio del while
            }
            
            // ============================================
            // PASO 2: BUCLE SECUNDARIO - SELECCIONAR INGESTA
            // ============================================
            // Este while está DENTRO del primer while
            // Se repite hasta que el usuario escriba -1
            
            int ingestaSeleccionada = 0;
            
            while (ingestaSeleccionada != -1) {  // Se repite mientras NO sea -1
                
                System.out.println();
                System.out.println("Día " + diaSeleccionado);
                System.out.print("Seleccione ingesta: ");
                System.out.println("1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                ingestaSeleccionada = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                // Si elige -1, volvemos al menú de días
                if (ingestaSeleccionada == -1) {
                    break; // Salimos de este while y volvemos al while de días
                }
                
                // Validar ingesta
                if (ingestaSeleccionada < 1 || ingestaSeleccionada > 5) {
                    System.out.println("Ingesta inválida.");
                    continue; // Volvemos al inicio de este while
                }
                
                // Convertir a índice (1-5 -> 0-4)
                int indiceIngesta = ingestaSeleccionada - 1;
                String nombreIngesta = nombresIngestas[indiceIngesta];
                
                // ============================================
                // PASO 3: BUCLE PARA AGREGAR ALIMENTOS
                // ============================================
                // Este es el tercer while anidado
                // Se repite hasta que el usuario escriba -1
                
                String alimentoIngresado = "";
                
                while (true) {  // true = bucle infinito, salimos con break
                    
                    System.out.print("Ingrese un alimento del " + nombreIngesta + " del día " + diaSeleccionado);
                    System.out.println(" (-1 para terminar / -2 para listar alimentos ingresados)");
                    alimentoIngresado = scanner.nextLine();
                    
                    // Opción -1: Terminar de agregar alimentos
                    if (alimentoIngresado.equals("-1")) {
                        break; // Salimos de este while
                    }
                    
                    // Opción -2: Listar alimentos
                    if (alimentoIngresado.equals("-2")) {
                        String alimentosActuales = "";
                        
                        // Obtener los alimentos del día e ingesta seleccionados
                        if (diaSeleccionado == 1) {
                            alimentosActuales = Dia1[indiceIngesta];
                        } else if (diaSeleccionado == 2) {
                            alimentosActuales = Dia2[indiceIngesta];
                        } else if (diaSeleccionado == 3) {
                            alimentosActuales = Dia3[indiceIngesta];
                        } else if (diaSeleccionado == 4) {
                            alimentosActuales = Dia4[indiceIngesta];
                        } else if (diaSeleccionado == 5) {
                            alimentosActuales = Dia5[indiceIngesta];
                        }
                        
                        // Mostrar
                        if (alimentosActuales.equals("")) {
                            System.out.println("  (No hay alimentos registrados)");
                        } else {
                            System.out.println("  Alimentos: " + alimentosActuales);
                        }
                        
                        continue; // Volvemos a pedir otro alimento
                    }
                    
                    // ============================================
                    // AGREGAR EL ALIMENTO AL ARRAY
                    // ============================================
                    // Si ya hay alimentos, agregamos con coma
                    // Si está vacío, es el primero
                    
                    if (diaSeleccionado == 1) {
                        if (Dia1[indiceIngesta].equals("")) {
                            Dia1[indiceIngesta] = alimentoIngresado;
                        } else {
                            Dia1[indiceIngesta] = Dia1[indiceIngesta] + ", " + alimentoIngresado;
                        }
                    } else if (diaSeleccionado == 2) {
                        if (Dia2[indiceIngesta].equals("")) {
                            Dia2[indiceIngesta] = alimentoIngresado;
                        } else {
                            Dia2[indiceIngesta] = Dia2[indiceIngesta] + ", " + alimentoIngresado;
                        }
                    } else if (diaSeleccionado == 3) {
                        if (Dia3[indiceIngesta].equals("")) {
                            Dia3[indiceIngesta] = alimentoIngresado;
                        } else {
                            Dia3[indiceIngesta] = Dia3[indiceIngesta] + ", " + alimentoIngresado;
                        }
                    } else if (diaSeleccionado == 4) {
                        if (Dia4[indiceIngesta].equals("")) {
                            Dia4[indiceIngesta] = alimentoIngresado;
                        } else {
                            Dia4[indiceIngesta] = Dia4[indiceIngesta] + ", " + alimentoIngresado;
                        }
                    } else if (diaSeleccionado == 5) {
                        if (Dia5[indiceIngesta].equals("")) {
                            Dia5[indiceIngesta] = alimentoIngresado;
                        } else {
                            Dia5[indiceIngesta] = Dia5[indiceIngesta] + ", " + alimentoIngresado;
                        }
                    }
                    
                    System.out.println("Alimento agregado.");
                    
                } // Fin del while de alimentos
                
            } // Fin del while de ingestas
            
        } // Fin del while de días
        
        // ============================================
        // MOSTRAR RESUMEN FINAL
        // ============================================
        System.out.println();
        System.out.println("=== RESUMEN FINAL ===");
        System.out.println();
        
        for (int dia = 1; dia <= 5; dia++) {
            System.out.println("Día " + dia + ":");
            for (int i = 0; i < 5; i++) {
                String alimentos = "";
                
                if (dia == 1) {
                    alimentos = Dia1[i];
                } else if (dia == 2) {
                    alimentos = Dia2[i];
                } else if (dia == 3) {
                    alimentos = Dia3[i];
                } else if (dia == 4) {
                    alimentos = Dia4[i];
                } else if (dia == 5) {
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
