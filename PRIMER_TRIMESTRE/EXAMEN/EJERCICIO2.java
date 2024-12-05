public class EJERCICIO2 {
    public static void main(String[] args) {
        System.out.println(calculos(7, 0));
    }

    static double calculos(double num1, double num2) {
        double resultado = 1;
        if (num2 > 0) {
            for (int i = 0; i < num2; i++) {
                resultado = resultado * num1;
            }

        }
        if (num2 < 0) {
            num2 = -num2;
            resultado = num1 % num2;

        } else {
            if (num1 < 10) {
                resultado = (int) ((Math.random() * 20) + 10);

            } else {
                resultado = (int) ((Math.random() * num1) + 1);
            }
        }
        return resultado;
    }
}
