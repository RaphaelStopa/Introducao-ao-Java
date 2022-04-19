public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra;//fiz para deixar de ter uma relação para direcional para bidirecional

    public Item(String nome, int quantidade, double preco) { //Construtor
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
