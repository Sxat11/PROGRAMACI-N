import java.util.Scanner;

public class EJER3 {
    public static void main(String[] args) {// TODO docs
        double radio;
        double altura;
        double superficie;
        String frase = "La superficie es de ";
        System.out.println("Dime el radio");
        radio = pedirDato();
        System.out.println("Dime la altura");
        altura = pedirDato();
        superficie = superficieCilindro(radio, altura);
        mostrarDato(frase, superficie);

    }

    public static double pedirDato() { // MÉTODO QUE PIDE EL NÚMERO Y DICE SI ES POSITIVO
        double dato;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduzca un dato positivo");
            dato = sc.nextDouble();
            if (dato < 0) {
                System.out.println("Por favor dame un número positivo");
            }
        } while (dato < 0);

        return dato;
    }

    public static double superficieCilindro(double radio, double altura) { // REALIZA LA OPERACIÓN QUE CALCULA EL AREA
                                                                           // DEL CILINDRO
        double superficie = 2 * Math.PI * radio * altura;

        return superficie;
    }

    public static void mostrarDato(String frase, double superficie) { // TODO mensaje // MUESTRA EL DATO CALCULADO
        System.out.printf(frase + "%.3f\n", superficie);
    } // "%.3f\n"
        
}