package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer19a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántos asteriscos deseas dibujar?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}
