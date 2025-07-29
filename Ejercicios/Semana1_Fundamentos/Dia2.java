// Ejercicio: Calculadora básica
// 1. Crear variables para dos números
// 2. Realizar suma, resta, multiplicación, división y módulo
// 3. Mostrar resultados formateados

public class Dia2 {
    public static void main (String [] args) {
        //1. Crear variables para dos números
        int n1 = 6;
        int n2 = 9;

        //2. Realizar sumas, restas...
        int suma = n1 + n2;
        int resta = n2 - n1;
        int multiplicacion = n1 * n2;
        double division = n2/n1;
        double resto = n2%n1;

        //3. Mostrar resultados
        System.out.println("Valores = " + n1 + " y " + n2 + "\nSuma = " + suma + "\nResta = " + resta + "\nMultiplicación = " + multiplicacion + "\nDivisión = " + division + "\nResto = " + resto);

    }
}
