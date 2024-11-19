public class Electrodomestico {
     public enum Color{
        blanco, negro, plateado, rojo, azul, gris
    }
    protected double precio_base;
    protected String consumo_energetico;
    protected int peso;
    protected Color colores;

    public Electrodomestico() {
        this.precio_base = 100;
        this.consumo_energetico="A";
        this.peso=10;
        this.colores = Color.blanco;
    }

    public Electrodomestico(double precio_base, String consumo_energetico, int peso, Color colores) {
        this.precio_base = precio_base;
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
        this.colores = colores;
    }

    private String comprobarConsumoEnergetico(String letra){
        if (!letra.equals("A+") && !letra.equals("A") && !letra.equals("B") && !letra.equals("C") && !letra.equals("D") && !letra.equals("E") && !letra.equals("F")) {
            letra = "A";
        }
        return letra;
    }

    public double precioFinal(){
        int suma=0;
        double precio_final;
        switch (this.consumo_energetico)
        {
            case "A+":
                suma+=120;
                break;
            case "A":
                suma+=100;
                break;
            case "B":
                suma+=80;
                break;
            case "C":
                suma+=60;
                break;
            case "D":
                suma+=50;
                break;
            case "E":
                suma+=30;
                break;
            case "F":
                suma+=10;
                break;
        }
        if(this.peso > 80){
            suma+=100;
        }
        else if(this.peso > 50){
            suma+=50;
        }
        else if(this.peso > 20){
            suma+=30;
        }
        else if(this.peso > 0)
        {
            suma+=10;
        }
        precio_final = this.precio_base + suma;
        return precio_final;

    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Color getColores() {
        return colores;
    }

    public void setColores(Color colores) {
        this.colores = colores;
    }

    @Override
    public String toString() {
        return "Precio base: "+getPrecio_base()+"€"+" Color "+getColores()+" Consumo energetico: "+getConsumo_energetico()+" peso: "+getPeso()+"kg";
    }
}
