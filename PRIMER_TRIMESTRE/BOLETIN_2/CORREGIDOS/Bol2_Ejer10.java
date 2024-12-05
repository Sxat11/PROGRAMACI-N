package CORREGIDOS;
import java.util.Scanner;
public class Bol2_Ejer10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int var1;
    int var2;
    int temp;
    System.out.println("Dime el valor de una variable");
    var1 = sc.nextInt();
    System.out.println("Variable A con valor "+var1+" ");
    System.out.println("Dime el valor de una variable");
    var2 = sc.nextInt();
    System.out.println("Variable B con valor "+var2+" ");
    System.out.println();
    temp=var1;
    var1=var2;
    var2= temp;


    System.out.println("Variables intercambiadas");
    System.out.println("");
    System.out.println("Variable A con valor "+var1+" ");
    System.out.println("Variable B con valor "+var2+" ");
}
    

}
