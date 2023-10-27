package Exception;
import Exception.banco.Banco;
import Exception.banco.ContaCorrente;

public class Executavel {
    public static void main(String[] args) {
        Banco banco;
        ContaCorrente conta;
        
        banco = new Banco();
        
        banco.abrirConta("Jota",123);
        conta = banco.pesquisarConta("Jota");

        System.out.println(conta);
        
        try{
            banco.depositar(124, 1.0);
        }catch (Exception e){
            System.out.println("Não foi possível depositar!");
        }
    }
}
