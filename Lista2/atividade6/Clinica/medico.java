package Lista2.atividade6.Clinica;

public class medico {
    String Crm;
    float Salario;

    public medico() {
    }

    public medico(String Crm, float Salario) {
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
}
