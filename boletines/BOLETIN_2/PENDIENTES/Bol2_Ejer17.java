package PENDIENTES;

import java.util.Scanner;

public class Bol2_Ejer17 {
    public static void main(String[] args) { // TODO Menores o = que 100
        Scanner sc = new Scanner(System.in);
        int again = 1;
        while (again == 1) {
            int num = 0;
            int mult = 2;
            int xx = 0;
            int sum = 0;
            int ans = -5;
            while (num <= 0) {
                System.out.println("Introduzca nº entre 1 y 50:");
                num = sc.nextInt();
            }
            if (num > 50) {
                System.out.println("El numero debe ser menor a 50");
            }
            if (num <= 50) {
                mult = 0;
                while (mult < 100) {
                    xx = xx + 1;

                    mult = num * xx;
                    if (mult <= 100) {
                        sum = sum + mult;

                        System.out.print(mult + " ");
                    }
                }
                System.out.println();
                System.out.println("La suma de los numeros es de:" + sum);
                System.out.println();
                while (ans >= 3 || ans <= 0) {
                    System.out.println("Desea probar otro numero. SI(1)/NO(2)");
                    ans = sc.nextInt();
                }
                if (ans == 1) {
                    again = 1;
                }
                if (ans == 2) {
                    again = 0;
                    System.out.println("Gracias por usarme");
                }
            }
        }

    }
}
