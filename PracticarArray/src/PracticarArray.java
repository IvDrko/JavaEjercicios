public class PracticarArray {
    public static void imprimirarray(int[]array){
        for(int resultado : array){
            System.out.println(resultado);
        }
    }
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
    public static int findMax(int[] array){
        int resultado=array[0];
        for(int i =1; i<array.length;i++){

            if(resultado < array[i])
            {
                resultado = array[i];
            }
        }
        return resultado;
    }
    public static int findMaxver2(int[] array){
        int max=array[0];
        for( int resultado : array)
        {
            if(resultado > max ){
                max = resultado;
            }
        }
        return max;
    }
    public static int countVowels(char[] array){
        int contador = 0;
        for(char vocal : array){
            if(vocal == 'a'|| vocal == 'e' ||vocal == 'i' ||vocal == 'o' ||vocal == 'u'){
                contador++;
            }
        }
        return contador;
    }
    public static StringBuilder concatenateStrings(String[] array){
        StringBuilder cadena = new StringBuilder();
        for(String contenido : array){
            cadena.append(contenido);
            cadena.append(" ");
        }
        return cadena;
    }
    public static int[] reverseArray(int[] array){
        int longitud = array.length;
        int[] invertido = new int[longitud];
        for(int i=0; i < longitud ; i++){
            invertido[i] = array[longitud - 1 - i];
        }
        return invertido;
    }
    public static int promedioArray(int[] array){
        int promedio=0;
        for(int i: array)
        {
            promedio+=i;
        }
        promedio /= array.length;
        return promedio;
    }

    public static void caracterArray(char[] array, char caracter){
        int contador=0;
        for(char c: array)
        {
            if(c == caracter)
            {
                contador++;
            }
        }
        System.out.println("El caracter "+caracter+" ha aparecido "+ contador+" veces");
    }

    public static void ascendenteArray(int[] array)
    {
        int primer_valor=array[0];
        boolean es_ascendente=true;
        for(int i=1; i<array.length;i++){
            if(primer_valor < array[i])
            {
                primer_valor = array[i];
            }
            else{
                es_ascendente=false;
            }
        }
        if(es_ascendente){
            System.out.println("El array está en orden ascendente");
        }
        else{
            System.out.println("El array no está en orden ascendente");
        }
    }

    public static int[][] sumMatrix2x2(int[][] mat1, int [][] mat2){
        int[][] suma = new int [2][2];
        for(int i=0; i<2;i++){
            for(int j=0; j<2; j++){
                suma[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return suma;
    }

    public static int[][] transposeMatrix2x2(int[][] mat1)
    {
        int[][] transpuesta = new int [2][2];
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<2; j++)
            {
                transpuesta[i][j] = mat1[j][i];
            }
        }
        return transpuesta;
    }

    public static int[][] transposeMatrixforall(int[][] mat1)
    {
        int filas = mat1.length;
        int columnas = mat1[0].length;
        int[][] transpuesta = new int [filas][columnas];
        for(int i=0; i<filas; i++)
        {
            for(int j=0; j<columnas; j++)
            {
                transpuesta[i][j] = mat1[j][i];
            }
        }
        return transpuesta;
    }

    public static int[][] separarArray(int[] array){
        int filas = 2;
        int columnas = array.length;
        int[][] matriz1= new int[filas][columnas];
        int contador_pares = 0;
        int contador_impares = 0;
        for(int i : array){
            if(i % 2 == 0){
                matriz1[0][contador_pares] = i;
                contador_pares++;
            }
            else{
                matriz1[1][contador_impares] = i;
                contador_impares++;
            }
        }
        return matriz1;
    }

    public static void bubblesortArray(int[] array){
        int tam = array.length;
        for(int i = 0; i< tam-1;i++)
        {
            boolean intercambio = false;
            for(int j = 0; j <tam-1-i; j++)
            {
                if(array[j] > array[j +1])
                {
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j +1] = temp;
                    intercambio = true;
                }
            }
            if(!intercambio){
                break;
            }
        }
    }
    public static int[] imprimirdiagonal(int[][] mat){
        int[] array = new int[3];
        for(int i=0; i<mat.length;i++)
        {
            array[i]=mat[i][i];
        }
        return array;
    }
    public static void verificar_palindromo(String[] array){
        for(String cadena : array){
            boolean es_palindromo=true;
            for(int i=0; i<cadena.length() / 2 ; i++)
            {
                if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                    es_palindromo = false;
                    break;
                }
            }
            if(es_palindromo){
                System.out.println(cadena + " es palindromo");
            }
            else{
                System.out.println(cadena + " no es palindromo");
            }
        }
    }
}
