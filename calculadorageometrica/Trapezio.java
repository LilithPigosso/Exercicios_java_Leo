public class Trapezio extends FormaGeometrica {
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double ladoA;
    private double ladoB;

    public Trapezio(double baseMaior, double baseMenor, double altura, double ladoA, double ladoB) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMaior + baseMenor + ladoA + ladoB;
    }
}
