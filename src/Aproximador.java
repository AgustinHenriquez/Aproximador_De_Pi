public class Aproximador {
    public static void main(String[] args) {
        Aguja aguja = new Aguja();
        for (int i = 0; i < 1000000; i++) {
            aguja.setNuevaAguja();
            if (aguja.esSecanteAlTablero()) {
                aguja.aumentarAgujasSecantes();
            }
            aguja.aumentarAgujasTotales();

            double pi = aguja.calcularPi();
            System.out.println(pi);
        }
    }
}
