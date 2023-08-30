/*
 * Neste arquivo será escrito um algoritmo
 * responsável para adicionar objetos/produtos,
 * para o Sistema_Main
*/

public class Adicionar 
{
    String nome;
    int id;
    int quantidade;

    public String getNome(){
        return nome;
    }
    
    public int getID(){
        return id;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void SetNome(){
        this.nome = nome;
    }

    public void SetID(){
        this.id = id;
    }

    public void SetQuantidade(){
        this.quantidade = quantidade;
    }
}