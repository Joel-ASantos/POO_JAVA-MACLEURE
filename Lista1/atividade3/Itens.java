public class Itens
{
    String nome;
    int ID;
    int qtd;

    public Itens(String nome,int ID,int qtd){
        this.nome = nome;
        this.ID = ID;
        this.qtd = qtd;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public int getQuanti(){
        return qtd;
    }
    public void setQuanti(int qtd){
        this.qtd = qtd;
    }
}
