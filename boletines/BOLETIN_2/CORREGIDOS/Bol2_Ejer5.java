package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C;
        double K;
        double F;
        int answer;
        System.out.println("Dime la temperatura en grados Celsious");
        C = sc.nextDouble();
        System.out.println("Quieres la temperatura en grados Kelvin(1), en grados Farenhein(2) o salir(3)");
        answer = sc.nextInt();
        do {
            if (answer == 1) {
                K = C + 273.15;
                System.err.println("La temperatura en grados Kelvin es de " + K);
                answer = 0;
                System.out.println("Dime la temperatura en grados Celsious");
                C = sc.nextDouble();
                System.out.println("Quieres la temperatura en grados Kelvin(1), en grados Farenhein(2) o salir(3)");
                answer = sc.nextInt();
            }
            if (answer == 2) {
                F = C * 1.8 + 32;
                System.err.println("La temperatura en grados Farenhein es de " + F);
                answer = 0;
                System.out.println("Dime la temperatura en grados Celsious");
                C = sc.nextDouble();
                System.out.println("Quieres la temperatura en grados Kelvin(1), en grados Farenhein(2) o salir(3)");
                answer = sc.nextInt();
            }
        } while (answer != 3);

        System.out.println("Gracias por usarme");

    }

}