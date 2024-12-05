import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double num;
       // double hexa;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Cuadrado.");
            System.out.println("2.- Inverso de un numero.");
            System.out.println("3.- Raíz cuadrada.");
            System.out.println("4.- Operacion AND.");
            System.out.println("5.- Oppercion OR.");
            System.out.println("6.- Salir");
            System.out.println("Teclee opción (1-6)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime tu numero");
                    num = sc.nextDouble();
                    num = num * num;
                    System.out.println(num);
                    break;
                case 2:
                    System.out.println("Dime tu numero");
                    num = sc.nextDouble();
                    num = 1 / num;
                    System.out.println(num);
                    break;
                case 3:
                    System.out.println("Dime tu numero");
                    num = sc.nextDouble();
                    if (num>0){
                    num = Math.sqrt(num);
                    System.out.printf("%7.3f\n",num);}
                    break;
                case 4: // Algoritmo de división
                    System.out.println("Dime tu numero");
                    num= sc.nextDouble();
                    System.out.printf("%X\n num");
                    System.out.println("Dime el otro número");
                 //hexa=sc.nextDouble();
                   //  System.out.printf("%X\n hexa");
                    break;
                case 5:
                    System.out.println("Dime tu numero");
                    break;
                case 6:
                    System.out.println("Adios!!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);
   
    }

}