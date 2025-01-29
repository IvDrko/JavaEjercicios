import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
            int[] nums = {3,1,4,2,5};
            char[] vocales={'a','b','c','a','e'};
            String[] cadena={"Hola","me","llamo","Ivan"};
            int[][] matriz = {{0,2},{1,3}};
            int[][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
            int[][] matriz3 = {{1,1},{1,1}};
            int[] orden ={0,1,2,3,4};
            int[] desorden={3,2,1,4};
            String[] palindrmo={"radar","casa","reconocer","java","ana"};

        PracticarArray.imprimirarray(nums); // 1. Crear un array de enteros con 5 elementos e imprimirlos uno por uno
        System.out.println("La suma del array es: " + PracticarArray.calcularSuma(nums)); //2. Calcular la suma de los elementos en un array de enteros
        System.out.println("El mayor numero en el array es: " + PracticarArray.findMaxver2(nums)); //  3. Encontrar el número mayor en un array de enteros.
        System.out.println("Se han encontrado " +PracticarArray.countVowels(vocales)+ " vocales"); // 4. Contar cuántas vocales hay en un array de caracteres
        System.out.println(PracticarArray.concatenateStrings(cadena)); //  5. Concatenar todos los elementos de un array de cadenas en una sola cadena.
        System.out.println("Array invertido: "+Arrays.toString(PracticarArray.reverseArray(nums))); // 6. Invertir el orden de un array de enteros.
        System.out.println("El promedio es: "+PracticarArray.promedioArray(nums)); // 7. Calcular el promedio de un array de enteros.
        PracticarArray.caracterArray(vocales,'a'); //  8. Contar cuántas veces aparece un carácter específico en un array de caracteres
        PracticarArray.ascendenteArray(orden);// 9. Verificar si un array de enteros está en orden ascendente
        PracticarArray.ascendenteArray(desorden); // Tambien es el 9
        System.out.println("Suma de matrices: "+Arrays.deepToString(PracticarArray.sumMatrix2x2(matriz,matriz3))); // 10. Crear dos matrices 2x2, sumarlas e imprimir el resultado
        System.out.println("Transpuesta: "+Arrays.deepToString(PracticarArray.transposeMatrix2x2(matriz))); //  11. Transponer una matriz 2x2.
        System.out.println("Separación de pares e impares: "+Arrays.deepToString(PracticarArray.separarArray(orden))); // 12. Crear un array de enteros y separar los números pares e impares en dos arrays diferentes
        PracticarArray.bubblesortArray(desorden); // 13. Ordenar un array de enteros en orden ascendente usando un algoritmo de burbuja
        System.out.println("Array ordenado con bubblesort: "+Arrays.toString(desorden)); // 13
        System.out.println("Diagonal principal: "+Arrays.toString(PracticarArray.imprimirdiagonal(matriz2))); //14. Crear un array bidimensional de 3x3 e imprimir la diagonal principal.
        PracticarArray.verificar_palindromo(palindrmo); //15. Leer un array de cadenas y verificar cuáles son palíndromos
        }
    }