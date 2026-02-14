package Programacion1.PracticasdeClase.Matrices.PracticaPreExamenFinal;

import java.util.Scanner;

// CÓDIGO ORIGINAL DEL PROFESOR - PARA REFERENCIA
// Este es el código que vieron en clase
// Úsalo para comparar con tu versión

class RescateOriginal {

    public static void main(String[] args) {
        int[][] escenario = {
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1 },
        };
        final int NUMERO_SOLDADOS = 1;
        colocarSoldados(NUMERO_SOLDADOS, escenario);

        final int TOTAL_TURNOS = 5;
        boolean seguirJugando = true;

        int turno = 0;
        do {
            imprimir(escenario);
            despejar(escenario);
            boolean halladosTodos = contarEncontrados(escenario, NUMERO_SOLDADOS);
            turno = turno + 1;
            seguirJugando = turno < TOTAL_TURNOS && !halladosTodos;
        } while (seguirJugando);
        System.out.println("Se acabaron los turnos!");

    }

    static boolean contarEncontrados(int[][] escenario, int cantidad) {
        int soldadosEncontrados = 0;
        for (int i = 0; i < escenario.length; i++) {
            for (int j = 0; j < escenario[i].length; j++) {
                if (escenario[i][j] == 2) {
                    soldadosEncontrados = soldadosEncontrados + 1;
                }
            }
        }
        return soldadosEncontrados == cantidad;
    }

    static void despejar(int[][] escenario) {
        int[] coordenada = elegirPosicion(escenario);

        int x = coordenada[1];
        int y = coordenada[0];

        escenario[y][x] = escenario[y][x] < 0 ? escenario[y][x] * -1 : escenario[y][x];
    }

    static int[] elegirPosicion(int[][] escenario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa coordenada X: ");
        int x = scanner.nextInt();
        System.out.println("Ingresa coordenada Y: ");
        int y = scanner.nextInt();
        scanner.close();

        return new int[] { y, x };

    }

    static void colocarSoldados(int numero, int[][] escenario) {
        boolean terminado = false;
        int soldadoColocado = 0;
        do {
            int x = (int) (Math.random() * escenario.length);
            int y = (int) (Math.random() * escenario.length);
            if (escenario[x][y] != -2) {
                escenario[x][y] = -2;
                soldadoColocado = soldadoColocado + 1;
            }
            terminado = soldadoColocado >= numero;
        } while (!terminado);

    }

    static void imprimir(int[][] escenario) {
        System.out.println("     0  1  2  3  4  5  6  7 ");
        System.out.println("--+-------------------------");
        for (int i = 0; i < escenario.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < escenario[i].length; j++) {
                System.out.print(mapear(escenario[i][j]));
            }
            System.out.println();
        }
    }

    static String mapear(int tile) {
        final String[] TILES = { " ? ", "~~~", "\\O/" };
        return tile < 0 ? TILES[0] : TILES[tile];
    }

}
