import java.util.Scanner;
import java.util.Random;
public class Tema4_Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Ejercicio 4
        System.out.println("Dime una longitud: ");
        Random num_random = new Random();
        String nueva_cadena_="";
        int n = teclado.nextInt();
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<n;i++)
        {
            char letra = abecedario.charAt(num_random.nextInt(abecedario.length()));
            nueva_cadena_+= letra;
        }
        System.out.println(nueva_cadena_);
    }
}
