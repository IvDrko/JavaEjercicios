public class Publicacion {
    protected String titulo;
    protected int numPag;

    public Publicacion(String t1, int mp)
    {
        this.titulo = t1;
        this.numPag = mp;
    }
    public void mostrarInformacion(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("numPag: "+this.numPag);
    }
}
