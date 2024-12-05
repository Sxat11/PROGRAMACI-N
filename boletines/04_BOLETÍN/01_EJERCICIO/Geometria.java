//PROPIEDADES
public class Geometria {
    private boolean figura;
    private double altura;
    private double base;

    // Constructor vacío que inicializa a triángulo
    public Geometria() {
        this.figura = false;
        this.base = 2.0;
        this.altura = 2.0;

    }

    // Constructor que inicializa como triángulo con base y altura especificadas
    public Geometria(double altura, double base) {
        this.figura = false;
        this.base = base;
        this.altura = altura;

    }

    // Constructor que inicializa todas las características
    public Geometria(double altura, double base, boolean figura) {
        this.figura = figura;
        this.base = base;
        this.altura = altura;

    }

    // Getter para figura(solo lectura)
    public boolean isFigura() {
        return this.figura;
    }

    // Getter y Setter para base
    public double isBase() {
        return this.base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("El número debe ser positivo");
        }
    }

    // Getter y Setter para altura
    public double isAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("El número debe ser positivo");
        }

    }

    // Método para calcualar el área
    public double area() {
        if (this.figura == true) { // Rectángulo
            return this.base * this.altura;

        } else // Triángulo
            return (this.base * this.altura) / 2;
    }

    // Método para calcular el perímetro
    public double diagonal() {
        return Math.sqrt((this.base * this.base) + (this.altura * this.altura));
    }

    // Método para calcular el tipo
    public String tipo() {
        if (this.figura = true) { // Rectángulo
            return "Rectángulo";
        } else {
            return "Triángulo";
        }

    }

    // Método para calcular el diámetro
    public double perímetro(){
        if (figura= true) { //Rectángulo
             return this.altura*2 +this.base*2;
        } else {
            return this.altura + this.base + diagonal();
        }

    }

}