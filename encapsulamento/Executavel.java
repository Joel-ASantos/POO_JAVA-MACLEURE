package encapsulamento;

public class Executavel{
    public static void main(String[] args) throws Exception {
        ContaCorrente c1 = new ContaCorrente(123,10.00);
        ContaCorrente c2 = new ContaCorrente(124,10.00);
        
        c1.transferir(c2, 1.78);
        System.out.println(c1);
        System.out.println(c2);
    }
}