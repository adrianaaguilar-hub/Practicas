package Programación2.TresEnRaya.src;
import java.util.Scanner;
public class Coordenada {
    private int fila;
    private int columna;

    public Coordenada (int fila, int columna) {
        assert columna >= 1 && columna <= 3;
        assert fila >= 1 && fila <= 3;


        this.fila = fila;
        this.columna = columna;
    }

    public boolean esValida () {
        boolean columnaValida = this.columna >= 1 && this.columna <= 3;
        boolean filaValida = this.fila >= 1 && this.fila <= 3;

        return columnaValida && filaValida;
    }

    public void pedirCoordenda  () {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce fila (1-3) ");
        this.fila = scanner.nextInt();
        System.out.println("Introduce columna (1-3) ");
        this.columna = scanner.nextInt();
    }    
    
    
}
