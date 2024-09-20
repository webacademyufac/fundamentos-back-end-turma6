public class Pessoa {
    private String nome;
    private String email;
    private String cpf;

    // Métodos de acesso getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; // this faz referência ao objeto que chama o método
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }
}