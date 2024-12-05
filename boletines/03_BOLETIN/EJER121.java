import java.util.Scanner;
import java.io.PrintWriter;

public class EJER121 {

    public static void main(String[] args) throws Exception {
        PrintWriter f = new PrintWriter("Ejercicio2.txt");
        String name="mil";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        
        f.print("Prueba de archivos. ");
        f.println("Hola que tal.\n\n"); 
        f.printf("%5.2f\n", Math.PI);






        sc.close();
    }

    public static void lineasBlanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();

        }
    }

    public static String par(int p) {
        if (p % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }

    }

    public static String posoNeg(int s) {

        return (s >= 0) ? "positivo" : "negativo";

    }

}
