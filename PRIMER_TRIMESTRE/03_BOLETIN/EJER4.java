import java.util.Scanner;

public class EJER4 {
        public static void main(String[] args) {
            int ans=-1;
            Scanner sc = new Scanner(System.in);
            while (ans != 0) {
                System.out.println("Dime un año(0 para cerrar programa)");;
                ans=sc.nextInt();
                System.out.println(bisiesto(ans)); 
            }
            sc.close();
            
        }
        public static boolean bisiesto(int ano){
            if (ano % 4 == 0 && ano % 100 != 0 ) {
            return true;}
            if (ano % 400 == 0) {
                return true; }
                else {
                    return false;
                }
           
    
                
        }
    }


