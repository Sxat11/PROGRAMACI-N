package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double numero;

        do {
            System.out.println("Introduce un número (0 para terminar): ");
            numero = scanner.nextDouble();

            if (numero != 0) {
                suma = suma + numero;
                contador= contador + 1;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No son números válidos.");
        }
    }
}
