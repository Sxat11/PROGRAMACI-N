import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class última {
    public static void main(String[] args) {
        String nombreArchivo = "Ejer5.txt"; // Nombre del archivo a leer

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            linea = lector.readLine();
            System.out.println(linea);

            linea = lector.readLine();
            System.out.println(linea);

            linea = lector.readLine();// Lee línea por línea
            System.out.println(linea);
           

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
