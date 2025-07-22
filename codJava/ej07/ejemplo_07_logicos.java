package codJava.ej07;

public class ejemplo_07_logicos {
    public static void main(String[] args) {
        boolean entrada1 = true;
        boolean entrada2 = false;

        System.out.println("entrada1 AND entrada2 = " + (entrada1 && entrada2));
        System.out.println("entrada1 OR entrada2 = " + (entrada1 || entrada2));
        System.out.println("entrada2 negada = " + (!entrada2));
        System.out.println("entrada1 XOR entrada2 = " + (entrada1 ^ entrada2));
    }
}
