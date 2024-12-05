package CORREGIDOS;
import java.util.Scanner;
public class Bol2_Ejer9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int cont;
int num;
int n1;
int max=Integer.MIN_VALUE;


System.out.println("Cuantos números deseas introducir?");
cont= sc.nextInt();

for(num=0;  num<cont; num++){
    System.out.println("Introduce el numero");
    n1= sc.nextInt();
    if (n1 > max) {
        max = n1;
    }
}
System.out.println("El número máximo introducido es el " + max);
}





}


