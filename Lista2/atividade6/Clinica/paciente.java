package Lista2.atividade6.Clinica;

public class paciente extends Pessoa {
    private String cartão_do_sus;
    private String plano_de_saude;
    private String quadro_paciente;
    
    public paciente() {
    }

    public paciente( String cartao_do_sus, String plano_de_saude, String quadro_paciente) {
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
}