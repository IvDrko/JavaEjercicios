public class Lavadora extends Electrodomestico {
    private int carga;


    public Lavadora(double precio_base, String consumo_energetico, int peso, Color colores, int carga) {
        super(precio_base, consumo_energetico, peso, colores);
        this.carga = carga;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return super.toString() + ", carga = "+this.carga+"kg";
    }

    @Override
    public double precioFinal(){
        double precio_final = super.precioFinal();
        if(carga > 6)
        {
            precio_final+=50;
        }
        return precio_final;
    }
}
