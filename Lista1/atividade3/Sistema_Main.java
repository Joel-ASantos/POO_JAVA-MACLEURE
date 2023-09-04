/* 
 Situação Problema:
    Sistema de Gerenciamento de Estoque.
 Crie um sistema simples de gerenciamento de estoque usando objetos e classes. Cada objeto do estoque deve ter nome e quantidade.
 O sistema deve permitir ao usuário adicionar, remover, listar e atualizar a quantidade de objetos cadastrados. 
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Sistema_Main
{
    public static void main(String[] args)
    {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        int exec = 0;
        
        while(exec != 5)
        {
            System.out.println("1- Adicionar");
            System.out.println("2- Remover");
            System.out.println("3- Listar");
            System.out.println("4- Atualizar a quantidade");
            System.out.println("5-Encerrar");
            System.out.println("Digite: ");
            scanner.nextLine();
        }

        switch(exec)
        {
            case 1:
                System.out.println("Adicionando\n");

                System.out.print("Digite o código do item: ");
                int ID = scanner.nextInt();

                System.out.print("Digite o nome do item: ");
                String nome = scanner.nextLine();
                    
                System.out.print("Digite a quantidade do item: ");
                int qtd = scanner.nextInt();

                Itens item = new Itens(nome,ID,qtd);
                estoque.InserindoValores(item);

                scanner.close();
            break;

            case 2:
                System.out.println("Removendo\n");

                System.out.print("Digite o código do item a ser removido: ");
                ID = scanner.nextInt();

                scanner.close();
                estoque.Remover(ID);
            break;

            case 3:
                System.out.println("Listando\n");

                System.out.println("Itens no estoque:");

                List<Itens> itens = estoque.Lista();
                    
                for (Itens currentItem : itens) {
                    System.out.println("Código: " + currentItem.getID());
                    System.out.println("Nome: " + currentItem.getNome());       
                }

            break;

            case 4:
                System.out.println("Atualizando dados\n");

                System.out.print("Digite o código do item a ser atualizado: ");
                int uptadeID = scanner.nextInt();

                System.out.print("Digite a nova quantidade: ");
                int novaQuantidade = scanner.nextInt();

                estoque.atualizar(uptadeID, novaQuantidade);
                System.out.println("Quantidade atualizada com sucesso!");
                
                scanner.close();
            break;

            case 5:
                exec = 5;
                System.out.println("Encenrrando");
            break;
        }
    }
}