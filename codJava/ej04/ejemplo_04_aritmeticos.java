package codJava.ej04;

/**
 * @date 2025-07-21
 * @author ivanrguez
 * @version 1.0
 */
public class ejemplo_04_aritmeticos {
    public static void main(String[] args) {
        /**
         * Operadores aritméticos
         */
        int num1 = 10;
        int num2 = 3;
        System.out.println("Producto num1 * num2 = " + (num1 * num2));
        System.out.println("División num1 / num2 = " + (num1 / num2));      // Cociente (parte entera)
        
        // OJO! En algoritmica se usa mucho los módulos y operadores incremento/decremento
        // Módulo -> Resto de la división entera
        System.out.println("Módulo num1 % num2 = " + (num1 % num2));
        
        // Operadores decremento e incremento (sufijo)
        // Se usa mucho en bucles y para recorres arrays (conjuntos de datos)
        num2++;     // Equivale num2 = num2 +1
        System.out.println("Num2 = " + num2);
        System.out.println("Módulo num1 % num2 = " + (num1 % num2));

        num1--;     // Equivale num1 = num1 -1
        System.out.println("Num1 = " + num1);
    }
}