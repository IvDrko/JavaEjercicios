import java.util.Scanner;
public class Tema4_Ejercicio1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena: ");
        cadena = teclado.nextLine();
        int tam_cadena = cadena.length();
        int contador=0;
        for(int i=0;i<tam_cadena;i++)
        {
            contador++;
        }
        System.out.println(contador);

    }
}