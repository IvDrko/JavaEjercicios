import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 2
        double salario_semanal, horas;
        final double dinero_por_hora = 12.0;

        System.out.println("¿Cuantas horas has trabajado?");
        horas = sc.nextDouble();
        salario_semanal = (horas * dinero_por_hora)*7.0;

        System.out.println("Tu salario semanal es de: "+salario_semanal+"€");

        //Ejercicio 3
        int ganados, perdidos, empatados, puntuacion_total;


        System.out.println("Introduce el numero de partidos ganados");
        ganados = sc.nextInt();
        System.out.println("Introduce el numero de partidos perdidos");
        perdidos = sc.nextInt();
        System.out.println("Introduce el numero de partidos empatados");
        empatados = sc.nextInt();
        // 3 puntos por ganar, 1 por empatar y 0 por perder
        puntuacion_total = ganados*3 + empatados +perdidos*0; // Se nos pide que lea el numero de partidos perdidos aunque luego es irrelevante para el calculo
        System.out.println("Tienes un total de "+puntuacion_total);

        //Ejercicio 4
        String alumno;
        double nota_practica, nota_problemas, nota_teorica,nota_final;

        System.out.println("Nombre del alumno?");
        alumno = sc.next();
        System.out.println("Nota practica?");
        nota_practica = sc.nextDouble();
        System.out.println("Nota problemas?");
        nota_problemas = sc.nextDouble();
        System.out.println("Nota teorica?");
        nota_teorica = sc.nextDouble();
        // la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%
        nota_final = nota_practica*0.1 + nota_problemas*0.5 + nota_teorica*0.4;

        System.out.println("Nota final de "+alumno+" es "+nota_final);

        //Ejercicio 6 , porque claramente despues del 4 vamos al 6 :D
        double x,polinomio;

        System.out.println("Introduce la incognita");
        x = sc.nextDouble();

        polinomio = x*x*x*x*x + 7*(x*x*x*x) - 4*(x*x*x) + 2*(x*x) - x + 10;

        System.out.println("El valor es: "+polinomio);

        // Ejercicio 7
        int horas_, minutos, segundos,instante1,instante2,instante_final;

        System.out.println("Introduce horas, minutos, segundos");
        horas_ = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        instante1= horas_*3600 + minutos*60 + segundos;
        System.out.println("Introduce horas, minutos, segundos de nuevo");
        horas_ = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        instante2= horas_*3600 + minutos*60 + segundos;
        instante_final= instante2 - instante1;
        segundos = instante_final % 60;
        minutos = instante_final % 3600/60;
        horas_ = instante_final/3600;
        System.out.println("La diferencia entre ambos instantes es: "+horas_+" horas "+minutos+" minutos "+ segundos+" segundos");

        //Ejercicio 8
        int dia, mes, ano,num_suerte,suma;
        System.out.println("Introduce tu fecha de nacimiento, primero el dia luego el mes y por ultimo el año");
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();
        suma = dia + mes + ano;
        num_suerte = (suma/1000)+ (suma/100)%10 + (suma/10)%10 + suma%10;
        System.out.println("Tu numero de la suerte es el: "+num_suerte);
    }
}