package funcoes;

public class Pessoa {
    private String nome,CPF, email, endereco, telefone;
    private int senha;

    public Pessoa(String nome, String email, String CPF, String endereco, String telefone, int senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }
}
