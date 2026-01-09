import java.util.Scanner;
import java.util.Arrays;

/*
═══════════════════════════════════════════════════════════════════
    VERSIÓN III: CON MÉTODOS STATIC
    Explicación línea por línea de cómo usar métodos
═══════════════════════════════════════════════════════════════════
*/

public class DiaDietaIngestaVersionIII_CON_METODOS {
    
    // ═══════════════════════════════════════════════════════════════
    // VARIABLES GLOBALES (compartidas entre todos los métodos)
    // ═══════════════════════════════════════════════════════════════
    static String[] Dia1 = new String[5];
    static String[] Dia2 = new String[5];
    static String[] Dia3 = new String[5];
    static String[] Dia4 = new String[5];
    static String[] Dia5 = new String[5];
    static String[] Comida = { "Desayuno", "Merienda por la Mañana", "Almuerzo", "Merienda por la tarde", "Cena" };
    static String nombrePaciente = "";
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO 1: Inicializar todos los días con "Vacio"
    // ═══════════════════════════════════════════════════════════════
    // public: puede ser llamado desde cualquier lugar
    // static: puede ser llamado sin crear un objeto
    // void: no retorna ningún valor (solo hace algo)
    // inicializarDias: nombre del método
    // (): sin parámetros (no recibe nada)
    
