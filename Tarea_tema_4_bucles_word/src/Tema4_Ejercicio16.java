import java.util.Scanner;
public class Tema4_Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entero;
        int suma=0;
        System.out.println("Introduce un entero");
        entero = teclado.nextInt();
        entero = Math.abs(entero);

        while(entero > 0)
        {
            suma += entero % 10;
            entero /=10;
        }
        System.out.println(suma);
    }
}
