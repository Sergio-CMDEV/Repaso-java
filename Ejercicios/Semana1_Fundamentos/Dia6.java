// Ejercicio: Juego de adivinanza
// 1. Generar número aleatorio entre 1-100
// 2. Permitir intentos hasta acertar
// 3. Dar pistas (mayor/menor)
// 4. Contar intentos
import java.util.Scanner;

public class Dia6 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        // 1. Generar un número aleatorio
        int randomNum = (int)(Math.random() * 100) + 1;
        System.out.println("Introduce el primer valor");
        int n1 = leerDatos.nextInt();
        boolean intento = false;
        int fallo = 1;

        while (intento == false) {
            if (n1 >= 1 && n1 <= 100) {  
                if (randomNum != n1 && fallo < 5) {
                    System.out.println("No es valido, prueba otra vez, has cometido " + fallo + " fallos, de 5");
                    if (n1 < randomNum) {
                        System.out.println("El número es mayor!");
                    } else {
                        System.out.println("El número es menor!");
                    }
                    fallo++;
                    n1 = leerDatos.nextInt();
                } else if (randomNum == n1) {  
                    System.out.println("Lo has conseguido, el número era " + randomNum);
                    intento = true;
                } else if (fallo >= 5) {  
                    System.out.println("No lo conseguiste... \nFallos: " + fallo + "\nEl número era: " + randomNum);
                    intento = true;
                }
            } else {
                System.out.println("Solo números entre 1 y 100!");
                n1 = leerDatos.nextInt();
            }
        }
    }
}

