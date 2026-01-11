import java.util.Scanner;
import java.util.Arrays;  // ← CAMBIO 1: Importar Arrays

public class DiaDietaIngestaVersionII_MEJORADA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();
        System.out.println();

        // ═══════════════════════════════════════════════════════════
        // CAMBIO 2: Usar Arrays.fill() para inicializar
        // ═══════════════════════════════════════════════════════════
        String[] Dia1 = new String[5];
        Arrays.fill(Dia1, "Vacio");
        String[] Dia2 = new String[5];
        Arrays.fill(Dia2, "Vacio");
        String[] Dia3 = new String[5];
        Arrays.fill(Dia3, "Vacio");
        String[] Dia4 = new String[5];
        Arrays.fill(Dia4, "Vacio");
        String[] Dia5 = new String[5];
        Arrays.fill(Dia5, "Vacio");
        // Ventaja: Si cambias a 10 ingestas, solo cambias el número

        String[] Comida = { "Desayuno", "Merienda por la Mañana", "Almuerzo", "Merienda por la tarde", "Cena" };

        final int NUMERO_MENU = -1;
        int diaUsuario = 0;

        // ═══════════════════════════════════════════════════════════
        // WHILE 1: SELECCIONAR DÍAS
        // ═══════════════════════════════════════════════════════════
        while (diaUsuario != NUMERO_MENU) {

            System.out.print("Seleccione el dia (1-5) o -1 para salir: ");
            diaUsuario = scanner.nextInt();
            scanner.nextLine();

            
            if (diaUsuario == -1) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Mostrar el día seleccionado
            if (diaUsuario == 1) {
                System.out.println("\n============================================");
                System.out.println("Paciente: " + nombrePaciente);
                System.out.println("===== Dia " + diaUsuario + ":");
                System.out.println("============================================");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Comida[i] + ": " + Dia1[i]);
                }
            } else if (diaUsuario == 2) {
                System.out.println("\n============================================");
                System.out.println("Paciente: " + nombrePaciente);
                System.out.println("===== Dia " + diaUsuario + ":");
                System.out.println("============================================");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Comida[i] + ": " + Dia2[i]);
                }
            } else if (diaUsuario == 3) {
                System.out.println("\n============================================");
                System.out.println("Paciente: " + nombrePaciente);
                System.out.println("===== Dia " + diaUsuario + ":");
                System.out.println("============================================");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Comida[i] + ": " + Dia3[i]);
                }
            } else if (diaUsuario == 4) {
                System.out.println("\n============================================");
                System.out.println("Paciente: " + nombrePaciente);
                System.out.println("===== Dia " + diaUsuario + ":");
                System.out.println("============================================");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Comida[i] + ": " + Dia4[i]);
                }
            } else {
                System.out.println("\n============================================");
                System.out.println("Paciente: " + nombrePaciente);
                System.out.println("===== Dia " + diaUsuario + ":");
                System.out.println("============================================");
                for (int i = 0; i < 5; i++) {
                    System.out.println(Comida[i] + ": " + Dia5[i]);
                }
            }

            System.out.println();

            int comidaUsuario = 0;
            String ingestaUsuario;

            // ═══════════════════════════════════════════════════════════
            // WHILE 2: SELECCIONAR INGESTAS
            // ═══════════════════════════════════════════════════════════
            while (comidaUsuario != -1) {

                System.out.println("\n--------------------------------------------");
                System.out.println("Para seleccionar ingesta:");
                System.out.println("1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                System.out.println("--------------------------------------------");
                
                System.out.print("Seleccione una ingesta: ");
                comidaUsuario = scanner.nextInt();
                scanner.nextLine();

                if (comidaUsuario == -1) {
                    break; // Volver al menú de días
                }

                int indiceIngesta = comidaUsuario - 1;

                // ═══════════════════════════════════════════════════════════
                // CAMBIO 3: WHILE 3 - AGREGAR MÚLTIPLES ALIMENTOS
                // ═══════════════════════════════════════════════════════════
                // ESTE ES EL CAMBIO MÁS IMPORTANTE ⭐⭐⭐
                
                while (true) {  // ← NUEVO WHILE INFINITO (salimos con break)
                    
                    System.out.print("Ingrese un alimento del " + Comida[indiceIngesta] + " del día " + diaUsuario);
                    System.out.println(" (-1 para terminar / -2 para listar alimentos ingresados)");
                    ingestaUsuario = scanner.nextLine();
                    
                    // ───────────────────────────────────────────────────────
                    // OPCIÓN -1: Terminar de agregar alimentos
                    // ───────────────────────────────────────────────────────
                    if (ingestaUsuario.equals("-1")) {  // ← Usar .equals() para comparar strings
                        break; // Sale del WHILE 3, vuelve al WHILE 2 (menú de ingestas)
                    }
                    
                    // ───────────────────────────────────────────────────────
                    // OPCIÓN -2: Listar alimentos ingresados
                    // ───────────────────────────────────────────────────────
                    if (ingestaUsuario.equals("-2")) {
                        String alimentosActuales = "";
                        
                        // Obtener los alimentos del día e ingesta actual
                        if (diaUsuario == 1) {
                            alimentosActuales = Dia1[indiceIngesta];
                        } else if (diaUsuario == 2) {
                            alimentosActuales = Dia2[indiceIngesta];
                        } else if (diaUsuario == 3) {
                            alimentosActuales = Dia3[indiceIngesta];
                        } else if (diaUsuario == 4) {
                            alimentosActuales = Dia4[indiceIngesta];
                        } else if (diaUsuario == 5) {
                            alimentosActuales = Dia5[indiceIngesta];
                        }
                        
                        System.out.println("📋 Alimentos ingresados: " + alimentosActuales);
                        continue; // Vuelve al inicio del WHILE 3 (pide otro alimento)
                    }
                    
                    // ───────────────────────────────────────────────────────
                    // OPCIÓN NORMAL: Agregar el alimento
                    // ───────────────────────────────────────────────────────
                    // Agregar el alimento al día correcto
                    // Si es el primer alimento (está "Vacio"), reemplazar
                    // Si ya hay alimentos, concatenar con ", "
                    
                    if (diaUsuario == 1) {
                        if (Dia1[indiceIngesta].equals("Vacio")) {  // ← Primer alimento
                            Dia1[indiceIngesta] = ingestaUsuario;
                        } else {  // ← Ya hay alimentos, concatenar
                            Dia1[indiceIngesta] = Dia1[indiceIngesta] + ", " + ingestaUsuario;
                        }
                    } else if (diaUsuario == 2) {
                        if (Dia2[indiceIngesta].equals("Vacio")) {
                            Dia2[indiceIngesta] = ingestaUsuario;
                        } else {
                            Dia2[indiceIngesta] = Dia2[indiceIngesta] + ", " + ingestaUsuario;
                        }
                    } else if (diaUsuario == 3) {
                        if (Dia3[indiceIngesta].equals("Vacio")) {
                            Dia3[indiceIngesta] = ingestaUsuario;
                        } else {
                            Dia3[indiceIngesta] = Dia3[indiceIngesta] + ", " + ingestaUsuario;
                        }
                    } else if (diaUsuario == 4) {
                        if (Dia4[indiceIngesta].equals("Vacio")) {
                            Dia4[indiceIngesta] = ingestaUsuario;
                        } else {
                            Dia4[indiceIngesta] = Dia4[indiceIngesta] + ", " + ingestaUsuario;
                        }
                    } else if (diaUsuario == 5) {
                        if (Dia5[indiceIngesta].equals("Vacio")) {
                            Dia5[indiceIngesta] = ingestaUsuario;
                        } else {
                            Dia5[indiceIngesta] = Dia5[indiceIngesta] + ", " + ingestaUsuario;
                        }
                    }
                    
                    System.out.println("✓ Alimento agregado.");
                    
                } // ← FIN DEL WHILE 3 (alimentos)
                
                // ───────────────────────────────────────────────────────
                // Mostrar el día actualizado después de terminar de agregar
                // ───────────────────────────────────────────────────────
                if (diaUsuario == 1) {
                    System.out.println("\n============================================");
                    System.out.println("Paciente: " + nombrePaciente);
                    System.out.println("===== Dia " + diaUsuario + " (Actualizado):");
                    System.out.println("============================================");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Comida[i] + ": " + Dia1[i]);
                    }
                } else if (diaUsuario == 2) {
                    System.out.println("\n============================================");
                    System.out.println("Paciente: " + nombrePaciente);
                    System.out.println("===== Dia " + diaUsuario + " (Actualizado):");
                    System.out.println("============================================");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Comida[i] + ": " + Dia2[i]);
                    }
                } else if (diaUsuario == 3) {
                    System.out.println("\n============================================");
                    System.out.println("Paciente: " + nombrePaciente);
                    System.out.println("===== Dia " + diaUsuario + " (Actualizado):");
                    System.out.println("============================================");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Comida[i] + ": " + Dia3[i]);
                    }
                } else if (diaUsuario == 4) {
                    System.out.println("\n============================================");
                    System.out.println("Paciente: " + nombrePaciente);
                    System.out.println("===== Dia " + diaUsuario + " (Actualizado):");
                    System.out.println("============================================");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Comida[i] + ": " + Dia4[i]);
                    }
                } else if (diaUsuario == 5) {
                    System.out.println("\n============================================");
                    System.out.println("Paciente: " + nombrePaciente);
                    System.out.println("===== Dia " + diaUsuario + " (Actualizado):");
                    System.out.println("============================================");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Comida[i] + ": " + Dia5[i]);
                    }
                }

            } // ← FIN DEL WHILE 2 (ingestas)

           
            comidaUsuario = 0;

        } // ← FIN DEL WHILE 1 (días)

        scanner.close();
    }
}
