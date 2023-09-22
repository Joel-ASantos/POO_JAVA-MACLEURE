package heranca;

import heranca.empresa.Diretor;
import heranca.empresa.Engenheiro;
import heranca.empresa.Funcionario;
import heranca.empresa.Gerente;

public class Executavel {
    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("Jota",123,423,"431","Shitpost");
        Gerente ger1 = new Gerente("P",435,903,56);
        Diretor dir1 = new Diretor("J",677,843,100);
        Funcionario func1 = new Funcionario("G",453,129);

        System.out.println(eng1);
        System.out.println(ger1);
        System.out.println(dir1);
        System.out.println(func1);
    }

}
