package PENDIENTES;
import java.util.Scanner;

public class Bol2_Ejer18 {
    public static void main(String[] args) {
        int num;
        int sum = 1;
        int mult = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero");
        num = sc.nextInt();
        while (sum < num) {
            sum = sum + 1;
            mult = sum * mult;

        }
        System.out.println(mult);

        sum = 0;
        mult = 1;
        System.out.println("Di un numero");//TODO 0!
        num = sc.nextInt();
        do {
            sum = sum + 1;
            mult = sum * mult;
        } while (sum < num);
        System.out.println(mult);

     
        mult = 1;
        System.out.println("Di un numero");
        num = sc.nextInt();
        for (sum = 1; sum < num; ) {
            sum = sum + 1;
            mult = sum * mult;
           


           
        }
        System.out.println(mult);

    }
}
