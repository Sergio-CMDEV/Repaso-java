// Ejercicio: Clasificador de edades
// 1. Solicitar edad
// 2. Clasificar: niño (0-12), adolescente (13-17), adulto (18-64), adulto mayor (65+)
// 3. Mostrar categoría correspondiente
import java.util.Scanner;

public class Dia4 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);

        //1. Solicitar edad
        System.out.println("Introduce tu edad");
        int n1 = leerDatos.nextInt();

        //2. Clasificación de edad y 3 Mostrar la categoria
        if (n1 >= 0 && n1 <= 12) {
            System.out.println("Clasificación: Niño (" + n1 +")");
        } else if (n1 >= 13 && n1 <= 17) {
            System.out.println("Clasificación: Adolescente (" + n1 +")");
        } else if (n1 >= 18 && n1 <= 64) {
            System.out.println("Clasificación: Adulto (" + n1 +")");
        } else if (n1 >= 65) {
            System.out.println("Clasificación: Adulto mayor (" + n1 +")");
        } else {
            System.out.println("Edad no valida");
        }
    }
}
