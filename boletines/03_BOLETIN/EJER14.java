public class EJER14 {

    public static void main(String[] args) {
        int resultado = -5;
        String player = "Usuario";
        int partida = 0;
        int usuarioPuntos = 0;
        int cpuPuntos = 0;
        while (partida < 2) {
            partida++;
            int tirada = tirada(0, 0);
            if (tirada == 7 || tirada == 11) {
                resultado = 0;
                partida = 3;
            } else if (tirada == 2 || tirada == 3 || tirada == 12) {
                resultado = -1;
                partida = 3;
            } else {
                resultado = tirada;
                if (player == "Usuario") {
                    usuarioPuntos = tirada;
                } else {
                    cpuPuntos = tirada;
                }
            }

            System.out.println(comprobacion(resultado, player));
            player = "CPU";

        }
        System.out.println(empate(cpuPuntos, usuarioPuntos));
    }

    public static int tirada(int dado1, int dado2) { // Método que hace que se tiren los dados
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        System.out.println("Dado A " + dado1);
        System.out.println("Dado B " + dado2);
        return dado1 + dado2;

    }

    public static String comprobacion(int resultado, String player) { //Método que comprueba el ganador
        if (resultado == 0) {
            return (player + " has GANADO");

        }
        if (resultado == -1) {
            return (player + " has PERDIDO");
        } else {
            return player + " has conseguido " + resultado + " puntos";
        }
    }

    public static String empate(int cpuPuntos, int usuarioPuntos) { //Método que comprueba quien gana en caso de empate
        if (cpuPuntos > 0) {
            if (cpuPuntos < usuarioPuntos) {
                return "HAS GANADO";
            } else {
                return "HAS PERDIDO";
            }
        } else {
            return " ";
        }
    }
}
