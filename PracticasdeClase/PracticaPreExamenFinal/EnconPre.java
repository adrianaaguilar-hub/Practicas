package PracticasdeClase.PracticaPreExamenFinal;

import java.util.Scanner;

public class EnconPre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mapa = {
                { -1, -1, -1, -1 },
                { -1, -1, -1, -1 },
                { -1, -1, -1, -1 },
                { -1, -1, -1, -1 },
        };

        final int SOLDADOS_TOTALES = 5;
        final int TURNOS_TOTALES = 64;
        int turno = 0;
        colocarSoldados(SOLDADOS_TOTALES, mapa);

        boolean seguirJugando = true;
        do {
            imprimir(mapa);
            quitarNiebla(mapa, scanner);
            seguirJugando = turno < TURNOS_TOTALES && ! soldadosEncontrados(SOLDADOS_TOTALES, mapa);
            turno++;

        } while (seguirJugando);

        scanner.close();
    }

    static void imprimir(int[][] mapa) {
        // Imprimir encabezado de columnas (coordenadas X)
        System.out.print("  "); // Espacio para el número de fila
        for (int j = 1; j <= mapa[0].length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        
        // Imprimir línea separadora
        System.out.print("  ");
        for (int j = 0; j < mapa[0].length; j++) {
            System.out.print("--");
        }
        System.out.println();
        
        // Imprimir filas con coordenadas Y
        for (int i = 0; i < mapa.length; i++) {
            System.out.print((i + 1) + "|"); // Número de fila + borde
            
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapear(mapa[i][j]) + " ");
            }
            System.out.println();
        }
    }

    static String mapear(int casilla) {
        String[] simbolos = { "?", "~", "|o/" };
        return casilla < 0 ? simbolos[0] : simbolos[casilla];
    }

    static void quitarNiebla(int[][] mapa, Scanner scanner) {
        int[] coordenada = pedirCoordenadas(scanner, mapa);

        int x = coordenada[0];
        int y = coordenada[1];

        mapa[y][x] = mapa[y][x] < 0 ? mapa[y][x] * -1 : mapa[y][x];
    }

    static int[] pedirCoordenadas(Scanner scanner, int[][] mapa) {
        System.out.println("Coordenada x:");
        int x = scanner.nextInt() - 1;
        System.out.println("Coordenada y:");
        int y = scanner.nextInt() - 1;

        return new int[] { x, y };
    }

    static void colocarSoldados(int cantidad, int[][] mapa) {
        int colocados = 0;
        boolean completado = true;
        

        do {
            int x = (int)(Math.random() * mapa.length);
            int y = (int)(Math.random() * mapa.length);

            if (mapa[y][x] != -2) {
                mapa[y][x] = -2;
            colocados++;
            }
            completado = colocados < cantidad ? true : false;
        } while (completado);

    }

    static boolean soldadosEncontrados (final int SOLDADOS_TOTALES, int[][] mapa) {
        int encontrados = 0;
        for (int i = 0; i < mapa.length; i++) {
            for(int j = 0; j < mapa[i].length; j++){
                if (mapa[i][j] == 2) {
                    encontrados++;
                }
            }
        }
        
        return encontrados == SOLDADOS_TOTALES;
    }
}
