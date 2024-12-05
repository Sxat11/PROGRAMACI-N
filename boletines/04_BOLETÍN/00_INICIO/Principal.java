
public class Principal {
    public static void main(String[] args) {

        Pelota p = new Pelota();
        p.tipo = "balocesto";
        p.setRadio(20);

        System.out.println("Tipo de pelota: " + p.tipo);
        System.out.println("Radio de la pelota: " + p.getRadio() + " cm");
        System.out.println("Se tiene que inflar " + p.inflar() + " barómetros");
        //
        //
        Pelota p2 = new Pelota();
        System.out.println("Tipo de pelota: " + p2.tipo);
        System.out.println("Radio de la pelota: " + p2.getRadio() + " cm");
        System.out.println("Se tiene que inflar " + p2.inflar() + " barómetros");
        //
        //
        Pelota p3 = new Pelota("futbol", 22);
        System.out.println("Tipo de pelota: " + p3.tipo);
        System.out.println("Radio de la pelota: " + p3.getRadio() + " cm");
        System.out.println("Se tiene que inflar " + p3.inflar() + " barómetros");

        intercambiaRadios(p, p2);
        System.out.println("Tipo de pelota: " + p.tipo);
        System.out.println("Radio de la pelota: " + p.getRadio() + " cm");
        System.out.println("Se tiene que inflar " + p.inflar() + " barómetros");
        //
        //
        System.out.println("Tipo de pelota: " + p2.tipo);
        System.out.println("Radio de la pelota: " + p2.getRadio() + " cm");
        System.out.println("Se tiene que inflar " + p2.inflar() + " barómetros");
    }

    public static void intercambiaRadios(Pelota pelota1, Pelota pelota2) { //Intercambio de Radios
        double temp;
        temp = pelota1.getRadio();
        pelota1.setRadio(pelota2.getRadio());
        pelota2.setRadio(temp);

    }

}
