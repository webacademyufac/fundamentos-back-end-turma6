package main.java.br.ufac.sgcm.model;

public class Especialidade {
    private Long id;
    private String nome;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.id + ": " + this.nome;
    }
}
