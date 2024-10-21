import java.util.Random;
import java.util.Scanner;
public class Tema4_Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int num_random = aleatorio.nextInt(10) + 1;
        int num_usuario;

        System.out.println("Adivina el numero de 1 entre 10");

        do {
            num_usuario = teclado.nextInt();
            if (num_usuario < 1 || num_usuario > 10) {
                System.out.println("Error, introduce un numero entre 1 y 10");
            } else if (num_usuario != num_random) {
                System.out.println("Sigue probando");
            }
        } while (num_usuario != num_random);

        System.out.println("Enhorabuena");
    }
}
