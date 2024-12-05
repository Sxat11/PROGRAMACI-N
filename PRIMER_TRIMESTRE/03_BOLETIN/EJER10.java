import java.util.Scanner;

public class EJER10 {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in); // Decide el método para calcular el area
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Cuadrado.");
            System.out.println("2.- Rectángulo.");
            System.out.println("3.- Triángulo.");
            System.out.println("4.- Circulo.");
            System.out.println("5.- Salir.");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(areaCuadrado(option));
                    break;
                case 2:
                    System.out.println(areaTrianguloRectangulo(0, 0, false));
                    break;
                case 3:
                    System.out.println(areaTrianguloRectangulo(0, 0, false));
                    break;
                case 4:
                    System.out.println(areaCirculo(0));
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (option != 5);
        sc.close();
    }

    public static double areaTrianguloRectangulo(double base, double altura, boolean flag) {
        Scanner sc = new Scanner(System.in);
        Double area;
        System.out.println("Dime la base de tu figura"); // Pide base y altura
        base = sc.nextInt();
        System.out.println("Dime la altura de tu figura");
        altura = sc.nextInt();

        if (base == altura) { // Detecta si es un triángulo o un rectángulo
            flag = false;
        } else {
            flag = true;
        }
        if (flag) { // Calcula área rectángulo
            area = base * altura;
            return area;
        } else {
            area = (base * altura) / 2; // Calcula área triángulo
            return area;
        }

    }

    public static double areaCuadrado(double base) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado de tu cuadrado"); // Pide el lado
        base = sc.nextInt();
        double area = base * base;
        return area;

    }

    public static double areaCirculo(double radio) {
        Scanner sc = new Scanner(System.in);
        double area;
        System.out.println("Dime el radio de tu circulo"); // Pide el radio
        radio = sc.nextInt();

        area = (radio * radio) * Math.PI;
        return area;

    }

}
