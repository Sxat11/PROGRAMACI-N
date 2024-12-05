package CORREGIDOS;
import java.util.Scanner;

public class Bol2_Ejer20a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estrellas;
        int cont = 0;
        int estrellastemp;
        System.out.print("Cuantas estrellas quieres en la piramide");
        estrellas = sc.nextInt();
        estrellastemp = estrellas-estrellas+1;


        while (estrellas+1>estrellastemp) {
        cont=0;
        while (cont<estrellastemp){
            System.out.print("*");
            cont++;
        }
        System.out.println();
        estrellastemp++;
    }    
    }
    }
