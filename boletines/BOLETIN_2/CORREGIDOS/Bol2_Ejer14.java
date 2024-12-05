package CORREGIDOS;
import java.util.Scanner;
public class Bol2_Ejer14 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int neg=0;
    int num=1;
    int cont=-1;
    while (num != 0) {
        System.out.println("Introduce número");
        num = sc.nextInt();
        cont = cont + 1;
        if (num < 0) {
            neg = neg + 1;
        }
       
    }
    System.out.println("Se introdujeron "+ neg +" números negativos de un total de "+ cont +".");


   }
}
