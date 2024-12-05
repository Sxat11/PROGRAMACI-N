package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        int i;
        System.out.print("Introduce un número: ");
         numero= scanner.nextInt();
        if (numero > 0) {
        
            for (i = 1; i <= numero; i++) {
                suma = suma + i;
            }
            System.out.println("La suma de los números desde 1 hasta " + numero + " es: " + suma);
        } else {
            
            System.out.println("El número no es positivo");
        }

    }
}