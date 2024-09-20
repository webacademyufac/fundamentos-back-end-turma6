public class Teste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4);
        Retangulo r1 = new Retangulo(10, 5);
        System.out.println("Area quadrado:" + q1.calcularArea());
        System.out.println("Area retangulo:" + r1.calcularArea());
        System.out.println(q1.calcularArea(5));
    }
}
