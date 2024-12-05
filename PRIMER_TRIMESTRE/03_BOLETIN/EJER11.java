public class EJER11 {

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(coseno(0.3));
    }

    public static double factorial(int num) {
        int sum = 1;
        int mult = 1;
        while (sum < num) {
            sum = sum + 1;
            mult = sum * mult;

        }
        return mult;
    }

    public static double coseno(double x) {
        //double resultado = 1 - ((Math.pow(x, 2)) / factorial(2)) + ((Math.pow(x, 4)) / factorial(4))
        //        - ((Math.pow(x, 6)) / factorial(6));
        double resultado = 1 - ((Math.pow(x, 2)) / factorial(2)) + ((Math.pow(x, 4)) / factorial(4))
               - ((Math.pow(x, 6)) / factorial(6));
        return resultado;

    }
}