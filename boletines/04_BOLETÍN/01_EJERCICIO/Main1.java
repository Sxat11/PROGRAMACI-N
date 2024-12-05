import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometria rectangulo = new Geometria(3.0,5.0,true);

        System.out.println("Datos del rectángulo:");
        System.out.println("Tipo: " + rectangulo.tipo());
        // System.out.println("Base: " + rectangulo.setBase());
        // System.out.println("Altura: " + rectangulo.setAltura());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perímetro());
        System.out.printf("Diagonal:  %.3f: ",rectangulo.diagonal());
        
    }
}
