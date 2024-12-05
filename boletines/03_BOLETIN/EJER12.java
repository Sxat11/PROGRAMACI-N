import java.util.Scanner;

public class EJER12 {

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige tu quieniela:");
        System.out.println("Quiniela normal(1) - Quiniela ponderada(2)");
        int salir;

        while (choice != 1 || choice != 2) {
            choice = sc.nextInt();

            if (choice == 1) {
                quiniela();
            } else {
                if (choice == 2) {
                    quinielaPonderada();
                } else {
                    System.out.println("Responde 1 o 2");
                }
            }
            System.out.println("Quieres jugar otra vez??(SI(1) NO(2))");
            salir= sc.nextInt();
            if (salir==2) {
                break;
                
            }
            else{
            System.out.println("Quiniela normal(1) - Quiniela ponderada(2)");
            }
        }


    }

    public static char quiniela() { //QUINIELA DE PROBABILIDAD TíPICA

        int sorteoResultado;
        for (int i = 1; i <= 14; i++) {
            sorteoResultado = (int) (Math.random() * 3) + 1;

            if (sorteoResultado == 1) {
                System.out.print('1');
                // return '1';
            }
            if (sorteoResultado == 2) {
                System.out.print('X');
                // return 'X';
            }
            if (sorteoResultado == 3) {
                System.out.print('2');
            } else {

                // return '2';
            }
            System.out.print("| PARTIDO ");
            System.out.printf("%02d\n", i);
        }
        return 'E';

    }

    public static char quinielaPonderada() { //QUINIELA AJUSTADA

        int sorteoResultado;
        for (int i = 1; i <= 14; i++) {
            sorteoResultado = (int) (Math.random() * 100) + 1;
            // System.err.println(sorteoResultado);
            if (sorteoResultado < 61) {
                System.out.print('1');
                // return '1';
            }
            if (sorteoResultado >= 60 && sorteoResultado <= 86) {
                System.out.print('X');
                // return 'X';
            }
            if (sorteoResultado > 86) {
                System.out.print('2');
            } else {

            }
            System.out.print("| PARTIDO ");
            System.out.printf("%02d\n", i);
        }
        return 'E';

    }

}
