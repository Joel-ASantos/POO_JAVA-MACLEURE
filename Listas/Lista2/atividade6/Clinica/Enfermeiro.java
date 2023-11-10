package Lista2.atividade6.Clinica;

public class Enfermeiro extends Empregado {
    private String coren;
    private float salario;

    public Enfermeiro(String nome, String cpf, String telefone, Integer idade,String setor,String coren, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.setor = setor;
        this.coren = coren;
        this.salario = salario;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            " idade='" + getIdade() + "'" +
            " telefone='" + getTelefone() + "'" +
            " cpf='" + getCpf() + "'" +
            " coren='" + getCoren() + "'" +
            ", salario='" + getSalario() + "'" +
            ", setor='" + getSetor() + "'" +
            "}";
    }

}