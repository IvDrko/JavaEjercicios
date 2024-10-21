import java.util.Scanner;
public class Tema4_Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena: ");
        cadena = teclado.nextLine();
        int contador=0;
        for(int i=0; i<cadena.length();i++)
        {
            if(cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o' &&
                    cadena.charAt(i) != 'u' && cadena.charAt(i) != 'A' && cadena.charAt(i) != 'E' && cadena.charAt(i) != 'I'
                    && cadena.charAt(i) != 'O' && cadena.charAt(i) != 'U'&& cadena.charAt(i) != ' ')
            {
                contador++;
            }
        }
        System.out.println("En la cadena hay "+contador+" consonantes");
    }
}
