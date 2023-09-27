package Lista2.atividade6.Clinica;

public class paciente extends Pessoa{
    private String cartão_do_sus;
    private String plano_de_saude;
    private String quadro_paciente;
    
    public paciente() {
    }

    public paciente(String nome, String cpf, String telefone, Integer idade,String cartao_do_sus, String plano_de_saude, String quadro_paciente){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.cartão_do_sus = cartao_do_sus;
        this.plano_de_saude = plano_de_saude;
        this.quadro_paciente = quadro_paciente;
    }

    public String getCartão_do_sus() {
        return this.cartão_do_sus;
    }

    public void setCartão_do_sus(String cartão_do_sus) {
        this.cartão_do_sus = cartão_do_sus;
    }

    public String getPlano_de_saude() {
        return this.plano_de_saude;
    }

    public void setPlano_de_saude(String plano_de_saude) {
        this.plano_de_saude = plano_de_saude;
    }

    public String getQuadro_paciente() {
        return this.quadro_paciente;
    }

    public void setQuadro_paciente(String quadro_paciente) {
        this.quadro_paciente = quadro_paciente;
    }


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            " idade='" + getIdade() + "'" +
            " telefone='" + getTelefone() + "'" +
            " cpf='" + getCpf() + "'" +
            " cartão_do_sus='" + getCartão_do_sus() + "'" +
            ", plano_de_saude='" + getPlano_de_saude() + "'" +
            ", quadro_paciente='" + getQuadro_paciente() + "'" +
            "}";
    }

}