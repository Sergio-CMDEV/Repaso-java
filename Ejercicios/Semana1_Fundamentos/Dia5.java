// Ejercicio: Menú de opciones
// 1. Mostrar menú con 4 opciones
// 2. Usar switch para ejecutar acción según elección
// 3. Incluir opción por defecto
import java.util.Scanner;

public class Dia5 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println(" - Menu - \n1. Suma \n2. Resta \n3. Resto \n4. Multiplicación \n5. Salir");
        int n1 = leerDatos.nextInt();
        System.out.println("Introduce los valores necesarios");
        double n2 = leerDatos.nextDouble();
        double n3 = leerDatos.nextDouble();
        double resultado = 0;
        switch (n1) {
            case 1:
                resultado = n2 + n3;
                System.out.println("Resultado = " + resultado);
            break;
            case 2:
                resultado = n2 - n3;
                System.out.println("Resultado = " + resultado);
            break;
            case 3:
                resultado = n2 % n3;
                System.out.println("Resultado = " + resultado);
            break;
            case 4:
                resultado = n2 * n3;
                System.out.println("Resultado = " + resultado);
            break;
            case 5:
                System.out.println("Saliendo...");
            default:
                System.out.println("Opción no válida");
            break;
        }
    }
}
