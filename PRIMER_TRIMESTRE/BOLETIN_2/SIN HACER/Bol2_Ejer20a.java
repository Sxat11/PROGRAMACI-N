import java.util.Scanner;

public class Bol2_Ejer20a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estrellas;
        int cont = 0;
        int estrellastemp;
        System.out.println("Cuantas estrellas quieres en la piramide");
        estrellas = sc.nextInt();
        estrellastemp = estrellas;
        while (estrellastemp > cont) {
            System.out.print("*");
            cont++;

        }
        while (estrellas>0) {
        System.out.println();
        estrellas= estrellas-1;
        estrellastemp= estrellas; 
        cont = 0;
        while (estrellastemp > cont) {
            System.out.print("*");
            cont++;

        }
        
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
}