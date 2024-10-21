import java.util.Scanner;
public class Tema4_Ejercicio14 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        String nueva_cadena="";
        System.out.println("Introduce una cadena");
        cadena = teclado.nextLine();

        for(int i=0; i<cadena.length();i++)
        {
            if (cadena.charAt(i) >='a' && cadena.charAt(i)<='z')
            {
                char minus =(char) (cadena.charAt(i) - 32);
                nueva_cadena += minus;
            }
            else if(cadena.charAt(i) == ' ')
            {
                nueva_cadena += ' ';
            }
            else
            {
                char mayus = (char) (cadena.charAt(i) + 32);
                nueva_cadena += mayus;
            }
        }
        System.out.println(nueva_cadena);
    }
}
// Otra manera hubiera sido usando la clase Character de Java con Character.isLowerCase(cadena.charAt(i)) para comprobar si es minuscula y isUpperCase para saber si es mayuscula, tambien te permite hacer el cambio directamente sin tener que restar ni sumar 32, pero vi esta manera de primeras y ya la hice asi.
