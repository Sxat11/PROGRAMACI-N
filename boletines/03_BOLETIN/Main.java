import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("archivo.txt"))) {
            escritor.write("Línea 1: Hola, mundo");
            escritor.newLine(); // Salto de línea
            escritor.write("Línea 2: Aprendiendo Java");
            escritor.newLine();
            escritor.write("Línea 3: Escritura en múltiples líneas");
            System.out.println("Texto escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}