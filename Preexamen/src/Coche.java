 import java.util.Scanner;
public class Coche extends Vehiculo {
    private int numPuertas;
    Coche(String marca, String modelo, int numPuertas){
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas: "+ this.numPuertas);
    }

    @Override
    public void encenderMotor(){
        System.out.println("Motor encendido");
    }
    public void abrirPuertas(){
        for(int i=1;i<=numPuertas;i++)
        {
            System.out.println("Abriendo puerta "+i);
        }
        if(numPuertas>2)
        {
            System.out.println("El coche tiene más de 2 puertas");

        }
    }
    public static Coche crearCochePorConsola(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Marca del coche?");
        String marca = teclado.nextLine();
        System.out.println("Modelo del coche?");
        String modelo = teclado.nextLine();
        System.out.println("Num de puertas?");
        int numpuertas = teclado.nextInt();
        teclado.close();
        return new Coche(marca, modelo, numpuertas);

    }
}
