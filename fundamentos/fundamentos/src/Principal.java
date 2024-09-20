public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        // Com o encapsulamento, os atributos devem ser acessados
        // pelos métodos.
        // p1.nome = "Limeira";
        // p1.email = "limeira@ufac.br";
        // System.out.println("Nome:" + p1.nome);
        // System.out.println("Email:" + p1.email);
        // // Vários objetos do tipo pessoa
        p1.setNome("Limeira");
        Pessoa p2 = new Pessoa();
        // p2.nome = "Júnior";
        // p2.email = "juniorlimeiras@gmail.com";
        // p2.cpf = "555.555.555-XX";
        p2.setNome("Júnior");

        // p2.setCpf("888.888.888.99"); //Método não existe
        Aluno a1 = new Aluno();
        a1.setNome("Mateus");
        Aluno a2 = new Aluno();
        a2.setNome("Gleice");
        a2.setMatricula(1);
        a2.setEmail("gleice@sou.ufac.br");
        System.out.println("Nome:" + a2.getNome() + " Mat:" + a2.getMatricula());
        System.out.println("Email:" + a2.getEmail());

        // Polimorfismo
        Pessoa a3 = new Aluno();
        a3.setNome("Polimorfismo");
    }
}
