package poo;
import poo.dao.PessoaDAO;
import poo.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        
        Pessoa p1 = new Pessoa("Jota","jota@gmail.com");
        Pessoa p2 = new Pessoa("Eneas","Eneas@gmail.com");

        dao.salvarPessoa(p1);
        dao.salvarPessoa(p2);

        System.out.println(p1);
        System.out.println(p2);
    }
}
