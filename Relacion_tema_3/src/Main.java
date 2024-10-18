import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner teclado = new Scanner(System.in);
        String usuario, password;
        System.out.println("Introduce usuario y contraseña");
        usuario = teclado.nextLine().toLowerCase();
        password = teclado.nextLine().toLowerCase();

        if (usuario.equals("admin") && password.equals("1234"))
        {
            System.out.println("Eres administrador");
        }
        else if (usuario.equals("user") && password.equals("abcd"))
        {
            System.out.println("Eres usuario");
        }
        else if (usuario.equals("guest") && password.equals("xyz"))
        {
            System.out.println("Eres invitado");
        }
        else
        {
            System.out.println("Acceso denegado");
        }

        //Ejercicio 2
        //Podria haberlo hecho con switch tambien.
        double producto;
        String tipo_cliente;

        System.out.println("Dime el precio de tu producto");
        producto = teclado.nextDouble();
        System.out.println("Dime el tipo de cliente que eres (regular,premium,VIP)");
        teclado.nextLine();
        tipo_cliente = teclado.nextLine();
        if (tipo_cliente.equals("regular"))
        {
            producto = producto - producto*0.05;
            System.out.println("El precio de tu producto se ha quedado en: "+producto);
        }
        else if(tipo_cliente.equals("premium"))
        {
            producto = producto - producto*0.1;
            System.out.println("El precio de tu producto se ha quedado en: "+producto);
        }
        else if(tipo_cliente.equals("VIP"))
        {
            if(producto>500)
            {
                producto = producto - producto*0.25;
                System.out.println("El precio de tu producto se ha quedado en: "+producto);
            }
            else
            {
                producto = producto - producto*0.2;
                System.out.println("El precio de tu producto se ha quedado en: "+producto);
            }
        }
        else
        {
            System.out.println("Error");
        }

        // Ej 3
        double nota1,nota2,nota3,nota4,nota5,promedio;
        System.out.println("Introduce las notas de tus 5 materias");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        nota4 = teclado.nextDouble();
        nota5 = teclado.nextDouble();

        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        if(nota1<0 || nota1>100 || nota2<0 || nota2>100 || nota3<0 || nota3>100 || nota4<0 || nota4>100 || nota5<0 || nota5>100)
        {
            System.out.println("Error");
        }
        else if(promedio >=90 && promedio<=100)
        {
            System.out.println("Tu calificacion es A");
        }
        else if(promedio >=80)
        {
            System.out.println("Tu calificacion es B");
        }
        else if(promedio >=70)
        {
            System.out.println("Tu calificacion es C");
        }
        else if(promedio >=60)
        {
            System.out.println("Tu calificacion es D");
        }
        else
        {
            System.out.println("Tu calificacion es F");
        }


        // Ejercicio 4
        int dia,mes,year;
        String mes_;
        System.out.println("Introduce dia, mes y año");
        dia = teclado.nextInt();
        mes = teclado.nextInt();
        year = teclado.nextInt();
        if(dia<0 || dia>31 )
        {
            System.out.println("Error");
        }
        else if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
        {
            if(mes == 2 && dia >28)
            {
                System.out.println("Error");
            }
        }
        else
        {
            switch (mes){
                case 1: mes_ = "Enero";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 2: mes_ = "Febrero";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 3: mes_ = "Marzo";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 4: mes_ = "Abril";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 5: mes_ = "Mayo";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 6: mes_ = "Junio";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 7: mes_ = "Julio";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 8: mes_ = "Agosto";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 9: mes_ = "Septiembre";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 10: mes_ = "Octubre";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 11: mes_ = "Noviembre";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                case 12: mes_ = "Diciembre";
                    System.out.println("La fecha: "+dia+" "+mes_+" "+year+" es correcta");
                    break;
                default:
                    System.out.println("El mes introducido no es correcto");
                    break;
            }
        }

        // Ej 5
        double longitud1,longitud2,longitud3;
        System.out.println("Introduce las 3 longitudes de un triangulo");
        longitud1 = teclado.nextDouble();
        longitud2 = teclado.nextDouble();
        longitud3 = teclado.nextDouble();

        if(longitud1<0 || longitud2<0 || longitud3<0)
        {
            System.out.println("No forman un triangulo");
        }
        else if(longitud1 == longitud2 && longitud2 == longitud3)
        {
            System.out.println("El triangulo es equilatero");
        }
        else if(longitud1 == longitud2 && longitud1 != longitud3)
        {
            System.out.println("El triangulo es isósceles");
        }
        else
        {
            System.out.println("El triangulo es Escaleno");
        }

        // Ej 6
        double ingresos;
        int dependientes;
        System.out.println("Introduce tus ingresos anuales");
        ingresos = teclado.nextDouble();
        System.out.println("Introduce tus dependientes");
        dependientes = teclado.nextInt();
        if(ingresos<20000)
        {
            if(dependientes>3)
            {
                System.out.println("No le debes nada al estado");
            }
            else
            {
                System.out.println("Le debes al estado "+ingresos*0.05);
            }

        }
        else if(ingresos<40000)
        {
            if(dependientes>3)
            {
                System.out.println("Le debes al estado "+ingresos*0.05);
            }
            else
            {
                System.out.println("Le debes al estado "+ingresos*0.1);
            }

        }
        else if(ingresos<80000)
        {
            if(dependientes>3)
            {
                System.out.println("Le debes al estado "+ingresos*0.15);
            }
            else
            {
                System.out.println("Le debes al estado "+ingresos*0.2);
            }
        }
        else
        {
            if(dependientes>3)
            {
                System.out.println("Le debes al estado "+ingresos*0.25);
            }
            else
            {
                System.out.println("Le debes al estado "+ingresos*0.3);
            }

        }
        // Ej 7
        String instruccion1,instruccion2;
        System.out.println("Jugador 1, introduce piedra, papel, tijeras, lagarto, Spock");
        //teclado.nextLine();
        instruccion1 = teclado.nextLine().toLowerCase();
        System.out.println("Jugador 2, introduce piedra, papel, tijeras, lagarto, Spock");
        instruccion2 = teclado.nextLine().toLowerCase();
        if((instruccion1.equals("piedra") || instruccion1.equals("papel") || instruccion1.equals("tijeras") ||instruccion1.equals("lagarto") || instruccion1.equals("spock")) && (instruccion2.equals("piedra") || instruccion2.equals("papel") || instruccion2.equals("tijeras") ||instruccion2.equals("lagarto") || instruccion2.equals("spock")))
        {
            switch (instruccion1) {
                case "piedra":
                    switch (instruccion2) {
                        case "papel":
                            System.out.println("Papel cubre piedra, gana Jugador 2");
                            break;
                        case "lagarto":
                            System.out.println("Piedra aplasta lagarto, gana Jugador 1");
                            break;
                        case "spock":
                            System.out.println("Spock vaporiza piedra, gana Jugador 2");
                            break;
                        case "tijeras":
                            System.out.println("Piedra aplasta tijeras, gana Jugador 1");
                            break;
                        default:
                            System.out.println("Empate");
                            break;
                    }
                    break;
                case "papel":
                    switch (instruccion2) {
                        case "tijeras":
                            System.out.println("Tijeras cortan papel, gana Jugador 2");
                            break;
                        case "piedra":
                            System.out.println("Papel cubre piedra, gana Jugador 1");
                            break;
                        case "lagarto":
                            System.out.println("Lagarto come papel, gana Jugador 2");
                            break;
                        case "spock":
                            System.out.println("Papel desautoriza a Spock, gana jugador 1");
                            break;
                        default:
                            System.out.println("Empate");
                            break;
                    }
                    break;
                case "tijeras":
                    switch (instruccion2) {
                        case "papel":
                            System.out.println("Tijeras cortan papel, gana Jugador 1");
                            break;
                        case "spock":
                            System.out.println("Spock rompe tijeras, gana Jugador 2");
                            break;
                        case "lagarto":
                            System.out.println("Tijeras decapitan lagarto, Jugador 1");
                            break;
                        case "piedra":
                            System.out.println("Piedra aplasta tijeras, gana Jugador 2");
                            break;
                        default:
                            System.out.println("Empate");
                            break;
                    }
                    break;
                case "lagarto":
                    switch (instruccion2) {
                        case "piedra":
                            System.out.println("Piedra aplasta lagarto, gana Jugador 2");
                            break;
                        case "spock":
                            System.out.println("Lagarto envenena a Spock, gana Jugador 1");
                            break;
                        case "tijeras":
                            System.out.println("Tijeras decapitan lagarto, gana Jugador 2");
                            break;
                        case "papel":
                            System.out.println("Lagarto come papel, gana Jugador 1");
                            break;
                        default:
                            System.out.println("Empate");
                            break;
                    }
                    break;
                case "spock":
                    switch (instruccion2) {
                        case "lagarto":
                            System.out.println("Lagarto envenena Spock, gana Jugador 2");
                            break;
                        case "tijeras":
                            System.out.println("Spock rompe tijeras, gana Jugador 1");
                            break;
                        case "papel":
                            System.out.println("Papel desautoriza a Spock, gana Jugador 2");
                            break;
                        case "piedra":
                            System.out.println("Spock vaporiza piedra, gana Jugador 1");
                            break;
                        default:
                            System.out.println("Empate");
                            break;
                    }
                    break;
            }
        }
        else
        {
            System.out.println("Introduce un valor valido para ambas instrucciones");
        }

        // Ejercicio 9, ya que el 8 requiere de bucles
        String operacion;
        double num1,num2;
        System.out.println("Introduce '+' para sumar, '-' para restar, '*' para multiplicar, y '/' para dividir, 'potencia' para potencias, 'raiz' para raices y 'factorial' para hacer factoriales");
        operacion = teclado.nextLine();
        switch (operacion)
        {
            case ("+"):
                System.out.println("Introduce 1 numero");
                num1 = teclado.nextDouble();
                System.out.println("Introduce otro numero");
                num2 = teclado.nextDouble();
                System.out.println(num1+num2);
                break;
            case("-"):
                System.out.println("Introduce un numero");
                num1= teclado.nextDouble();
                System.out.println("Introduce otro numero");
                num2= teclado.nextDouble();
                System.out.println(num1-num2);
                break;
            case("*"):
                System.out.println("Introduce un numero");
                num1= teclado.nextDouble();
                System.out.println("Introduce otro numero");
                num2= teclado.nextDouble();
                System.out.println(num1*num2);
                break;
            case("/"):
                System.out.println("Introduce un numero");
                num1= teclado.nextDouble();
                System.out.println("Introduce otro numero");
                num2= teclado.nextDouble();
                if(num2 == 0)
                {
                    System.out.println("No se puede dividir entre 0");
                    break;
                }
                System.out.println(num1/num2);
                break;
            case("potencia"):
                System.out.println("Introduce un numero");
                num1= teclado.nextDouble();
                System.out.println("Introduce otro numero");
                num2= teclado.nextDouble();
                if(num2 <0)
                {
                    System.out.println("El exponente no puede ser negativo");
                    break;
                }
                System.out.println(Math.pow(num1, num2));
                break;
            case("raiz"):
                System.out.println("Introduce un numero");
                num1= teclado.nextDouble();
                if(num1 < 0)
                {
                    System.out.println("No puedes hacer la raiz cuadrada de un numero negativo");
                    break;
                }
                System.out.println(Math.sqrt(num1));
                break;
                // Aqui iria factorial, pero como se dieron bucles ni clases hasta este punto no lo voy a hacer.
            default:
                System.out.println("Introduce un caso válido la siguiente vez");
                break;
        }

        // Ejercicio 10
        double cal1,cal2,cal3,cal4,cal5,cal6,sumacal;
        int peso1,peso2,peso3,peso4,peso5,peso6,sumapesos;
        System.out.println("Introduce 6 notas juntos con sus pesos ponderados(debe sumar 100%), (1º la nota, luego el peso)");
        cal1= teclado.nextDouble();
        peso1= teclado.nextInt();
        cal2= teclado.nextDouble();
        peso2= teclado.nextInt();
        cal3= teclado.nextDouble();
        peso3= teclado.nextInt();
        cal4= teclado.nextDouble();
        peso4= teclado.nextInt();
        cal5= teclado.nextDouble();
        peso5= teclado.nextInt();
        cal6= teclado.nextDouble();
        peso6= teclado.nextInt();
        sumapesos=peso1+peso2+peso3+peso4+peso5+peso6;
        if(sumapesos != 100)
        {
            System.out.println("La suma de los pesos no suman 100");
        }
        else
        {
            sumacal= (cal1*peso1 + cal2*peso2 + cal3*peso3 + cal4*peso4 + cal5*peso5+ cal6*peso6)/100;
            System.out.println("Tu promedio es de "+sumacal);
            if(sumacal < 60)
            {
                System.out.println("Has reprobado");
            }
            else
            {
                System.out.println("Has aprobado");
            }
        }

    }
}