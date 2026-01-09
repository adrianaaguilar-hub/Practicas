// package DiaIngestaDieta;
import java.util.Scanner;

public class Ejercicio2_GuardarUnAlimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // EJERCICIO 2: Guardar UN alimento en una posición específica
        








        
        // Crear 5 días con 5 ingestas cada uno (todos empiezan en "Vacio")
        String[] Dia1 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia2 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia3 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia4 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        String[] Dia5 = {"Vacio", "Vacio", "Vacio", "Vacio", "Vacio"};
        
        // Nombres de las ingestas (para mostrar al usuario)
        String[] nombresIngestas = {"Desayuno", "Media mañana", "Almuerzo", "Merienda", "Cena"};
        
        System.out.println("=== EJERCICIO 2: Guardar un alimento ===");
        System.out.println();
        
        // Paso 1: Preguntar qué día
        System.out.print("Seleccione el dia (1-5): ");
        int dia = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer después de leer un número
        
        // Paso 2: Preguntar qué ingesta
        System.out.println("Seleccione la ingesta:");
        System.out.println("1 (Desayuno)");
        System.out.println("2 (Media mañana)");
        System.out.println("3 (Almuerzo)");
        System.out.println("4 (Merienda)");
        System.out.println("5 (Cena)");
        System.out.print("Ingesta: ");
        int ingesta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        // Paso 3: Preguntar qué alimento
        System.out.print("Ingrese el alimento: ");
        String alimento = scanner.nextLine();
        
        // Paso 4: Guardar el alimento en la posición correcta
        // IMPORTANTE: Los arrays empiezan en 0, pero el usuario escribe 1-5
        // Por eso restamos 1 para obtener el índice correcto
        int indiceIngesta = ingesta - 1; // Convertir 1-5 a 0-4
        
        // Ahora guardamos según el día seleccionado
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
        
        System.out.println();
        System.out.println("¡Alimento guardado!");
        System.out.println("Dia " + dia + ", " + nombresIngestas[indiceIngesta] + ": " + alimento);
        System.out.println();
        
        // Mostrar el día completo para verificar
        System.out.println("=== Estado del Dia " + dia + " ===");
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
        }
        
        scanner.close();
    }
}
