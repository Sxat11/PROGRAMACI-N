package PENDIENTES;

import java.util.Scanner;

public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        double eu = 0;
        double lib = 0;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Euros a libras.");
            System.out.println("2.- Libras a euros.");
            System.out.println("3.- Salir.");
            System.out.println("Seleccione del 1-3.");
            option = sc.nextInt();
            switch (option) {
                case 1:// TODO confirmar (bucle) nº positivo

                    System.out.println("Cuantos Euros quieres pasar a Libras?");
                    eu = sc.nextInt();
                    if (eu > 0) {
                        lib = eu * 0.86;
                        System.out.println(lib + " Libras");
                    } else {
                        System.out.println("No se admiten valores negativos");
                    }
                    break;
                case 2:
                    System.out.println("Cuantas Libras quieres pasar a Euros?");
                    lib = sc.nextInt();
                    if (eu > 0) {
                        eu = lib / 0.86;
                        System.out.println(eu + " Euros");
                    } else {
                        System.out.println("No se admiten valores negativos");
                    }
                    break;
                case 3:
                    System.out.println("Adios!!");
                    break;

            }

        } while (option != 3);

    }
}
