/*
═══════════════════════════════════════════════════════════════════
    EJERCICIO DE REPASO: Sistema de Calificaciones
═══════════════════════════════════════════════════════════════════

OBJETIVO:
Crear un programa que gestione las calificaciones de 3 estudiantes
en 4 materias. Usar métodos static, Arrays, y todo lo aprendido.

CONCEPTOS QUE PRACTICARÁS:
✓ Métodos static
✓ Arrays y matrices
✓ Arrays.fill(), Arrays.toString()
✓ While loops
✓ .equals() para comparar strings
✓ Scanner para leer datos

NIVEL: ⭐⭐ (Fácil-Medio, es un repaso, no te estresarás)

═══════════════════════════════════════════════════════════════════
*/

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioRepaso_SistemaCalificaciones {
    
    // ═══════════════════════════════════════════════════════════════
    // VARIABLES GLOBALES
    // ═══════════════════════════════════════════════════════════════
    static String[] estudiantes = {"Ana", "Luis", "María"};
    static String[] materias = {"Matemáticas", "Historia", "Ciencias", "Inglés"};
    static double[][] calificaciones = new double[3][4];  // 3 estudiantes, 4 materias
    
    // ═══════════════════════════════════════════════════════════════
    // TODO 1: Crear método para inicializar calificaciones
    // ═══════════════════════════════════════════════════════════════
    // Nombre: inicializarCalificaciones
    // Parámetros: ninguno
    // Retorno: void
    // Qué hace: Usa Arrays.fill() para llenar cada fila con 0.0
    
    public static void inicializarCalificaciones() {
        // TU CÓDIGO AQUÍ
        // Pista: for (int i = 0; i < 3; i++) { Arrays.fill(...) }
        System.out.println("Calificaciones:");
        for (int i = 0; i < 3; i++) {
            

                Arrays.fill (calificaciones[i], 0.0);
            
        
        
    }
        
    }
    
    // ═══════════════════════════════════════════════════════════════
    // TODO 2: Crear método para mostrar calificaciones de un estudiante
    // ═══════════════════════════════════════════════════════════════
    // Nombre: mostrarCalificaciones
    // Parámetros: int indiceEstudiante (0, 1, o 2)
    // Retorno: void
    // Qué hace: Muestra el nombre y todas sus calificaciones
    
    public static void mostrarCalificaciones(int indiceEstudiante) {
        // TU CÓDIGO AQUÍ

        System.out.println();
        // Ejemplo de salida:
        // Estudiante: Ana
        // Matemáticas: 8.5
        // Historia: 7.0
        // Ciencias: 9.0
        // Inglés: 8.0
        
        
        
        
    }
    
    // ═══════════════════════════════════════════════════════════════
    // TODO 3: Crear método para ingresar calificación
    // ═══════════════════════════════════════════════════════════════
    // Nombre: ingresarCalificacion
    // Parámetros: Scanner scanner, int indiceEstudiante, int indiceMateria
    // Retorno: void
    // Qué hace: Pide una calificación y la guarda en calificaciones[estudiante][materia]
    
    public static void ingresarCalificacion(Scanner scanner, int indiceEstudiante, int indiceMateria) {
        // TU CÓDIGO AQUÍ
        // Pista: System.out.print("Ingrese calificación: ");
        //        double nota = scanner.nextDouble();
        //        calificaciones[indiceEstudiante][indiceMateria] = nota;
        
        
        
        
    }
    
    // ═══════════════════════════════════════════════════════════════
    // TODO 4: Crear método para calcular promedio de un estudiante
    // ═══════════════════════════════════════════════════════════════
    // Nombre: calcularPromedio
    // Parámetros: int indiceEstudiante
    // Retorno: double (el promedio)
    // Qué hace: Suma las 4 calificaciones y divide entre 4
    
    public static double calcularPromedio(int indiceEstudiante) {
        // TU CÓDIGO AQUÍ
        // Pista: double suma = 0;
        //        for (int i = 0; i < 4; i++) { suma += calificaciones[...][...]; }
        //        return suma / 4;
        
        
        
        
        return 0.0;  // Cambiar esto
    }
    
    // ═══════════════════════════════════════════════════════════════
    // TODO 5: Crear método del menú principal
    // ═══════════════════════════════════════════════════════════════
    // Nombre: menu
    // Parámetros: Scanner scanner
    // Retorno: void
    // Qué hace: Muestra opciones y llama a los otros métodos
    
    public static void menu(Scanner scanner) {
        String opcion = "";
        
        while (!opcion.equals("4")) {  // Repetir hasta que elija "4" (salir)
            // Mostrar menú
            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Ingresar calificación");
            System.out.println("2. Ver calificaciones");
            System.out.println("3. Ver promedio");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextLine();
            
            // TU CÓDIGO AQUÍ
            // Usa if-else con opcion.equals("1"), opcion.equals("2"), etc.
            // Para cada opción:
            // - Pide el número de estudiante (1-3)
            // - Convierte a índice (1-3 → 0-2)
            // - Llama al método correspondiente
            
            
            
            
        }
        
        System.out.println("¡Hasta luego!");
    }
    
    // ═══════════════════════════════════════════════════════════════
    // MAIN - YA ESTÁ HECHO (no lo cambies)
    // ═══════════════════════════════════════════════════════════════
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("═══════════════════════════════════════");
        System.out.println("  SISTEMA DE CALIFICACIONES");
        System.out.println("═══════════════════════════════════════");
        
        // Inicializar
        inicializarCalificaciones();
        
        // Mostrar menú
        menu(scanner);
        
        scanner.close();
    }
}

