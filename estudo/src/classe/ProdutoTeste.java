

public class ProdutoTeste {
    
    public static void main(String[] args) {
        

        Produto p1 = new Produto("Notebook", 4653.45);
        //p1.nome = ;
        //p1.preco = 4653.45;
        //p1.desconto = 0.25;



        var p2 = new Produto("Caneta Preta", 10.50);
        //p2.nome = ;
        //p2.preco = 15.23;
        //p2.desconto = 0.30;
        Produto.desconto = 0.25;

        System.out.printf(p1.nome+ " R$%.2f%n", p1.precoComDesconto());
        System.out.printf(p2.nome+ " R$%.2f%n", p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;

        
        System.out.printf("Média do carrinho R$%.2f", mediaDoCarrinho);


    }
}