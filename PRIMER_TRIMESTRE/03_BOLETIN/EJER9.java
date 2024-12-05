import java.io.*;
import java.util.Scanner;

public class EJER99 {

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // El 1 no es primo
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { // Solo se verifica hasta la raíz cuadrada
            if (numero % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }
        return true; // Si no se ha encontrado ningún divisor, es primo
    }

    // Función para mostrar los números primos menores que el límite
    public static void mostrarPrimosMenoresQue(int limite) {
        System.out.println("Números primos menores que " + limite + ":");
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Función para leer un archivo con números y mostrar si son primos
    public static void primosDesdeArchivo(String archivo) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = reader.readLine()) != null) {
            try {
                int numero = Integer.parseInt(linea.trim());
                System.out.println(numero + " es primo: " + esPrimo(numero));
            } catch (NumberFormatException e) {
                System.out.println("No es un número válido: " + linea);
            }
        }
        reader.close();
    }

    // Función para guardar los números primos en un archivo
    public static void guardarPrimosEnArchivo(int limite, String archivo) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
        for (int i = 2; i < limite; i++) {
            if (esPrimo(i)) {
                writer.write(i + ";");
            }
        }
        writer.close();
        System.out.println("Primos guardados en el archivo: " + archivo);
    }

    // Función principal con menú
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Mostrar primos menores que un número");
            System.out.println("2. Verificar primos desde un archivo");
            System.out.println("3. Guardar primos en un archivo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número mayor que 2: ");
                    int limite = scanner.nextInt();
                    if (limite <= 2) {
                        System.out.println("El número debe ser mayor que 2.");
                    } else {
                        mostrarPrimosMenoresQue(limite);
                    }
                    break;

                case 2:
                    System.out.print("Introduce el nombre del archivo con números: ");
                    String archivoEntrada = scanner.next();
                    try {
                        primosDesdeArchivo(archivoEntrada);
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Introduce un número mayor que 2: ");
                    int limiteArchivo = scanner.nextInt();
                    System.out.print("Introduce el nombre del archivo donde guardar los primos: ");
                    String archivoSalida = scanner.next();
                    try {
                        guardarPrimosEnArchivo(limiteArchivo, archivoSalida);
                    } catch (IOException e) {
                        System.out.println("Error al guardar el archivo: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
