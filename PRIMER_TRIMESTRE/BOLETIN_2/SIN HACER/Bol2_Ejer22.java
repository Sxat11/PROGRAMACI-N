import  java.util.Random;
import java.util.Scanner;

public class Bol2_Ejer22 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int NUMERO_CABALLOS = 5;
        final int LONGITUD_PISTA = 10;  
        int[] posiciones = new int[NUMERO_CABALLOS];
        System.out.println("Elige tu Caballo");
        int Caballo=sc.nextInt();
        while (Caballo>5 || Caballo<1 ) {
            
                System.out.println("Elige un caballo del 1 al 5");
                Caballo=sc.nextInt();
        }
        System.out.println("¡Empieza la carrera!");

        boolean carreraEnCurso = true;
        while (carreraEnCurso) {
                int caballoquesemueve=random.nextInt(NUMERO_CABALLOS);
                int movimientocaballo=random.nextInt(3) + 1;
                posiciones[caballoquesemueve] = posiciones[caballoquesemueve]+ movimientocaballo;

                for (int i = 0; i < NUMERO_CABALLOS; i++) {
                        System.out.print("Caballo " + (i + 1) + ": ");
                        
                        for (int j = 0; j < posiciones[i]; j++) {
                            System.out.print("-");
                        }
                        
                        System.out.println(">");
                
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    for (int i = 0; i < NUMERO_CABALLOS; i++) {
                        if (posiciones[i] >= LONGITUD_PISTA) {
                            carreraEnCurso = false;
                            System.out.println("¡El caballo " + (i + 1) + " ha ganado la carrera!");
                            
                            
                            if (Caballo == i + 1) {
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



}
}

