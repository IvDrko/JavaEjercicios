public class Television extends Electrodomestico {
    private int resolucion;
    private boolean Netflix;

    public Television(){
        super();
        this.resolucion = 20;
        this.Netflix=false;
    }

    public Television(double precio_base, String consumo_energetico, int peso, Color colores, int resolucion, boolean netflix) {
        super(precio_base, consumo_energetico, peso, colores);
        this.resolucion = resolucion;
        Netflix = netflix;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isNetflix() {
        return Netflix;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setNetflix(boolean netflix) {
        Netflix = netflix;
    }

    @Override
    public String toString() {
        String netflixdescripcion= this.Netflix ? "con Netflix" : "sin Netflix";
        return super.toString()+" resolucion: "+this.resolucion+" pulgadas"+" Netflix: "+ netflixdescripcion;
    }

    @Override
    public double precioFinal() {
        double precio_final= super.precioFinal();
        if(this.resolucion>20)
        {
            precio_final+= precio_base*0.3;
        }
        if(this.Netflix)
        {
            precio_final+=60;
        }
        return precio_final;
    }
}
