import java.util.Scanner;
public class Tema4_Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entero;
        System.out.println("Introduce un entero");
        entero = teclado.nextInt();
        entero = Math.abs(entero);
        int contador=0;

        if(entero == 0)
        {
            contador=1;
        }
        while(entero > 0)
        {
            contador++;
            entero/=10;

        }
        System.out.println("Tiene "+contador+" digitos");

    }
}
