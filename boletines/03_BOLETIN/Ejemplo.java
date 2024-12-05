import java.util.Scanner;

public class Ejemplo {

    // Método que recibe dos parámetros y los pasa a otras variables
    public static void metodoA(double parametro1, double parametro2) {
        // Asignamos los parámetros a dos variables locales
        double variable1 = parametro1;
        double variable2 = parametro2;

        // Llamamos a otro método y le pasamos las variables locales
        metodoB(variable1, variable2);
    }

    // Segundo método que recibe dos parámetros
    public static void metodoB(double num1, double num2) {
        System.out.println("El primer número recibido en metodoB es: " + num1);
        System.out.println("El segundo número recibido en metodoB es: " + num2);
    }

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese dos números de tipo double
        System.out.print("Ingresa el primer número: ");
        double valor1 = sc.nextDouble(); // Lee el primer número

        System.out.print("Ingresa el segundo número: ");
        double valor2 = sc.nextDouble(); // Lee el segundo número

        // Llamamos a metodoA con los valores introducidos por el usuario
        metodoA(valor1, valor2);
        
        // Cerramos el scanner
        sc.close();
    }
}
