package codJava.ej09;

import java.util.Scanner;

public class ejemplo_09_condicional_switch {
    public static void main(String[] args) {
        System.out.println("-- CAFETERIA AVANTE -- \n" + 
                           "-- 1. Café ☕ \n" +
                           "-- 2. Té 🍵 \n" +
                           "-- 3. Zumo 🍊 OFERTA! Si elijes 🍊 Te regalo 💧 \n" +
                           "-- 4. Agua 💧");
        
        int opcion = 3;

        // Si queremos interacción
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();
        sc.close();

        // if anidado. OJO! Es poco eficiente
        if (opcion ==1) {
            System.out.println("Has elegido ☕");
        } else if (opcion ==2) {
            System.out.println("Has elegido 🍵");
        } else if (opcion ==3) {
            System.out.println("Has elegido 🍊");
        } else if (opcion ==4) {
            System.out.println("Has elegido 💧");
        } else {
            System.out.println(" ❌ Opción incorrecta");
        }

        System.out.println("-------------------");
        // Lo mas eficiente es usar switch!
        // Si no pongo el break, no se para en el case (3) e imprime hasta el siguiente break (4)
        switch (opcion) {
            case 1:
                System.out.println("Has elegido ☕");           break;
            case 2:
                System.out.println("Has elegido 🍵");           break;
            case 3:
                System.out.println("Has elegido 🍊");           
            case 4:
                System.out.println("Has elegido 💧");           break;        
            default:
                System.out.println(" ❌ Opción incorrecta");    break;
        }

        System.out.println("-------------------");
        // Desde Java14 (2020), se puede poner así:
        String mensaje = switch(opcion) {
            case 1 -> "Has elegido ☕";
            case 2 -> "Has elegido 🍵";
            case 3 -> "Has elegido 🍊 y de regalo 💧";
            case 4 -> "Has elegido 💧";
            default -> " ❌ Opción incorrecta";
        };
        System.out.println(mensaje);

        
    }
}
