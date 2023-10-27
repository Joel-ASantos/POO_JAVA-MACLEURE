package Exception.banco.exections;

public class ContaNaoEncontradaException extends Exception{
    public ContaNaoEncontradaException(){
        super("Conta Corrente não encontrada.");
    }
}
