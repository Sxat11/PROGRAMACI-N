import  java.util.Random;
import java.util.Scanner;

public class Bol2_Ejer22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
      
        final int NUMERO_CABALLOS = 4;
        final int LONGITUD_PISTA = 10;  
        
     
        int[] posiciones = new int[NUMERO_CABALLOS];
        
    
        System.out.println("Selecciona un caballo (1 a 4):");
        int seleccion = scanner.nextInt();
        
        if (seleccion < 1 || seleccion > 4) {
            System.out.println("Selección inválida. Por favor, elija un número entre 1 y 4.");
            return "ERROR";
        }

        System.out.println("¡Empieza la carrera!");
        
        boolean carreraEnCurso = true;
        while (carreraEnCurso) {
            
            int caballoMovido = random.nextInt(NUMERO_CABALLOS);
            int movimiento = random.nextInt(3) + 1; 
            
           
            posiciones[caballoMovido] += movimiento;
            
           
            for (int i = 0; i < NUMERO_CABALLOS; i++) {
                System.out.print("Caballo " + (i + 1) + ": ");
                
                // Mostrar la posición del caballo en la pista
                for (int j = 0; j < posiciones[i]; j++) {
                    System.out.print("-");
                }
                
                System.out.println(">");
            }
            
            System.out.println();
            
            
            for (int i = 0; i < NUMERO_CABALLOS; i++) {
                if (posiciones[i] >= LONGITUD_PISTA) {
                    carreraEnCurso = false;
                    System.out.println("¡El caballo " + (i + 1) + " ha ganado la carrera!");
                    
                    // Determinar si el usuario ganó
                    if (seleccion == i + 1) {
                        System.out.println("¡Felicidades! ¡Ganó tu caballo!");
                    } else {
                        System.out.println("Lo siento, tu caballo no ganó.");
                    }
                    break;
                }
            }
            
           
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
