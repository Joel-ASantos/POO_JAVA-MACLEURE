package Lista2.atividade6.Clinica;

public class Departamento {
    String identificador,nome;

    public Departamento() {
    }

    public Departamento(String identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}