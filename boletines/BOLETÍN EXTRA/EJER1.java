import java.util.Scanner;

public class EJER1{
public static void BULEANO(boolean opciones){
   if (opciones){
    for (int i=1; i<=20;i++){
        System.out.println(i);
    }
}
else {
    for (int i=1; i<=50;i++){
        if(i % 2==0)
        System.out.printf("%5d%n",i);
    }
}
   
}








public static void main(String[] args) {
    BULEANO(false);





}
}

