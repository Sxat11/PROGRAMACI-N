
public class Pelota {
    public String tipo;
    private double radio;

    public Pelota() {
        this.radio = 40;
        this.tipo = "voleibol";

    }
    public Pelota(String tipo, double radio) {
        this.radio = radio;
        this.tipo = tipo;

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return this.radio;
    }
    public double inflar(){
        return this.radio+1;
        
    }

}
