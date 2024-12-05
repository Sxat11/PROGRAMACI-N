import java.util.Scanner;
public class Bol2_Ejer20b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estrellas;
        int cont = 0;
        int estrellastemp;
        int espacio;
        int contstar=0;
        int contstar2=0;
        int contespacio;
        System.out.print("Cuantas filas quieres en la piramide: ");
        estrellas = sc.nextInt();
        espacio = estrellas;
        estrellastemp = estrellas-estrellas+1;

        while (estrellas+1>estrellastemp) {
        cont=0;
        contespacio=0;
        while (espacio>contespacio) {
        System.out.print(" ");
        contespacio++;
        }
        while (cont<estrellastemp){
            while (contstar < estrellas) {
            System.out.print("*");
            contstar++;
            contstar2= contstar + contstar2;
        }
            cont++;
        }
        espacio= espacio-1;
        System.out.println();
        estrellastemp++;
    }    
    }
    }
