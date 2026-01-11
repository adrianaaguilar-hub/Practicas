package Programacion1.PracticasdeClase;

public class Rescate {
    public static void main(String[] args) {
        
        int superficie [] [] = {
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
        {0,0,0,0,0,0,0,0,},
    };

    int[] posicionSoldado = {0,1};
    int[] niebla = {0,1};
       
    


    }


    static boolean haySoldados(int[][] superficie) {
        for (int i = 0; i < superficie.length; i++) {
            for (int j = 0; j < superficie[i].length; j++) {
                if (superficie[i][j] > 0) {
                    return (true);
                }
            }
        }
        return (false);
    }

    static void imprimirEscenario(int[][] superficie) {

        imprimirBordeHorizontal(superficie[0].length);
        for (int fila = 0; fila < superficie.length; fila++) {
            imprimirBordeVertical();

            for (int columna = 0; columna < superficie[fila].length; columna++) {

               
                    int mapita = superficie[fila][columna];
                    System.out.print(mapita); // mapear(mapita);
                

            }
            imprimirBordeVertical();
            System.out.println();
        }
        imprimirBordeHorizontal(superficie[0].length);
        
        // System.out.println(posicionGatoAspiradora(posicionGato, posicionAspiradora, superficie));
    }

    static void imprimirBordeHorizontal(int length) {
        System.out.println("===".repeat(length));
    }

    static void imprimirBordeVertical() {
        System.out.print("|");
    }    

    static String MapearSuperficie (int mapita) {

        if (mapita == -1) {
            return "###"; 
        }
        
        String[] estadoSoldado = {
          
            " ~ ",
            "|o/"
        };
        return estadoSoldado[mapita];
    }

        static void ensuciarEscenario(int[][] superficie) {
        
        superficie[1][1] = -1;  
        superficie[1][2] = -1;  
        superficie[3][5] = -1;  
        superficie[5][8] = -1;  
        superficie[5][9] = -1;  
        
        
        for (int fila = 0; fila < superficie.length; fila++) {
            for (int columna = 0; columna < superficie[fila].length; columna++) {
                if (superficie[fila][columna] != -1) {  
                    superficie[fila][columna] = (int) (Math.random() * 5);
                }
            }
        }
    }

}

  
