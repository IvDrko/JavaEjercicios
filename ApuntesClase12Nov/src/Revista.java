public class Revista extends Publicacion{
    private String mes;

    public Revista(String t1, int mp, String mes) {
        super(t1, mp);
        this.mes = mes;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Mes: "+this.mes);
    }
}
