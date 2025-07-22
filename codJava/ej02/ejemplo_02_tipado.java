// package -> Carpeta (case sensitive!)
package codJava.ej02;

/*
 * Tipos primitivos:
 * boolean -> booleanos (true, false) *
 * char -> carácter *
 *     -> String (cadena de caracteres) -> OJO, no es primitivo
 * 
 * byte -> entero muy pequeño (-128 - 127) [1byte]
 * short -> entero pequeño (~ -32000 - 32000) [2bytes]
 * int -> entero (~ -2^31 - 2^30) [4bytes] *
 * long -> entero grande (~ -2^63 - 2^62) [8bytes]
 * 
 * float -> decimales (coma flotante) (~ -3.4^38 - 3.4^38) (4bytes) *
 * double -> decimales muy grande (~ -1.79^308 - 1.79^308) (8bytes)
 */
public class ejemplo_02_tipado {
    public static void main(String[] args) {
        boolean genero = true;          // Por defecto: false
        
        // Declaramos la variable
        char letra;                     // Por defecto: null (\u0000)
        letra = 'I';    // Inicializamos la variable

        int numeroEntero = 10;          // Por defecto: 0 (y anteriores); Long -> 0L
        float numDecimal = 9.6f;        // Por defecto: 0.0f 
        double numDecimalGrande = 7.5;  // Por defecto: 0.0d
        
        // Impresión de variables
        System.out.println("Genero es: " + genero);
        System.out.println("Mi letra es: " + letra);
        System.out.println("Nota examen: " + numeroEntero);
        System.out.println("Nota ultimo examen: " + numDecimal);
        System.out.println("Un Double: " + numDecimalGrande);
    }
}
