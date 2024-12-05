import java.util.Scanner;

public class EJERCICIO5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Bucles.");
            System.out.println("2.- Calculos.");
            System.out.println("3.- Media o Suma.");
            System.out.println("4.- Salir");
            System.out.println("Teclee opción (1-4)");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    bucles();
                    break;

                case 2:
                    double a;
                    double b;
                    System.out.println("Dime el primer número");
                    a = sc.nextDouble();
                    System.out.println("Dime el segundo número");
                    b = sc.nextDouble();
                    System.out.println(calculos(a, b));
                    break;

                case 3:
                    int c;
                    boolean bandera;
                    System.out.println("Dime la cantidad de números");
                    c = sc.nextInt();
                    System.out.println("Dime el valor de la bandera(true o false)");
                    bandera = sc.nextBoolean();
                    while (bandera != true || bandera != false) {
                        System.out.println("Dime el valor de la bandera(true o false)");
                        bandera = sc.nextBoolean();
                    }
                    mediasOSumas(c, bandera);
                    break;

                default:
                    break;
            }
        } while (option != 4);
    }

    static void bucles() {
        for (int num = 39; num > 4; num = num - 2) { // Declara los número impares
            System.out.printf("%d", num); // Escribe los número utilizando printf
            System.out.println();
        }
        System.out.println();
        int suma = 1;
        for (int num2 = 2; num2 < 10; num2 = num2 + 2) { // Declara los múltiplos de 2
            suma = num2 * suma; // Multiplica los múltiplos de 2
        }
        System.out.println(suma);
    }

    static double calculos(double num1, double num2) {
        double resultado = 1;
        if (num2 > 0) {
            for (int i = 0; i < num2; i++) {
                resultado = resultado * num1;
            }

        }
        if (num2 < 0) {
            num2 = -num2;
            resultado = num1 % num2;

        } else {
            if (num1 < 10) {
                resultado = (int) ((Math.random() * 20) + 10);

            } else {
                resultado = (int) ((Math.random() * num1) + 1);
            }
        }
        return resultado;
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

        } else { // MEDIA
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Dame los números");
                num = sc.nextInt();
                suma = num + suma;
            }
            suma = suma / cantidad;
            return suma;
        }

    }
}