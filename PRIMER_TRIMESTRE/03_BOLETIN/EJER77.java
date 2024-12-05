import java.io.*;

public class EJER77 {

    // c) Función que añade texto a un archivo usando el modo de anexado
    public static void appendFile2(String filename, String newText) throws IOException {
        // Abrimos el archivo en modo de anexado (true) para no sobrescribir el contenido
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));

        // Escribimos el nuevo texto al final del archivo
        writer.write(newText);
        writer.close();

        System.out.println("Texto añadido al archivo (modo append).");
    }

    // Función principal con 'throws Exception'
    public static void main(String[] a) throws Exception {
        try {
            // Prueba de la función appendFile2
            String filename = "archivo.txt"; // Aquí deberías poner el archivo del ejercicio 2
            String newText = "\nEste es el texto añadido usando appendFile2.";
            appendFile2(filename, newText);
        } catch (IOException e) {
            System.out.println("Error al añadir texto al archivo: " + e.getMessage());
        }
    }
}
