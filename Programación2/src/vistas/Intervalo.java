package Programación2.src.vistas;

 class Intervalo {

    private double inferior;
    private double superior;

    public Intervalo (double inferior, double superior) {
        this.inferior = inferior;
        this.superior = superior;
    }
    
    public double longitud () {
        return superior - inferior;
    }


    public void desplazar(double desplazamiento) {
        inferior = inferior + desplazamiento;
        superior = superior + desplazamiento;
    }


    public Intervalo desplazado(double desplazamiento){
        return new Intervalo (inferior + desplazamiento, superior + desplazamiento);
    }
    
    public boolean incluye (double punto) {
        return (punto >= inferior && punto <= superior);
    }

    public boolean igual (Intervalo intervalo) {
        return intervalo.inferior == inferior && intervalo.superior == superior;
    }

    public double puntoMedio () {
        return media() + inferior;
    }

    public double media() {
        return longitud() / 2;
    }

}

// Repasé hoy  ⭐
