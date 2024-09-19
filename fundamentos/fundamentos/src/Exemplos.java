import java.util.ArrayList;
import java.util.List;

public class Exemplos {
    public static void main(String[] args) {
        // Tipos primitivos de dados
        int i = 10;
        double n1 = 9.0;
        float n2 = 8.5f;
        boolean status = true;
        String nome = "Limeira";
        double soma = i + n1;
        System.out.println(soma);
        String n3 = "5";
        double soma2 = n1 + Double.parseDouble(n3);
        System.out.println(soma2);
        double pi = 3.14;
        int pi_inteiro = (int) pi;
        System.out.println(pi_inteiro);
        if (n1 > 10)
            System.out.println("Maior que 10.");
        else
            System.out.println("Menor ou igual a 10.");
        String str = (n1 > 9) ? "Maior que 9." : "Menor ou igual a 9.";
        System.out.println(str);

        // Arrays estáticos
        int[] vetor = new int[10];
        vetor[0] = 10;
        for (int j = 1; j < 10; j++) {
            vetor[j] = (j + 1) * 10;
        }
        System.out.println("Vetor Estático");
        for (int j = 0; j < vetor.length; j++) {
            System.out.println("Posição[" + j + "]: " + vetor[j]);
        }

        // Arrays dinâmicos
        List<Integer> vetor_dinamico = new ArrayList<Integer>();
        for (int j = 0; j < 10; j++) {
            vetor_dinamico.add(j * 2);
        }
        vetor_dinamico.add(1000);
        vetor_dinamico.add(2000);
        vetor_dinamico.add(3000);
        vetor_dinamico.add(4000);
        // Removendo valores do vetor dinâmico
        vetor_dinamico.remove(12);
        vetor_dinamico.remove(Integer.valueOf(4000));
        // for-each
        System.out.println("Vetor Dinâmico");
        for (int n : vetor_dinamico)
            System.out.println("Posição[" + vetor_dinamico.indexOf(n) + "]:" + n);

    }
}
