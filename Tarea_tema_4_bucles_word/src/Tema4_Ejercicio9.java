import java.util.Scanner;
public class Tema4_Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int N = teclado.nextInt();
        int suma=0;
        while(N<=1)
        {
            System.out.println("No existen numeros pares o el numero introducido es negativo, introduce otra vez");
            N = teclado.nextInt();
        }
            for(int i=2; i<=N; i+=2)
            {
                suma += i;
                //System.out.println(suma);
            }
            System.out.println("La suma de los numeros pares de 1 hasta "+N+" es "+suma);
    }
}
