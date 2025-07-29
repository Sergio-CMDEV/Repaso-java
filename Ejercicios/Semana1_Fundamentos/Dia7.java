// Ejercicio: Generador de patrones
// 1. Crear triángulo de asteriscos
// 2. Tabla de multiplicar del 1 al 10
// 3. Números pares del 1 al 50
import java.util.Scanner;

public class Dia7 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int n1 = leerDatos.nextInt();
        // 1. Crear triángulo de asteriscos
        for (int i = 0; i <= n1; i++) { //Para añdir los saltos de linea y contar la linea
            System.out.println();
            for (int e = 0; e < n1 - i; e++) { //Para añadir espacios
                System.out.print(" ");
            }

            for (int o = 0; o < 2*i + 1; o++) { // Para añadir los asteriscos
                System.out.print("*");
            }
            
        }
        System.out.println("\n\n\n2. Tabla de multiplicar del 1 al 10");
        // 2. Tabla de multiplicar del 1 al 10
        for (int i = 0; i <= 10; i++) {
            int multiplo = n1 * i;
            System.out.println(multiplo);
        }
        System.out.println("\n\n\n3. Números pares del 1 al 50");
        // 3. Números pares del 1 al 50
        for (int i = 0; i <= 50; i++) {
            int divisor = i % 2;
            if (divisor == 0) {
                System.out.println(i);
            }
        }
    }
}
