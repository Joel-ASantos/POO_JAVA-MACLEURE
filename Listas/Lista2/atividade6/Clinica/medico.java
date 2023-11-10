package Lista2.atividade6.Clinica;

public class medico extends Empregado {
    private String Crm;
    private float Salario;

    public medico() {
    }

    public medico(String nome, String cpf, String telefone, Integer idade,String setor,String Crm, float Salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.setor = setor;
        this.Crm = Crm;
        this.Salario = Salario;
    }

    public String getCrm() {
        return this.Crm;
    }

    public void setCrm(String Crm) {
        this.Crm = Crm;
    }

    public float getSalario() {
        return this.Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            " idade='" + getIdade() + "'" +
            " telefone='" + getTelefone() + "'" +
            " cpf='" + getCpf() + "'" +
            " setor='" + getSetor() + "'" +
            " Crm='" + getCrm() + "'" +
            ", Salario='" + getSalario() + "'" +
            "}";
    }

}
