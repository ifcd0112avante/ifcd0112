package codJava.ej06;

public class ejemplo_06_otrosOperadores {
    public static void main(String[] args) {
        int num1 = 20;
        int num2;           // num2 = 0
        num2 = 10;          // Se lee de dcha a izq
        
        // Es muy recomendable poner las operaciones, en la salida, entre ()
        System.out.println("num1>num2? " + (num1>num2));
        System.out.println("Comparar: num1 == num2 " + (num1 == num2));

        // Al asignar, num1 = num2 = 10
        System.out.println("Asignación: num1 = num2 " + (num1 = num2));
        // Al preguntar si son distintos, me devuelve false
        System.out.println("Son distintos num1 y num2? " + (num1 != num2));     // OJO!, esto es no es válido: <>
        System.out.println("Es num1 >= num2 " + (num1 >= num2));
    }
}
