import java.util.Scanner;
import java.util.Random;
public class Tema4_Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int media=0;
        int num_random = aleatorio.nextInt(100)+1;
        for(int i=0; i<10; i++)
        {
            media+= num_random;
            num_random = aleatorio.nextInt(100)+1;
        }
        media /=10;
        System.out.println(media);
    }
}
