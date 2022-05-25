package MercadoTeste;

public class Produto {
		
		String nome;
		double preco;
		static double desconto = 0.25;
		
		
		// CONSTRUTOR PADRÃO
		Produto() {
			
		}
		
		// CONSTRUTOR 
		
		Produto(String nomeInicial, double precoInicial) {
			nome = nomeInicial;
			preco = precoInicial;
		}
		
		
		// METODO
				// ASSINATURA DO METODO (NOME E PARAMETROS)
		double precoComDesconto() {
			return preco * (1 - desconto);
		}
			double precoComDesconto(double descontoDoGerente) {
				return preco * (1 - desconto + descontoDoGerente);
		}


}
