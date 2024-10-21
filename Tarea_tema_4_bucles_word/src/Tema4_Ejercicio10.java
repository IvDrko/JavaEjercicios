import java.util.Scanner;
public class Tema4_Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena, introduce 'salir' para finalizar ");
        cadena = teclado.nextLine();
        int contador=0;
        int max_size = cadena.length();
        while(!cadena.equals("salir"))
        {
            contador++;
            cadena = teclado.nextLine();
            if(max_size < cadena.length())
            {
                max_size = cadena.length();
            }
        }
        System.out.println("Ingresaste "+contador+" cadenas y la mas grande tuvo "+max_size+" caracteres");
    }
}
