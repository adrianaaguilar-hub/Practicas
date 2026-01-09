
import java.util.Scanner;

public class Ejercicio2Practica_GuardarUnAlimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String DESAYUNO_COMIDA = "Desayuno";
        final String MERIENDA_MAÑANA_COMIDA = "Merienda de mañana";
        final String ALMUERZO_COMIDA = "Almuerzo";
        final String MERIENDA_TARDE_COMIDA = "Merienda de tarde";
        final String CENA_COMIDA = "Cena";

        final int DESAYUNO_NUMERO = 0;
        final int MERIENDA_MAÑANA_NUMERO = 1;
        final int ALMUERZO_NUMERO = 2;
        final int MERIENDA_TARDE_NUMERO = 3;
        final int CENA_NUMERO = 4;

        String[] Dia1 = { "Vacio", "Vacio", "Vacio", "Vacio", "Vacio" };
        String[] Dia2 = { "Vacio", "Vacio", "Vacio", "Vacio", "Vacio" };
        String[] Dia3 = { "Vacio", "Vacio", "Vacio", "Vacio", "Vacio" };
        String[] Dia4 = { "Vacio", "Vacio", "Vacio", "Vacio", "Vacio" };
        String[] Dia5 = { "Vacio", "Vacio", "Vacio", "Vacio", "Vacio" };

        String[] Comida = { "Desayuno", "Merienda", "Almuerzo", "Merienda", "Cena" };

        System.out.print("Seleccione el dia (1-5): ");
        int diaUsuario = scanner.nextInt();
        scanner.nextLine();

        if (diaUsuario == 1) {
            System.out.println("===== Dia " + diaUsuario + ":");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia1[i]);
                System.out.println();
            }
        } else if (diaUsuario == 2) {
            System.out.println("===== Dia " + diaUsuario + ":");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia2[i]);
                System.out.println();
            }
        } else if (diaUsuario == 3) {
            System.out.println("===== Dia " + diaUsuario + ":");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia3[i]);
                System.out.println();
            }
        } else if (diaUsuario == 4) {
            System.out.println("===== Dia " + diaUsuario + ":");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia4[i]);
                System.out.println();
            }
        } else {
            System.out.println("===== Dia " + diaUsuario + ":");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia5[i]);
                System.out.println();
            }
        }
       
        System.out.println();
        System.out.println("===== Para ingresar ingesta de dia " + diaUsuario + " =====");
        System.out.println("Precionar (0) para " + DESAYUNO_COMIDA);
        System.out.println("Precionar (1) para " + MERIENDA_MAÑANA_COMIDA);
        System.out.println("Precionar (2) para " + ALMUERZO_COMIDA);
        System.out.println("Precionar (3) para " + MERIENDA_TARDE_COMIDA);
        System.out.println("Precionar (4) para " + CENA_COMIDA);
        System.out.print("Ingresar numero: ");


        int comidaUsuario = scanner.nextInt();
        scanner.nextLine();
        String ingestaUsuario;
        if (comidaUsuario == DESAYUNO_NUMERO) {
            System.out.println("Ingrese la ingesta de su " + DESAYUNO_COMIDA  + ": ");
            ingestaUsuario = scanner.nextLine();
            Dia1[DESAYUNO_NUMERO] = ingestaUsuario;
            System.out.println();
            System.out.println("===== Dia 0:");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia1[i]);
                System.out.println();
            }

        } else if (comidaUsuario == 1) {
             System.out.println("Ingrese la ingesta de su " + MERIENDA_MAÑANA_COMIDA  + ": ");
            ingestaUsuario = scanner.nextLine();
            Dia1[MERIENDA_MAÑANA_NUMERO] = ingestaUsuario;
            System.out.println();
            System.out.println("===== Dia 1:");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia1[i]);
                System.out.println();
            }

        } else if (comidaUsuario == 2) {
            System.out.println("Ingrese la ingesta de su " + ALMUERZO_COMIDA  + ": ");
            ingestaUsuario = scanner.nextLine();
            Dia1[ALMUERZO_NUMERO] = ingestaUsuario;
            System.out.println();
            System.out.println("===== Dia 2:");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia1[i]);
                System.out.println();
            }

        } else if (comidaUsuario == 3) {
            System.out.println("Ingrese la ingesta de su " + MERIENDA_TARDE_COMIDA);
            ingestaUsuario = scanner.nextLine();
            Dia1[MERIENDA_TARDE_NUMERO] = ingestaUsuario;
            System.out.println();
            System.out.println("===== Dia 3:");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia1[i]);
                System.out.println();
            }

        } else {
            System.out.println("Ingrese la ingesta de su " + CENA_COMIDA + ": ");
            ingestaUsuario = scanner.nextLine();
            Dia1[CENA_NUMERO] = ingestaUsuario;
            System.out.println();
            System.out.println("===== Dia 4:");
            for (int i = 0; i < 5; i++) {
                System.out.print(Comida[i] + ": " + Dia1[i]);
                System.out.println();
            }
        }

        
        scanner.close();
    }
}