/*
═══════════════════════════════════════════════════════════════════
INSTRUCCIONES:
═══════════════════════════════════════════════════════════════════

1. Lee cada TODO con atención
2. Completa los métodos uno por uno
3. Prueba cada método después de completarlo
4. Si te atascas, revisa los ejemplos en DiaDietaIngestaVersionIII_CON_METODOS.java

PISTAS ADICIONALES:

TODO 1: 
for (int i = 0; i < 3; i++) {
    Arrays.fill(calificaciones[i], 0.0);
}

TODO 2:
System.out.println("Estudiante: " + estudiantes[indiceEstudiante]);
for (int i = 0; i < 4; i++) {
    System.out.println(materias[i] + ": " + calificaciones[indiceEstudiante][i]);
}

TODO 3:
System.out.print("Ingrese calificación de " + materias[indiceMateria] + ": ");
double nota = scanner.nextDouble();
scanner.nextLine(); // Limpiar buffer
calificaciones[indiceEstudiante][indiceMateria] = nota;

TODO 4:
double suma = 0;
for (int i = 0; i < 4; i++) {
    suma += calificaciones[indiceEstudiante][i];
}
return suma / 4;

TODO 5:
if (opcion.equals("1")) {
    System.out.print("Estudiante (1-Ana, 2-Luis, 3-María): ");
    int est = scanner.nextInt() - 1;
    System.out.print("Materia (1-Mat, 2-Hist, 3-Cien, 4-Ing): ");
    int mat = scanner.nextInt() - 1;
    scanner.nextLine();
    ingresarCalificacion(scanner, est, mat);
}

═══════════════════════════════════════════════════════════════════
EJEMPLO DE USO:
═══════════════════════════════════════════════════════════════════

========== MENÚ ==========
1. Ingresar calificación
2. Ver calificaciones
3. Ver promedio
4. Salir
Opción: 1

Estudiante (1-Ana, 2-Luis, 3-María): 1
Materia (1-Mat, 2-Hist, 3-Cien, 4-Ing): 1
Ingrese calificación de Matemáticas: 8.5
✓ Calificación guardada

========== MENÚ ==========
1. Ingresar calificación
2. Ver calificaciones
3. Ver promedio
4. Salir
Opción: 2

Estudiante (1-Ana, 2-Luis, 3-María): 1

Estudiante: Ana
Matemáticas: 8.5
Historia: 0.0
Ciencias: 0.0
Inglés: 0.0

═══════════════════════════════════════════════════════════════════
¡ÉXITO EN TU REPASO! 🎉
═══════════════════════════════════════════════════════════════════
*/
