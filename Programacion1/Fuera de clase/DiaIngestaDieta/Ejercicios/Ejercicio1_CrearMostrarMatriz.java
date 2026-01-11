
public class Ejercicio1_CrearMostrarMatriz {
    public static void main(String[] args) {
        // EJERCICIO 1: Crear y mostrar una matriz simple
        // Objetivo: Crear 5 días con 5 ingestas cada uno y mostrarlos
        
        // Crear 5 arrays (uno por cada día)
        String[] Dia1 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia2 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia3 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia4 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia5 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        
        // Nombres de las ingestas
        String[] nombresIngestas = {"Desayuno", "Media mañana", "Almuerzo", "Merienda", "Cena"};
        
        System.out.println("=== EJERCICIO 1: Mostrar la matriz ===");
        System.out.println();
        
        // Mostrar Día 1
        System.out.println("Dia 1:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia1[i]);
        }
        System.out.println();
        
        // Mostrar Día 2
        System.out.println("Dia 2:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia2[i]);
        }
        System.out.println();
        
        // Mostrar Día 3
        System.out.println("Dia 3:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia3[i]);
        }
        System.out.println();
        
        // Mostrar Día 4
        System.out.println("Dia 4:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia4[i]);
        }
        System.out.println();
        
        // Mostrar Día 5
        System.out.println("Dia 5:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + nombresIngestas[i] + ": " + Dia5[i]);
        }
    }
}
