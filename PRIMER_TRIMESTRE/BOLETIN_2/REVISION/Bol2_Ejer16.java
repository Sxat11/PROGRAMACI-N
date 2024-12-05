package REVISION;

import java.util.Scanner;

public class Bol2_Ejer16 {
    public static void main(String[] args) { // TODO comprobación rangos 1-100. Si pierde entra en bucle inf.
        // TODO repetir programa. Revisar ganar ultimo intento.
        int num1 = 0;
        int numplay = 0;
        int intentos = 5;
        int lose = 0;
        boolean play = true;
        char ans;
        Scanner sc = new Scanner(System.in);
        while (play = true) {
            while (num1<=0 && num1>=100) {
            System.out.println("Dime un numero del 1 al 100");
            num1 = sc.nextInt();
            }
            if (100 >= num1) {
                System.out.println("Adivina un número entre 1 y 100");

                while (num1 != numplay) {
                    intentos = intentos - 1;
                    numplay = sc.nextInt();
                    if (intentos == 0)

                    {
                        System.out.println("HAS PERDIDO");
                        num1 = numplay;
                        lose++;
                    }
                    if (intentos > 0) {
                        if (num1 < numplay) {
                            System.out.println("El numero es más pequeño");
                            System.out.println("Te quedan " + intentos + " intentos");

                        }
                        if (num1 > numplay) {
                            System.out.println("El numero es más grande");
                            System.out.println("Te quedan " + intentos + " intentos");

                        }
                    }

                }
                if (lose == 0) {
                    if (num1 == numplay) {
                        System.out.println("HAS GANADO");
                        System.out.println("Quieres jugar otra vez??(S/N)");
                        ans=sc.nextchar();
                        if (asn=S) {
                            
                        }
                        if (asn=N) {
                            
                        } else { System.out.println("Responde S o N");}
                    }
                }
            } else {
                System.out.println("El numero debe ser menor de 100");
            }
        }
    }

}
