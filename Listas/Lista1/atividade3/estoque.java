import java.util.ArrayList;
import java.util.List;

public class estoque
{
    List<Itens> obj;

    estoque(){
        this.obj = new ArrayList<Itens>();
    }
        
    public void InserindoValores(Itens itens){
        obj.add(itens);
    }

    public List<Itens> Lista(){
        return obj;
    }

    public void Remover(int id)
    {
        Itens remove = encontraID(id);
            if(remove != null){
                obj.remove(remove);
            }
    }

    public Itens encontraID(int id)
    {
        for (Itens itens : obj) {
            if(itens.getID() == id){
                return itens;
            }
        }
        return null;
    }

    public void atualizar(int id,int quantidade)
    {
        Itens item = encontraID(id);
            if(item != null){
                item.setID(quantidade);
            }
    }
}