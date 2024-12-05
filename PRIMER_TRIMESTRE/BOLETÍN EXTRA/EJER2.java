import java.util.Scanner;

public class EJER2 {
    public static int DEVUELVE(double num1, double num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        double num1 = sc.nextDouble();
        System.out.println("Dime otro numero");
        double num2 = sc.nextDouble();
        int resultado = DEVUELVE(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
}
