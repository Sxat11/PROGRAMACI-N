import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class EJER5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año");
        int ano = sc.nextInt();
        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter("Ejer5.txt"));
            archivo.write(ano+ " es "+ EJER4.bisiesto(ano));
            while (ano < 2024) {
                archivo.write(ano+"lol");
                ano=ano+4;
                archivo.newLine();
            }
            archivo.write("FIN");
            archivo.close();
            System.out.println("HECHO");
        } catch (IOException e) {
            System.out.println("ERROR");
        }

        // EJER4.bisiesto(ano);

    }
}
