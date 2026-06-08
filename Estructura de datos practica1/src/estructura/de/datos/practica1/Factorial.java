
package estructura.de.datos.practica1;
import java.util.Scanner;
/**
 *
 * @author prisc
 */


public class Factorial {

    // Función recursiva
    public static int factorialRecursivo(int n) {

        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        }

        // Llamada recursiva
        return n * factorialRecursivo(n - 1);
    }

    // Función iterativa
    public static int factorialIterativo(int n) {

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Llamada a la función recursiva
        int factorialR = factorialRecursivo(numero);

        // Llamada a la función iterativa
        int factorialI = factorialIterativo(numero);

        System.out.println("\nFactorial Recursivo: " + factorialR);
        System.out.println("Factorial Iterativo: " + factorialI);
    }
}

 


