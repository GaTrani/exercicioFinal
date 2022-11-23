import java.util.ArrayList;
import java.util.List;

public class Cesta {

    private static List<Produto> itens= new ArrayList<>();

    public void adicionarItem(Produto p){
        itens.add(p);
        System.out.println("Produto adicionado com sucesso.");
    }

    public void getItens(){
        for (Produto p: itens) {
            System.out.println(p.toString());
        }
    }

    public void calcularTotal(){
        System.out.println("Falta Fazer o codigo para calcular total");
    }
}
