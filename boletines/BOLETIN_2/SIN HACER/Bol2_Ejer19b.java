import java.util.Scanner;

public class Bol2_Ejer19b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int asteriscos;
        System.out.print("¿Cuántos asteriscos deseas dibujar? ");
        asteriscos = scanner.nextInt();
        System.out.print("¿De izquierda a derecha (1) o de derecha a izquierda (2)? ");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            for (int i = 0; i < asteriscos; i++) {
                System.out.println("*");
                for (int cont = 0; asteriscos > cont; cont++) {
                    System.out.print(" ");
                }

            }

        }
    }
}
