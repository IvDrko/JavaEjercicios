import java.util.Scanner;
public class Tema4_Ejercicio2 {
    // Ejercicio 2
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena;
        cadena = teclado.nextLine();
        String letras;
        System.out.println("Ahora una letra: ");
        letras = teclado.nextLine();
        char letra = letras.charAt(0);
        int contador_2 = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador_2++;
            }
        }
        System.out.println("Tu letra "+letra+" ha aparecido en la frase "+cadena+" "+contador_2+" veces");
    }
}
