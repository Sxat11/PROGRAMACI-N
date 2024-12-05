package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer1 {
    public static void main(String[] args) {
        int num = 0;
        int start = 1;
        int resto = 0;

        while (start == 1) {
            num = num + 1;
            resto = num % 2;
            if (resto == 0) {
                System.out.print(" " + num + " ");
                
            }
            
            if (num > 50) {
                num = 0;
                start = 2;
            }

        }
        ;

        do {
            System.out.println(num);
            num = num + 1;
          
        } while (num <= 20);
        
        num = 0;
     

        for (num = 0; num <=20; num = num + 1) {
        
            System.out.println(num);
            // if (num > 19) {
            //     start = 0;
            // }
        }

    }
}
