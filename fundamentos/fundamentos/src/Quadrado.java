public class Quadrado implements IQuadrilatero {
    private double lado;

    // Construtor
    // Quadradro q1 = new Quadrado();//Abre e fecha parenteses é um construtor
    public Quadrado(double l) {
        this.lado = l;
    }

    // Sobrescrita
    public double calcularArea() {
        return this.lado * this.lado;
    }

    // Sobrecarga
    public double calcularArea(double diagonal) {
        return diagonal * diagonal;
    }
}
