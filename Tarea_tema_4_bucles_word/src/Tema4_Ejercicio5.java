import java.util.Scanner;
public class Tema4_Ejercicio5 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una cadena:");
        cadena = teclado.nextLine();
        boolean palindromo = true;
        for (int i = 0; i < cadena.length() / 2; i++)
        {
            if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i))
            {
                palindromo = false;
            }
        }
        if(palindromo)
        {
            System.out.println("Es palindromo");
        }
        else
        {
            System.out.println("No es palindromo");
        }
    }
}
