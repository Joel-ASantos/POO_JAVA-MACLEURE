package encapsulamento;

public class ContaCorrente{
    public Integer numero;
    public Double saldo;

    public ContaCorrente(Integer numero,Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public void setNumero(Integer n) throws Exception{
        if(n > 0){
            this.numero = n;
        }else{
            throw new Exception("Número Inválido");
        }
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(Double s) throws Exception{
        this.saldo = s;
    }

    public void transferir(ContaCorrente contaDestino, Double valorTransferencia){
        if(getSaldo() >= valorTransferencia){
            this.saldo = getSaldo() - valorTransferencia;
            contaDestino.depositar(valorTransferencia);
        }
    }

    public void depositar(Double valorDeposito){
        this.saldo = getSaldo() + valorDeposito;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + this.numero + "'" +
            ", saldo='" + this.saldo + "'" +
            "}";
    }

}