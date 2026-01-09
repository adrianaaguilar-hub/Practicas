// package DiaIngestaDieta;
import java.util.Scanner;

public class Ejercicio3_MostrarDiaCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // EJERCICIO 3: Mostrar un día completo
        // Objetivo: Dado un número de día, mostrar todas sus ingestas
        
        // Crear 5 días con algunos datos de ejemplo
        String[] Dia1 = {"Café con leche", "Fruta", "Pasta", "Yogurt", "Ensalada"};
        String[] Dia2 = {"Tostadas", "Vacio", "Pollo", "Vacio", "Pescado"};
        String[] Dia3 = {"Cereales", "Sandwich", "Arroz", "Galletas", "Sopa"};
        String[] Dia4 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia5 = {"Huevos", "Batido", "Vacio", "Frutos secos", "Pizza"};
        
        // Nombres de las ingestas
        String[] nombresIngestas = {"Desayuno", "Media mañana", "Almuerzo", "Merienda", "Cena"};
        
        System.out.println("=== EJERCICIO 3: Mostrar un día completo ===");
        System.out.println();
        
        // Preguntar qué día quiere ver
        System.out.print("¿Qué día desea ver? (1-5): ");
        int dia = scanner.nextInt();
        
        System.out.println();
        System.out.println("=== Dia " + dia + " ===");
        
        // Mostrar todas las ingestas del día seleccionado
        if (dia == 1) {
            for (int i = 0; i < 5; i++) {
                System.out.println(nombresIngestas[i] + ": " + Dia1[i]);
            }
        } else if (dia == 2) {
            for (int i = 0; i < 5; i++) {
                System.out.println(nombresIngestas[i] + ": " + Dia2[i]);
            }
        } else if (dia == 3) {
            for (int i = 0; i < 5; i++) {
                System.out.println(nombresIngestas[i] + ": " + Dia3[i]);
            }
        } else if (dia == 4) {
            for (int i = 0; i < 5; i++) {
                System.out.println(nombresIngestas[i] + ": " + Dia4[i]);
            }
        } else if (dia == 5) {
            for (int i = 0; i < 5; i++) {
                System.out.println(nombresIngestas[i] + ": " + Dia5[i]);
            }
        } else {
            System.out.println("Día inválido. Debe ser entre 1 y 5.");
        }
        
        scanner.close();
    }
}
