public class EJERCICIO1 {

    public static void main(String[] args) {
        bucles();
    }

    static void bucles() {
        for (int num = 39; num > 4; num = num - 2) { // Declara los número impares
            System.out.printf("%d", num); // Escribe los número utilizando printf
            System.out.println();
        }
        System.out.println();
        int suma = 1;
        for (int num2 = 2; num2 < 10; num2 = num2 + 2) { // Declara los múltiplos de 2
            suma = num2 * suma; // Multiplica los múltiplos de 2
        }
        System.out.println(suma);
    }
}