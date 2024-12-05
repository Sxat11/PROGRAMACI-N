import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {
        // Muestra mensaje de bienvenida
        System.out.println("¡Bienvenido al programa de suma de dos números!");

        // Crear objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Muestra mensaje de pedir primer número
        System.out.println("Por favor, introduce el primer número:");
        int numero1 = input.nextInt();

        // Muestra mensaje de pedir segundo número
        System.out.println("Por favor, introduce el segundo número:");
        int numero2 = input.nextInt();
        
        // Declarar variable, sumar los números y guardar el resultado
        int suma = numero1 + numero2;
        
        // Mostrar variable resultado
        System.out.println("La suma de los dos números es: " + suma);
    }
}
