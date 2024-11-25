abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public abstract void encenderMotor();
    public void mostrarDetalles(){
        System.out.println("Marca: "+this.marca+" Modelo: "+this.modelo);
    }

}
