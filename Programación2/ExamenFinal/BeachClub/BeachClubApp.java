package Programación2.ExamenFinal.BeachClub;

public class BeachClubApp {
    public static void main(String[] args) {
        boolean esGrande = true;
        boolean esPequeño = false;
        boolean esVegano = true;
        boolean noVegano = false;

        Consumcion[] pedido = new Consumcion [3];

        pedido[0] = new BebidaBrunch("Matcha Latte Helado", 4.00, esGrande);
        pedido[1] = new BebidaBrunch("Aperol Spritz", 7.00, esPequeño);
        pedido[2] = new PlatoBrunch("Acai Bowl", 8.50, esGrande, esVegano);
    
        double totalCuenta = calcularTotalPedido(pedido);

        System.out.println("Total a pagar por el brunch: " + totalCuenta + "$");
    }

    private static double calcularTotalPedido (Consumcion[] pedido) {
        double sumaTotal = 0.0;
        for (int i = 0; i < pedido.length; i ++) {
            sumaTotal = sumaTotal + pedido[i].calcularPrecioFinal();
        }
        return sumaTotal;
    }
}
