public class EJER6 {
    
    public static void main(String[] a) {
        double x = 2.0;
        int n = 4;
        System.out.println("La suma de la progresión geométrica para x = " + x + " y n = " + n + " es: " + geometricProgression(x, n));
    }
   
    public static double power(double base, int exponent) {  //  Función que calcula la potencia de un número (base, exponente)
        if (exponent == 0) {
            return 1; 
        } else if (exponent > 0) {
            double result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        } else {
            
            double result = 1;
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            return 1 / result; // Potencia negativa (1 / base^|exponent|)
        }
    }

    
    public static void showPowers(double a, int n) { //  Función que muestra las n primeras potencias de un número a
        for (int i = 0; i < n; i++) {
            System.out.print(power(a, i) + ", ");
        }
        System.out.println(); 
    }

    
    public static double geometricProgression(double x, int n) { //  Función que calcula la suma de la progresión geométrica
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += power(x, i); 
        }
        return sum;
    }

}
