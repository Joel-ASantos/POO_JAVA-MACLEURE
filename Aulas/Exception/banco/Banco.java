package Exception.banco;
import java.util.ArrayList;

import Exception.banco.exections.ValorDepositoInvalidoExeception;

public class Banco {
    private ArrayList<ContaCorrente> contas;
    
    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void abrirConta(String nomeTitular, Integer numero){
        ContaCorrente conta = new ContaCorrente(nomeTitular,numero);
        contas.add(conta);
    }

    public ContaCorrente pesquisarConta(String nomeTitular){
        ContaCorrente contaEncontrada = null;

        for (ContaCorrente contaCorrente : contas) {
            if(contaCorrente.getNomeTitular().equals(nomeTitular)){
                contaEncontrada = contaCorrente;
            }
        }

        return contaEncontrada;
    }

    public void depositar(Integer numeroDeposito, Double valorDeposito) throws Exception{
        if(valorDeposito <= 0){
            throw new ValorDepositoInvalidoExeception();
        }

        ContaCorrente contaDeposito = null;
        for (ContaCorrente contaCorrente : this.contas) {
            if(contaCorrente.getNumero() == numeroDeposito){
                contaDeposito = contaCorrente;
            }   
        }

        if(contaDeposito == null){
            throw new Exception();
        }

        contaDeposito.setSaldo(contaDeposito.getSaldo() + valorDeposito);
    }
}