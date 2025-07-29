// Ejercicio: Programa interactivo
// 1. Solicitar nombre y edad al usuario
// 2. Calcular año de nacimiento
// 3. Mostrar mensaje personalizado
// Usar Scanner para entrada de datos
import java.util.Scanner;

public class Dia3 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        //1. Solicitar nombre y edad al usuario
        System.out.println("Introduce tu nombre");
        String nombre = leerDatos.nextLine();
        System.out.println("Introduce tu edad");
        int edad = leerDatos.nextInt();

        //2. Calcular año de nacimiento
        int año = 2025 - edad;

        //3. Mostrar mensaje
        System.out.println("Nombre = " + nombre + "\nNaciste en el año " + (año - 1) + "/" + año);
    }
}
