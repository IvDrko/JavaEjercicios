import java.util.Scanner;
public class Tema4_Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String option;
        String cadena;
        do {
            System.out.println("Elige opcion");
            System.out.println("1.Contar caracteres");
            System.out.println("2.Invertir cadena");
            System.out.println("salir");

            option = teclado.nextLine();

            while (!option.equals("1") && !option.equals("2") && !option.equals("salir"))
            {
                System.out.println("Debes introducir una opcion valida (1,2 o salir)");
                option = teclado.nextLine();
            }
            switch (option)
            {
                case "1":
                    System.out.println("Introduce una cadena: ");
                    cadena = teclado.nextLine();
                    int contador = 0;
                    for (int i = 0; i < cadena.length(); i++)
                    {
                        contador++;
                    }
                    System.out.println("La cadena tenia " + contador + " caracteres");
                    break;
                case "2":
                    System.out.println("Otra cadenita mas: ");
                    cadena = teclado.nextLine();
                    String cadena_inv = "";
                    for (int i = cadena.length() - 1; i >= 0; i--)
                    {
                        cadena_inv += cadena.charAt(i);
                    }
                    System.out.println("La cadena invertida es: " + cadena_inv);
                    break;
            }
        }while(!option.equals("salir"));
    }
}
