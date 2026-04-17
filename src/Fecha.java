public class Fecha {
    private int dia;
    private int mes;
    private int anno;

    public Fecha(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    public boolean esIgual(Fecha otraFecha) {
        assert otraFecha != null;
        return this.dia == otraFecha.dia && 
               this.mes == otraFecha.mes && 
               this.anno == otraFecha.anno;
    }

    public void mostrar() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.anno);
    }
}