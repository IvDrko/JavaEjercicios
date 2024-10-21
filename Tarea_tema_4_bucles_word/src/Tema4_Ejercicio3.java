import java.util.Scanner;

public class Tema4_Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        // Ejercicio 3
        System.out.println("Otra cadenita mas: ");
        cadena = teclado.nextLine();
        String cadena_inv ="";
        for(int i=cadena.length()-1;i>=0;i--)
        {
            cadena_inv += cadena.charAt(i);
        }
        System.out.println("La cadena invertida es: "+ cadena_inv);
    }

}

