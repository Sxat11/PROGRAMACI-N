import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class EJER13 {
    /**
     * 
     * @param a numero de caras del dado a lanzar  
     * @return puntaje del dado lanzado
     */
    public static int tirada(int a) {
        int tirada;
        int limiteInf = 1;
        tirada = (int) (Math.random() * (a - limiteInf) + 1) + limiteInf;
        return tirada;
    }

    public static void main(String[] args) throws Exception {
        PrintWriter f = new PrintWriter("bol3ejer13.txt");
        Scanner scf = new Scanner(new File("bol3ejer13.txt"));
        Scanner sc = new Scanner(System.in);
        String nombreUsu;
        int dado1 = 0; 
        int dado2 = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int caras = 0;
        int aciertos;
        int limiteInf = 1;
        int repetir;
        System.out.print("¿Cual es tu nombre? ");
        nombreUsu = sc.nextLine();
        System.out.print("Bienvenido " + nombreUsu + ".");
        do {
            aciertos=0;
            System.out.println("Vamos a configurar el dado de juego");
            System.out.println("intruduce el numero de caras ( min: 6 / MAX: 120)");

            do {
                System.out.print("¿Cuantas caras quieres que tenga tu dado?: ");
                caras = sc.nextInt();
            } while (caras < 6 || caras > 120);
            System.out.println("ahora vamos a escoger tus números");
            do {
                System.out.print("dime tu primer número: ");
                num1 = sc.nextInt();
            } while (num1 < 1 || num1 > caras);
            do {
                System.out.print("dime tu segundo número: ");
                num2 = sc.nextInt();
            } while (num2 < 1 || num2 > caras || num2 == num1);
            do {
                System.out.print("dime tu tercer número: ");
                num3 = sc.nextInt();
            } while (num3 < 1 || num3 > caras || num3 == num1 || num3 == num2);

            System.out.println("\n");
            System.out.println("IA tira los dados: ");
            System.out.print("  primera tirada...");
            do {

                dado1 = tirada(caras);
            } while (dado1 < limiteInf || dado1 > caras);
            System.out.println(dado1);
            System.out.print("  segunda tirada...");
            do {
                dado2 = tirada(caras);
            } while (dado2 == dado1);
            System.out.println(dado2);

            System.out.println();
            System.out.printf("Juegas con los numeros %d, %d y %d \n", num1, num2, num3);
            System.out.printf("IA a ha sacado el %d y el %d", dado1, dado2);
            System.out.println("\n");
            if (dado1 == num1 || dado1 == num2 || dado1 == num3) {
                System.out.println("dado 1 -- ¡¡¡FELICIDADES!!! HAS ACERTADO");
                aciertos++;
            } else {
                System.out.println("dado 1 -- lo sentimos, no has tenido suerte");
            }
            if (dado2 == num1 || dado2 == num2 || dado2 == num3) {
                System.out.println("dado 2 -- ¡¡¡FELICIDADES!!! HAS ACERTADO");
                aciertos++;
            } else {
                System.out.println("dado 2 -- lo sientimos, no has tenido suerte");
            }
            System.out.printf("has acertado %d /2 posibilidades \n", aciertos);
            do {
                System.out.println("¿quieres jugar otra vez?");
                System.out.println("pulsa [1] para volver a jugar");
                System.out.println("pulsa [0] para salir");
                System.out.print("¿que deseas hacer?: ");
                repetir = sc.nextInt();
            } while (repetir != 1 && repetir != 0);
            
        f.printf("Nombre del jugador: "+nombreUsu);
        f.printf("    Caras del dado: %4d . Aciertos: %4d \n" ,caras, aciertos  );
        } while (repetir == 1);
        System.out.println("Cerrando programa... gracias por jugar");
        f.close();
    }
}

    