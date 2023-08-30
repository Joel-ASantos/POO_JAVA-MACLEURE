/* 
 Situação Problema:
    Sistema de Gerenciamento de Estoque.
 Crie um sistema simples de gerenciamento de estoque usando objetos e classes. Cada objeto do estoque deve ter nome e quantidade.
 O sistema deve permitir ao usuário adicionar, remover, listar e atualizar a quantidade de objetos cadastrados. 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema_Main
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int execucao=0;

        while(execucao != 5){
            System.out.println("1- Adicionar");
            System.out.println("2- Remover da Lista");
            System.out.println("3- Listar");
            System.out.println("4- Atualizar a quantidade de objetos");
            System.out.println("5- Encerrar programa");
            System.out.println("escolha: ");
            execucao = scanner.nextInt();
            Opcoes(execucao);
        }
    }
    public static void Opcoes(int escolha)
    {
        switch(escolha){
            case 1:
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Encerrando");
                scanner.close();
                break;
        }
    }   
}