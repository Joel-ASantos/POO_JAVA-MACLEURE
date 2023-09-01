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
    public static Scanner scanner = new Scanner(System.in);
    Estoque estoque = new Estoque();


    public static void main(String[] args)
    {
        int exec=0;
        
        while(exec != 5)
        {
            System.out.println("1- Adicionar");
            System.out.println("2- Remover");
            System.out.println("3- Listar");
            System.out.println("4- Atualizar a quantidade");
            System.out.println("5-Encerrar");

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

                break;

                case 2:
                    System.out.println("Removendo\n");

                    System.out.print("Digite o código do item a ser removido: ");
                    ID = scanner.nextInt();

                break;

                case 3:
                    System.out.println("Listando\n");
                break;

                case 4:
                    System.out.println("Atualizando dados\n");
                break;

                case 5:
                    exec = 5;
                    System.out.println("Encenrrando");
                break;
            }
        }
    }
}