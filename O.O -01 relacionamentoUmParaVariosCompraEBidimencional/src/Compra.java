import java.util.ArrayList;

public class Compra {
    // uma compra tem varios itens

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();


    void adicionarItem(String nome, int quantidade, double preco) {//para ficar mais seguro, este constrói o item
        this.adicionarItem(new Item(nome, quantidade, preco));// este metodo chama o de baixo
    }


    void adicionarItem(Item item) {// fiz para ser bidimensional, agora um item será adicionado a compra e uma compra ao item. É só um exemplo... não é perfeito
        itens.add(item);
        item.compra = this;
    }




    double obterValorTotal() { // não precisava era só para calcular, mas como estudo serve
        double total = 0;
        for(Item item: itens) {
            total += item.quantidade * item.preco;
        }

        return  total;
    }
}
