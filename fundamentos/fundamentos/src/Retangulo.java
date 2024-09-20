public class Retangulo implements IQuadrilatero {
    private double base;
    private double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }
}
