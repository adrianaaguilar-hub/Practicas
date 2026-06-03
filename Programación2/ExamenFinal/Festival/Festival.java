package Programación2.ExamenFinal.Festival;

public class Festival {
    private double precioEntrada = 50.0;
    private boolean accesoPiscina = true;
    private boolean barraLibre = true;
    private EntradaFestival entradas = new EntradaFestival [3];

    entradas [0] = new EntradaGeneral (Dany, precioBase, accesoPiscina);
    entradas [1] = new EntradaVIP (Mariela, precioBase, accesoPiscina, barraLibre);
    entradas [2] = new EntradaGeneral (Martin, precioBase, accesoPiscina, barraLibre);

    public double calcularPrecioFinal (EntradaFestival entradas) {
        double sumaTotal = 0.0;
        for (int i = 0; i < pedido.length; i ++) {
            sumaTotal = sumaTotal + pedido[i].calcularPrecioFinal();
        }
        return sumaTotal;
    }
    }
}
