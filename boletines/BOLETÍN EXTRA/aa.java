public class aa {

    public static void mostrarNumeros(boolean mostrarUnoAVeinte) {
        if (mostrarUnoAVeinte) {
            // Mostrar números del 1 al 20
            for (int i = 1; i <= 20; i++) {
                System.out.println(i);
            }
        } else {
            // Mostrar números pares entre 1 y 50, formateados en columnas de tamaño 5
            for (int i = 2; i <= 50; i += 2) {
                System.out.printf("%5d%n", i); // Formato de 5 caracteres, alineado a la derecha
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo con mostrarUnoAVeinte = true:");
        mostrarNumeros(true);
        
        System.out.println("\nEjemplo con mostrarUnoAVeinte = false:");
        mostrarNumeros(false);
    }
}

