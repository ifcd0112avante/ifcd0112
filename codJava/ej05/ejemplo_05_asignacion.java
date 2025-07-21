package codJava.ej05;

/**
 * 
 * @author ivanrguez
 * @date 20250721-10:31:00AM
 */
public class ejemplo_05_asignacion {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
        
        // Variable adicional, menos eficiente
        int rdo = num1/num2;
        System.out.println("División num1/num2 = " + rdo);
        
        //num1 = num1 +2;
        num1 += 2;
        System.out.println("División num1/num2 = " + num1/num2);    // num1=10 y num2=3
        num1 *= 3;  // num1 = 30
        System.out.println("División num1/num2 = " + num1/num2);    // num1=30 y num2=3
        // Sacamos el módulo de num1 % 4 (30/4 = 7 y resto = 2)
        num1 %= 4;
        System.out.println("Valor de num1 = " + num1);

    }
}
