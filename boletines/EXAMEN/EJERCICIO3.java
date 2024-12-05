import java.util.Scanner;

public class EJERCICIO3 {

    public static void main(String[] args) {

        System.out.println("La suma/media de todos estos números es " + mediasOSumas(3, false));
    }

    static int mediasOSumas(int cantidad, boolean flag) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int num;
        if (flag = false) { // SUMA
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame los números");
                num = sc.nextInt();
                suma = num + suma;
            }
            return suma;

        } else {    //MEDIA
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame los números");
                num = sc.nextInt();
                suma = num + suma;
            }
            suma=suma/cantidad;
            return suma;
        }

    }
}