import java.util.Scanner;
import java.util.Random;
public class Tienda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //CON IDEA DE ORGANIZAR Y SEPARAR EL CODIGO
        //DEFINIR LAS VARIABLES (FINAL SI PROCEDE) NECESARIAS AQUI ARRIBA
        final String habichuelas;
        final String zanahorias;
        final String huevos;
        final String papel;
        final String sandias;
        final String separador = "......";
        final String nombre;

        final double valor_habichuelas;
        final double valor_zanahorias;
        final double valor_huevos;
        final double valor_papel;
        final double valor_sandias;

        final double resultado;
        final double resultado_IVA_repercutido;
        final double resultado_IVA;
        final double resultado_descuento;
        final double resultado_final;

        final int cantidad_habichuelas;
        final int cantidad_zanahorias;
        final int cantidad_huevos;
        final int cantidad_papel;
        final int cantidad_sandias;
        final int espacio_blanco;
        //%DEL IVA ... ETC
        final double IVA = 21;
        //PRECIOS DE LOS PRODUCTOS NOMBRES DE LOS PRODUCTOS,ETC...
        //VARIABLES PARA EL DESCUENTO ALEATORIO
        final double descuento = aleatorio.nextInt(6)+5;
        //=====================================================================

        //ASIGNAR EL NOMBRE DE LOS PRODUCTOS
        habichuelas = "Habichuelas";
        zanahorias = "Zanahorias";
        huevos = "Huevos";
        papel = "Papel higiénico";
        sandias = "Sandias";
        //ASIGNAR EL PRECIO DE LOS PRODUCTOS
        valor_habichuelas = 3.5;
        valor_zanahorias = 2.0;
        valor_huevos = 3.0;
        valor_papel = 4.0;
        valor_sandias = 7.5;
        //=====================================================================
        //IMPRIMIR EL MENSAJE DE BIENVENIDA
        System.out.println("Bienvenidos/as a a la tienda!!");
        //IMPRIMIR EL LOGOTIPO
        System.out.println("                       __\n" +
                "                     .'  '.\n" +
                "                 _.-'/  |  \\\n" +
                "    ,        _.-\"  ,|  /  0 `-.\n" +
                "    |\\    .-\"       `--\"\"-.__.'=====================-,\n" +
                "    \\ '-'`        .___.--._)=========================|\n" +
                "     \\            .'      |                          |\n" +
                "      |     /,_.-'        |        LA TIENDA         |\n" +
                "    _/   _.'(             |           DE LAS         |\n" +
                "   /  ,-' \\  \\            |        MARAVILLAS       |\n" +
                "   \\  \\    `-'            | (ok no)                 |\n" +
                "    `-'                   '--------------------------'");
        //IMPRIMIR TABLA DE PRODUCTOS CON SUS PRECIOS
        System.out.println("Tabla de precios");
        System.out.println(habichuelas+separador+valor_habichuelas+"€");
        System.out.println(zanahorias+separador+valor_zanahorias+"€");
        System.out.println(huevos+separador+valor_huevos+"€");
        System.out.println(papel+separador+valor_papel+"€");
        System.out.println(sandias+separador+valor_sandias+"€");

        //PEDIR LA CANTIDAD QUE EL CLIENTE QUIERE COMPRAR DE CADA PRODUCTO
        System.out.println("Cantidad deseada de " + habichuelas);
        cantidad_habichuelas = teclado.nextInt();
        System.out.println("Cantidad deseada de " + zanahorias);
        cantidad_zanahorias = teclado.nextInt();
        System.out.println("Cantidad deseada de " + huevos);
        cantidad_huevos = teclado.nextInt();
        System.out.println("Cantidad deseada de " + papel);
        cantidad_papel = teclado.nextInt();
        System.out.println("Cantidad deseada de " + sandias);
        cantidad_sandias = teclado.nextInt();
        //SUPONEMOS QUE EL CLIENTE NO ESCRIBE NUMEROS NEGATIVOS
        //PREGUNTAR EL NOMBRE AL CLIENTE PARA LA FACTURA
        System.out.println("Escriba su nombre completo:");
        teclado.nextLine();
        nombre = teclado.nextLine()+" ";
        //====================================================================
        //CALCULAR TODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNA
        resultado = cantidad_habichuelas*valor_habichuelas+cantidad_papel*valor_papel+cantidad_huevos*valor_huevos+cantidad_sandias*valor_sandias+cantidad_zanahorias*valor_zanahorias;
        resultado_IVA_repercutido = resultado*IVA/100;
        resultado_IVA = resultado + resultado_IVA_repercutido;
        resultado_descuento = resultado_IVA*descuento/100;
        resultado_final = resultado_IVA - resultado_descuento;

        //====================================================================
        //SR/SRA AQUI TIENE SU FACTURA
        espacio_blanco = nombre.indexOf(" ");
        System.out.println("Sr/Sra "+nombre.substring(0,espacio_blanco)+" aquí tiene el resumen de la factura:");
        //MOSTRAR EL RESUMEN DE LA FACTURA
        //NOMBRE DEL CLIENTE
        System.out.println("Nombre cliente: "+nombre);
        //CUANTO COMPRÓ DE CADA PRODUCTO
        System.out.println("Habichuelas: "+cantidad_habichuelas);
        System.out.println("Papel Higienico: "+cantidad_papel);
        System.out.println("Huevos: "+cantidad_huevos);
        System.out.println("Sandías: "+cantidad_sandias);
        System.out.println("Zanahorias: "+cantidad_zanahorias);
        //TOTAL SIN IVA
        System.out.println("Total sin IVA: "+resultado+"€");
        //%IVA APLICADO
        System.out.println("IVA aplicado: "+IVA+"%");
        //EL IVA QUE SE APLICA AL TOTAL EN BASE AL PORCENTAJE ANTERIOR
        System.out.println("IVA repercutido: "+resultado_IVA_repercutido+"€");
        //TOTAL CON IVA
        System.out.println("Total con IVA: "+resultado_IVA+"€");
        //DESCUENTO ALEATORIO
        System.out.println("Descuento por 1ºvez: "+descuento+"%");
        //DESCUENTO APLICADO
        System.out.println("Valor descontado: "+resultado_descuento+"€");
        //PRECIO FINAL
        System.out.println("Total final: "+resultado_final+"€");
        //IMPRIMIR MENSAJE DE DESPEDIDA
        System.out.println("Hasta luego "+nombre);

    }
}
