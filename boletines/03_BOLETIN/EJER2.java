import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EJER2 {

    public static void lineas(int n) { //IMPRIME LINEA EN BLANCO
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }

    public static boolean par(int num) { //DETECTA SI ES PAR O IMPAR
        return num % 2 == 0;
    }

    public static char posoneg(int num) { //DETECTA SI ES POSITIVO O NEGATIVO
        return (num >= 0) ? 'P' : 'N';
    }

    public static void main(String[] a) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        lineas(10);

        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();

        String parImpar = par(numero) ? "par" : "impar";

        char signo = posoneg(numero);
        String positivoNegativo = (signo == 'P') ? "positivo" : "negativo";

        System.out.println("El número " + numero + " es " + parImpar + " y " + positivoNegativo);

        FileWriter fileWriter = new FileWriter("Ejer2.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(nombre); //ESCRIBE EL NOMBRE
        printWriter.println(numero); //ESCRIBE EL NÚMERO
        printWriter.println("El número es " + parImpar + " y " + positivoNegativo); //ESCRIBE COMO ES EL NÚMERO
        printWriter.close();
        fileWriter.close();
        scanner.close();
    }
}
