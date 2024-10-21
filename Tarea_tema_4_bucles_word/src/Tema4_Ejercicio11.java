import java.util.Scanner;
public class Tema4_Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int palabras=1;
        System.out.println("Introduce una cadena");
        cadena = teclado.nextLine();
        while(cadena.isEmpty())
        {
            System.out.println("La cadena esta vacía, escribeme algo");
            cadena = teclado.nextLine();

        }
        for(int i=0;i<cadena.length();i++)
        {
            if(cadena.charAt(i) == ' ')
            {
                palabras++;
            }
        }
        if(palabras == 1)
        {
            System.out.println("En esa cadena habia "+palabras+" palabra");
        }
        else
        {
            System.out.println("En esa cadena habia "+palabras+" palabras");
        }

    }
}
