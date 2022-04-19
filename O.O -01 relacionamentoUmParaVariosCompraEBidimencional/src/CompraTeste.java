public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Jao Pedro";
        compra1.itens.add(new Item("caneta", 20, 7.45));//direcional
        compra1.adicionarItem(new Item("borracha", 12, 3.89));//bidirecional
        compra1.adicionarItem("caderno", 3, 18.79);// com o primeiro metodo add compra nao precisa instanciar um novo item

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

    }
}
