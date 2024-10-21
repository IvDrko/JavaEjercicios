import java.util.Scanner;
import java.util.Random;
public class Tema4_Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int num_random = aleatorio.nextInt(100) + 1;
        int num_usuario;

        System.out.println("Adivina el numero de 1 entre 100");

        do {
            num_usuario = teclado.nextInt();
            if (num_usuario < 1 || num_usuario > 100) {
                System.out.println("Error, introduce un numero entre 1 y 100");
            } else if (num_usuario != num_random) {
                System.out.println("Sigue probando");
            }
        } while (num_usuario != num_random);

        System.out.println("Enhorabuena");
    }
}
