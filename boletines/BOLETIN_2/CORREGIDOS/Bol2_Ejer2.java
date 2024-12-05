package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2;
        int n1;
        int resto;

        System.out.println("Escribe un numero");
        n1 = sc.nextInt();
        System.out.println("Escribe otro numero");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println(n1 + " es mayor que " + n2);
            // resultDiv=n1/n2;
            resto = n1 % n2;
            if (resto == 0) {
                System.out.print(n2 + " es multiplo de " + n1);
            } else {
                System.out.print("No son multiplos");
            }
            ;

        }
        if (n2 > n1) {
            System.out.println(n2 + " es mayor que " + n1);

            resto = n2 % n1;
            if (resto == 0) {
                System.out.print(n2 + " es multiplo de " + n1);
            } else {
                System.out.print("No son multiplos");
            }

        }
        if (n1 == n2) {
            System.out.print("Ambos numeros tienen el mismo valor");
        }

    }
}
