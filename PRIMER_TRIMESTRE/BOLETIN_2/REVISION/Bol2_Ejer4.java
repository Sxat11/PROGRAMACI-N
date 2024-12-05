package PENDIENTES;

import java.util.Scanner;

public class Bol2_Ejer4 {
    public static void main(String[] args) {
        int Entero;
        double Real;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        Entero = sc.nextInt();

        
        System.out.print("Introduce un número real: ");
        Real = sc.nextDouble();


        //Solo un printf
        System.out.println("Número entero en decimal: " + Entero);

        System.out.printf("Número entero en octal (con 5 caracteres, ceros a la izquierda): %05o\n", Entero,
        "Número entero en hexadecimal (mayúsculas): %X\n", Entero,
        "Número real con 3 decimales (mínimo 7 caracteres): %7.3f\n", Real);

      
       
        sc.close();
    }
}
