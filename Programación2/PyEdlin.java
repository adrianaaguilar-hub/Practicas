package Programación2;
import java.util.Scanner;
public class PyEdlin {
    static String[] lineasEstadoAnterior = new String[10];
        static int lineaActivaAnterior = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] lineas  = new String[10];
        lineas[0] = "Bienvenidos al editor EDLIN";
        lineas[1] = "Utilice el menu inferior para editar el texto";
        lineas[2] = "------";
        lineas[3] = "[L] permite definir la linea activa";
        lineas[4] = "[E] permite editar la linea activa";
        lineas[5] = "[I] permite intercambiar dos lineas";
        lineas[6] = "[B] borra el contenido de la linea activa";
        lineas[7] = "[D] deshace la última acción realizada";
        lineas[8] = "[S] sale del programa";
        lineas[9] = "";

        int lineaActiva = 1;
        boolean usuarioActivo = true;
        String comando;
        

        
        

        do {
            MostrarMenu(lineas, lineaActiva);
            comando = scanner.nextLine();

            switch (comando) {
            case "L" -> {GuardarEstadoAnterior(  lineaActiva,  lineas);
                        lineaActiva = DefinirLineaActiva(lineaActiva, lineas, scanner); }
            case "E" -> {GuardarEstadoAnterior(   lineaActiva,  lineas);
                        EditarLineaActiva(lineaActiva, lineas, scanner);}
            case "I" -> {GuardarEstadoAnterior(   lineaActiva,  lineas);
                        IntercambiarLineaActiva(lineaActiva, lineas, scanner);}
            case "B" -> {GuardarEstadoAnterior(  lineaActiva,  lineas);
                        BorrarContenidoDeLineaActiva(lineaActiva,lineas, scanner);}
            case "D" -> DeshacerUltimaAccion(lineasEstadoAnterior, lineaActiva, lineas, scanner);
            case "S" -> usuarioActivo = false;
            default -> System.out.println("Comando no reconocido");
            }




        } while (usuarioActivo);

        scanner.close(); 
    }

    static void GuardarEstadoAnterior( int lineaActiva, String[] lineas) {
        lineaActivaAnterior = lineaActiva;
        for (int i = 0; i < lineas.length; i++) {
            lineasEstadoAnterior[i] = lineas[i];
        }
    }

    static int DefinirLineaActiva(int lineaActiva, String[] lineas, Scanner scanner){
        
        
        System.out.println("Elije el numero de la linea activa");
        lineaActiva = scanner.nextInt();
        
        return lineaActiva;
    }
    static void EditarLineaActiva (int lineaActiva, String[] lineas,Scanner scanner) {
        System.out.println("Escribe");
        lineas[lineaActiva] = scanner.nextLine();

    }
    static void IntercambiarLineaActiva(int lineaActiva, String[] lineas, Scanner scanner){
        System.out.print("Primera línea: ");
        int lineaInicial = scanner.nextInt();
        System.out.print("Segunda línea: ");
        int lineaAIntercambiar = scanner.nextInt();
        scanner.nextLine();

        String nuevo = lineas[lineaInicial];
        lineas[lineaInicial] = lineas[lineaAIntercambiar];
        lineas[lineaAIntercambiar] = nuevo;                  
    }
    static void BorrarContenidoDeLineaActiva(int lineaActiva, String[] lineas, Scanner scanner){
        lineas[lineaActiva] = " ";
    }
    static void DeshacerUltimaAccion(String[] lineas, Scanner scanner) {
        //Codigo comentado para recordar como funciona un COntrol Z :)
        
        if (lineaActivaAnterior != -1) {  // ¿Hay algo guardado?
            // SÍ hay historial, restáuralo
            for (int i = 0; i < lineas.length; i++) {
                lineas[i] = lineasEstadoAnterior[i];
            }
            System.out.println("✓ Deshecho");
            
            // Ahora que ya lo usaste, bórralo:
            lineaActivaAnterior = -1;  // "Ya no hay historial"
            
        } else {
            // NO hay historial
            System.out.println("No hay nada que deshacer");
        }
    }
    static void MostrarMenu (String[] lineas, int lineaActiva) {
        
        System.out.println("--------------------------------------------------");
        for (int i = 1; i < lineas.length; i++ ) {
            System.out.print( i + ":"  );
            if (i == lineaActiva) {
                System.out.print( " * |" + lineas[i] );
            }   else {
                System.out.print("   |" + lineas[i] );
            }
            System.out.println(
            ); 
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Comandos: [L]inea activa | [E]ditar | [I]ntercambiar | [B]orrar | [D]eshacer | [S]alir");
        System.out.print("Elija una opción: ");
    }



    
}
