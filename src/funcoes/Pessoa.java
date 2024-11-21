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
    //get's e set's
    public String getNome() {
        return nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
