package Lista2.atividade6.Clinica;

public class Empregado extends Pessoa {
    protected String setor;

    public Empregado() {
    }

    public Empregado(String nome, String cpf, String telefone, Integer idade,String setor) {
        this.setor = setor;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public String toString() {
        return "{" +
        " nome='" + getNome() + "'" +    
        " cpf='" + getCpf() + "'" +
        " telefone='" + getTelefone() + "'" +
        " idade='" + getIdade() + "'" +
        " setor='" + getSetor() + "'" +
        "}";
    }

}