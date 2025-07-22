package codJava.ej08;

public class ejemplo_08_condicionales_if {
    public static void main(String[] args) {
        // Ej: Esto lo tendría en la tabla usuarios de mi BBDD
        String usuario = "root";
        String clave = "admin";

        // Ej: Esto me lo manda el usuario por formulario HTML
        // Comparar cadenas -> equals
        String entradaUsuario = "root";
        String entradaClave = "1234";       // Probar con "admin"

        // E1 == E2? TRUE (usuario) -> condicion1
        // E1 == E2? FALSE (clave) -> condicion2
        // condicion1 AND condicion2? FALSE
        if (entradaUsuario.equals(usuario) &&
                entradaClave.equals(clave)) {
            System.out.println("Login Correcto!");
        } else {
            System.out.println("Acceso Incorrecto!");
        }
    }
}
