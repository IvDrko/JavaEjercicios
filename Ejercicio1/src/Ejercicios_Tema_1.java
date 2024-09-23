import java.util.Scanner;

public class Ejercicios_Tema_1 {
    public static void main(String[] args) {

        // Ejercicio 1

        final double PI = 3.1416;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia");
        double radio = sc.nextDouble();

        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;

        System.out.println("El area de tu circunferencia es " + area);
        System.out.println("El perimetro de tu circunferencia es " + perimetro);

        // Ejercicio 2
        int n1, n2, n3, n4;
        System.out.println("Introduce 4 numeros enteros");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        int multiplicacion = n1*n2*n3*n4;
        int suma = n1+n2+n3+n4;
        double media = suma/4.0;
        System.out.println("Su multiplicacion es: "+multiplicacion+" su suma es "+suma+" y su media aritmetica es "+media);

        //Ejercicio 3
        System.out.println("Introduce los productos electronicos vendidos");
        int electronicos=sc.nextInt();
        System.out.println("Introduce los productos de ropa vendidos");
        int ropa=sc.nextInt();

        double total=electronicos+ropa;

        double porcentaje_elec,porcentaje_ropa;

        porcentaje_elec=(electronicos/total)*100;
        porcentaje_ropa=(ropa/total)*100;

        System.out.println("El porcentaje de productos electronicos es "+porcentaje_elec+" y el porcentaje de ropa es "+porcentaje_ropa);

        //Ejercicio 4
        int A,B,C;
        int auxiliar;
        System.out.println("Introduce los valores A,B y C");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        auxiliar = B;
        B = A;
        A = C;
        C = auxiliar;

        System.out.println("El valor de A es "+A+" el valor de B es "+B+" el valor de C es "+C);

        //Ampliacion añadiendo una variable mas.

        int D;
        System.out.println("Introduce los valores A,B,C y D");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        // B toma A, C toma B, D toma C, A toma D
        auxiliar=B;
        B = A;
        A = auxiliar;
        auxiliar = C;
        C = A;
        A = auxiliar;
        auxiliar = D;
        D = A;
        A = auxiliar;

        System.out.println("El valor de A es "+A+" el valor de B es "+B+" el valor de C es "+C+" el valor de D es "+D);


        //Ejercicio 5
        int segundos,segundos_dados,minutos,horas;
        System.out.println("Dime una cantidad de segundos");
        segundos_dados = sc.nextInt();

        segundos = segundos_dados % 60;
        minutos = segundos_dados % 3600/60;
        horas = segundos_dados / 3600;

        System.out.println(segundos_dados+" segundos son "+horas+" horas "+minutos+" minutos "+segundos+" segundos");

        //Ejercicio 6
        int num,cifra1,cifra2,cifra3,cifra4,cifra5;
        System.out.println("Introduce un numero de 5 cifras");
        num= sc.nextInt();
        cifra1=num/10000;
        cifra2=num/1000;
        cifra2%=10;
        cifra3=num/100;
        cifra3%=10;
        cifra4=num/10;
        cifra4%=10;
        cifra5=num%10;
        System.out.println("Primera cifra: "+cifra1+" Segunda cifra: "+cifra2+" Tercera cifra: "+cifra3+" Cuarta cifra: "+cifra4+" Quinta cifra: "+cifra5);

    }
}