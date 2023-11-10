package Lista2.atividade6.Clinica;

public class Pessoa  {
    protected String nome, cpf,telefone;
    protected Integer idade;

    public Pessoa(){    
    }

    public Pessoa(String nome, String cpf, String telefone, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", idade='" + getIdade() + "'" +
            "}";
    }
    
}