    public static void inicializarDias() {
        // Usar Arrays.fill() para llenar cada día con "Vacio"
        Arrays.fill(Dia1, "Vacio");  // Dia1 = ["Vacio", "Vacio", "Vacio", "Vacio", "Vacio"]
        Arrays.fill(Dia2, "Vacio");
        Arrays.fill(Dia3, "Vacio");
        Arrays.fill(Dia4, "Vacio");
        Arrays.fill(Dia5, "Vacio");
        
        System.out.println("✓ Días inicializados correctamente");
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO 2: Mostrar un día completo
    // ═══════════════════════════════════════════════════════════════
    // int numeroDia: el número del día (1-5)
    // String[] dia: el array que contiene los alimentos del día
    
    public static void mostrarDia(int numeroDia, String[] dia) {
        // Línea 1: Separador visual
        System.out.println("\n============================================");
        
        // Línea 2: Mostrar nombre del paciente
        System.out.println("Paciente: " + nombrePaciente);
        
        // Línea 3: Mostrar número del día
        System.out.println("===== Dia " + numeroDia + ":");
        
        // Línea 4: Otro separador
        System.out.println("============================================");
        
        // Líneas 5+: Recorrer y mostrar cada ingesta
        for (int i = 0; i < 5; i++) {
            // Comida[i] = nombre de la ingesta (ej: "Desayuno")
            // dia[i] = alimentos de esa ingesta (ej: "Café, tostadas")
            System.out.println(Comida[i] + ": " + dia[i]);
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO 3: Obtener el array del día correcto
    // ═══════════════════════════════════════════════════════════════
    // int numeroDia: el día seleccionado (1-5)
    // return: devuelve el array correspondiente (Dia1, Dia2, etc.)
    
    public static String[] obtenerDia(int numeroDia) {
        // if-else para seleccionar el día correcto
        if (numeroDia == 1) {
            return Dia1;  // ← Devuelve el array Dia1
        } else if (numeroDia == 2) {
            return Dia2;
        } else if (numeroDia == 3) {
            return Dia3;
        } else if (numeroDia == 4) {
            return Dia4;
        } else {
            return Dia5;
        }
        
        // NOTA: "return" termina el método y devuelve un valor
        //       que puede ser usado donde se llamó el método
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO 4: Agregar alimentos a una ingesta
    // ═══════════════════════════════════════════════════════════════
    // Scanner scanner: para leer del teclado
    // int numeroDia: el día seleccionado
    // int indiceIngesta: la ingesta seleccionada (0-4)
    
    public static void agregarAlimentos(Scanner scanner, int numeroDia, int indiceIngesta) {
        // Obtener el array del día correcto usando el método anterior
        String[] dia = obtenerDia(numeroDia);  // ← Llamar a otro método
        
        // Obtener el nombre de la ingesta (ej: "Desayuno")
        String nombreIngesta = Comida[indiceIngesta];
        
        // WHILE infinito: se repite hasta que el usuario escriba -1
        while (true) {
            // Mostrar instrucciones
            System.out.print("Ingrese un alimento del " + nombreIngesta + " del día " + numeroDia);
            System.out.println(" (-1 para terminar / -2 para listar)");
            
            // Leer respuesta del usuario
            String alimento = scanner.nextLine();
            
            // ───────────────────────────────────────────────────────
            // CASO 1: Usuario escribe -1 (terminar)
            // ───────────────────────────────────────────────────────
            if (alimento.equals("-1")) {
                break;  // Sale del while, termina el método
            }
            
            // ───────────────────────────────────────────────────────
            // CASO 2: Usuario escribe -2 (listar)
            // ───────────────────────────────────────────────────────
            if (alimento.equals("-2")) {
                // Mostrar alimentos actuales
                System.out.println("📋 Alimentos: " + dia[indiceIngesta]);
                continue;  // Vuelve al inicio del while
            }
            
            // ───────────────────────────────────────────────────────
            // CASO 3: Usuario escribe un alimento
            // ───────────────────────────────────────────────────────
            
            // Si está vacío, es el primer alimento
            if (dia[indiceIngesta].equals("Vacio")) {
                dia[indiceIngesta] = alimento;
            } 
            // Si ya hay alimentos, concatenar con coma
            else {
                dia[indiceIngesta] = dia[indiceIngesta] + ", " + alimento;
            }
            
            System.out.println("✓ Alimento agregado.");
        }
        
        // Al terminar, mostrar el día actualizado
        mostrarDia(numeroDia, dia);  // ← Llamar al método mostrarDia()
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO 5: Menú de selección de ingestas
    // ═══════════════════════════════════════════════════════════════
    public static void menuIngestas(Scanner scanner, int numeroDia) {
        int opcion = 0;
        
        // WHILE: repetir hasta que el usuario escriba -1
        while (opcion != -1) {
            // Mostrar menú
            System.out.println("\n--------------------------------------------");
            System.out.println("Para seleccionar ingesta:");
            System.out.println("1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
            System.out.println("--------------------------------------------");
            System.out.print("Seleccione una ingesta: ");
            
            // Leer opción
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer
            
            // Si es -1, salir
            if (opcion == -1) {
                break;
            }
            
            // Validar opción
            if (opcion < 1 || opcion > 5) {
                System.out.println("❌ Opción inválida");
                continue;
            }
            
            // Convertir a índice (1-5 → 0-4)
            int indiceIngesta = opcion - 1;
            
            // Llamar al método para agregar alimentos
            agregarAlimentos(scanner, numeroDia, indiceIngesta);
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO 6: Menú principal de días
    // ═══════════════════════════════════════════════════════════════
    public static void menuDias(Scanner scanner) {
        int diaSeleccionado = 0;
        
        // WHILE: repetir hasta que el usuario escriba -1
        while (diaSeleccionado != -1) {
            // Pedir día
            System.out.print("\nSeleccione el dia (1-5) o -1 para salir: ");
            diaSeleccionado = scanner.nextInt();
            scanner.nextLine();
            
            // Si es -1, salir
            if (diaSeleccionado == -1) {
                System.out.println("👋 Saliendo del programa...");
                break;
            }
            
            // Validar día
            if (diaSeleccionado < 1 || diaSeleccionado > 5) {
                System.out.println("❌ Día inválido");
                continue;
            }
            
            // Mostrar el día seleccionado
            String[] dia = obtenerDia(diaSeleccionado);
            mostrarDia(diaSeleccionado, dia);
            
            // Ir al menú de ingestas
            menuIngestas(scanner, diaSeleccionado);
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MÉTODO PRINCIPAL (main)
    // ═══════════════════════════════════════════════════════════════
    // Aquí SOLO está la estructura principal del programa
    // Los detalles están en los otros métodos
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // PASO 1: Pedir nombre del paciente
        System.out.print("Ingrese el nombre del paciente: ");
        nombrePaciente = scanner.nextLine();
        System.out.println();
        
        // PASO 2: Inicializar días
        inicializarDias();  // ← Llamar al método
        
        // PASO 3: Mostrar menú de días
        menuDias(scanner);  // ← Llamar al método
        
        // PASO 4: Cerrar scanner
        scanner.close();
        
        System.out.println("✓ Programa finalizado");
    }
}

/*
═══════════════════════════════════════════════════════════════════
EXPLICACIÓN DEL FLUJO:
═══════════════════════════════════════════════════════════════════

1. main() llama a inicializarDias()
   ↓
2. main() llama a menuDias()
   ↓
3. menuDias() muestra el menú y llama a mostrarDia()
   ↓
4. menuDias() llama a menuIngestas()
   ↓
5. menuIngestas() llama a agregarAlimentos()
   ↓
6. agregarAlimentos() llama a obtenerDia() y mostrarDia()

VENTAJAS:
- main() es MUY corto y fácil de leer
- Cada método hace UNA cosa específica
- Si hay un error, sabes dónde buscarlo
- Puedes reutilizar los métodos

═══════════════════════════════════════════════════════════════════
*/
