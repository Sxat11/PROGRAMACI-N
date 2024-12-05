import java.util.Scanner;

public class Bol2_Ejer13b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int resto = 0;
        int suma = 0;
        System.out.println("suma de números impares");

        for (n1 = sc.nextInt(); n1 > 0; n1 = n1 - 2) {
            suma = suma + n1;

        }
        System.out.println(suma);

    }

}
