import java.util.Scanner;

public class EJER88 {

    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número mayor que 2:");
        int limite = scanner.nextInt();

        if (limite <= 2) {
            System.out.println("El número debe ser mayor que 2");
        } else {
            System.out.println("Números primos menores que " + limite + ":");
            for (int i = 2; i < limite; i++) {
                if (primo(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }
}
