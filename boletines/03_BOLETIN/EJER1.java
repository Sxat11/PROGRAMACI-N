import java.util.Scanner;

public class EJER1 { // TODO docs

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        lineasBlanco(10);
        System.out.println("Dime un número");
        int num = sc.nextInt();
        System.out.println("Hola " + nombre);
        System.out.println(num + " es un número " + par(num) + " y " + posoNeg(num));
        sc.close();
    }

    public static void lineasBlanco(int n) { // Deja N líneas en blanco
        for (int i = 0; i < n; i++) {
            System.out.println();

        }
    }

    public static boolean par(int p) { // Dice si un número es par o no
        if (p % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static char posoNeg(int s) { // Dice si un número es negativo o positivo

        return (s >= 0) ? 'P' : 'N';
    }

}
