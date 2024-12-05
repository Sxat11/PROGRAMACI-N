import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EJER22 {

    // a) Función que imprime n líneas en blanco
    public static void imprimirLineasEnBlanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    // b) Función que devuelve true si el número es par, false si no lo es
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    // c) Función que devuelve 'P' si el número es positivo o cero, 'N' si es negativo
    public static char tipoNumero(int num) {
        return (num >= 0) ? 'P' : 'N';
    }

    public static void main(String[] a) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre del usuario
        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        // Imprimir 10 líneas en blanco
        imprimirLineasEnBlanco(10);

        // Pedir el número entero al usuario
        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si el número es par o impar
        String parImpar = esPar(numero) ? "par" : "impar";

        // Determinar si el número es positivo o negativo
        char signo = tipoNumero(numero);
        String positivoNegativo = (signo == 'P') ? "positivo" : "negativo";

        // Mostrar los resultados en pantalla
        System.out.println("El número " + numero + " es " + parImpar + " y " + positivoNegativo + ".");

        // Guardar los resultados en un archivo utilizando PrintWriter y FileWriter
        FileWriter fileWriter = new FileWriter("Ejer2.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(nombre);  // Escribe el nombre en el archivo
        printWriter.println(numero);  // Escribe el número en el archivo
        printWriter.println("El numero es " + parImpar + " in " + positivoNegativo + ".");  // Escribe la descripción

        // Cerrar el PrintWriter y el FileWriter
        printWriter.close();
        fileWriter.close();

        scanner.close();
    }
}
