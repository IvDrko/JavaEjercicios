import java.util.Scanner;
public class Tema4_Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero");
        n = teclado.nextInt();
        System.out.println("Imprimiendo numeros del 1 al "+n);
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
