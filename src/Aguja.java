import java.lang.Math;
import java.util.Random;

public class Aguja {
    private double altura;
    private double angulo;
    private double totalAgujas  = 0L;
    private double agujasSecantes = 1L;

    public void setNuevaAguja() {
        this.setAlturaRandomizada();
        this.setAnguloRandomizado();
    }

    public void setAlturaRandomizada() {
        Random randomDouble = new Random();
        this.altura = randomDouble.nextDouble();
    }

    public void setAnguloRandomizado() {
        Random randomDouble = new Random();
        double cotaSuperior = Math.PI / 2;
        this.angulo = randomDouble.nextDouble() * cotaSuperior;
    }

    public boolean esSecanteAlTablero() {
        boolean esSecante = Math.sin(this.angulo) / 2 > this.altura;
        return esSecante;
    }

    public void aumentarAgujasSecantes() {
        this.agujasSecantes += 1;
    }

    public void aumentarAgujasTotales() {
        this.totalAgujas += 1;
    }

    public double calcularPi() {
        double pi = this.totalAgujas / this.agujasSecantes;
        return pi;
    }
}
