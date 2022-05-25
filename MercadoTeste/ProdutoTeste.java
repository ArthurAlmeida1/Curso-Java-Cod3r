package MercadoTeste;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		// UTILIZANDO CONSTRUTORES
		Produto p1 = new Produto("Notebook", 4356.89);
		// p1.nome = "Notebook";
		// p1.preco = 4356.89;
		// p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50; // EST� ALTERANDO TODOS OS DESCONTOS DO SISTEMA.
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto(); // quando chama com parenteses � metado, quando sem � atributo.
		double precoFinal2 = p2.precoComDesconto(0.1); // metodo serve para simplificar uma por��o de c�digos repetidos. 
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho);
		
		System.out.println();
    //classe/atributo/metodo
		

	}

}
