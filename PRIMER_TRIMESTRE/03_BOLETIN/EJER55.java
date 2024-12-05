import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EJER55 {

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
    }

    public static void main(String[] args) throws IOException {
        // Scanner para recibir el año del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Pedir el año al usuario
        System.out.print("Introduce un año: ");
        int añoInicio = scanner.nextInt();
        int añoActual = java.time.Year.now().getValue(); // Año actual
        
        // Listado de los años bisiestos
        List<Integer> bisiestos = new ArrayList<>();

        // Comprobamos si el año inicial es bisiesto
        String bisiestoTexto = esBisiesto(añoInicio) ? "Es bisiesto." : "No es bisiesto.";

        // Añadir todos los años bisiestos desde el año inicial hasta el actual
        for (int i = añoInicio; i <= añoActual; i++) {
            if (esBisiesto(i)) {
                bisiestos.add(i);
            }
        }

        // Guardar en archivo
        try (FileWriter fileWriter = new FileWriter("bisiestos.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(añoInicio + " " + bisiestoTexto); // Guardar el año inicial y su estado
            for (int año : bisiestos) {
                printWriter.println(año); // Guardar todos los años bisiestos
            }
        }

        // Leer del archivo y mostrar los años bisiestos en pantalla
        try (BufferedReader reader = new BufferedReader(new FileReader("bisiestos.txt"))) {
            // Leemos la primera línea
            String primeraLinea = reader.readLine();
            System.out.println(primeraLinea);  // Imprimir la primera línea

            // Leemos el resto de los años bisiestos y almacenarlos
            List<String> añosBisiestos = new ArrayList<>();
            String linea;
            while ((linea = reader.readLine()) != null) {
                añosBisiestos.add(linea);
            }

            // Mostrar los años bisiestos en una sola línea, separados por comas y con un formato de 6 caracteres
            for (int i = 0; i < añosBisiestos.size(); i++) {
                if (i > 0) { // Asegurarnos de no poner coma antes del primer año
                    System.out.print(", ");
                }
                System.out.printf("%6s", añosBisiestos.get(i)); // Imprimir con 6 caracteres de ancho
            }
        }

        scanner.close();
    }
}
