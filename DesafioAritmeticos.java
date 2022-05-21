package exercicios;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		// int a = 3 * 4 - 10;
		// int b = (int) Math.pow(a, 3);
		// elevando a potencia
		// System.out.println(b);

		// CALCULO DA ESQUERDA
		int CalculoEsquerdaA = 3 + 2;
		int CalculoEsquerdaB = 6;
		int CalculoEsquerdaC = 3 * 2;

		int ResultadoEsquerdaAeB = ((CalculoEsquerdaA) * CalculoEsquerdaB);
		int ElevacaoEsquerda = (int) Math.pow(ResultadoEsquerdaAeB, 2);

		int ResultadoEsquerda = ElevacaoEsquerda / (CalculoEsquerdaC);

		System.out.println("Resultado dos valores da esquerda: " + ResultadoEsquerda);

		// CALCULO DA DIREITA
		int CalculoDireitaA = 1 - 5;
		int CalculoDireitaB = 2 - 7;

		int ResultadoDireitaAeB = (CalculoDireitaA * CalculoDireitaB) / 2;
		int ElevacaoDireita = (int) Math.pow(ResultadoDireitaAeB, 2);
		int ResultadoDireita = ElevacaoDireita; // AQUI ESTOU SEGUINDO UM PADRÃO DE RESPOSTAS.

		System.out.println("Resultado dos valores da direita: " + ResultadoDireita);

		// FINALIZANDO AS CONTAS
		int UltimaSubtracao = ResultadoEsquerda - ResultadoDireita;
		int DivisaoFinal = 10;

		int ElevacaoFinal1 = (int) Math.pow(UltimaSubtracao, 3);
		int ElevacaoFinal2 = (int) Math.pow(DivisaoFinal, 3);

		int ResultadoConta = ElevacaoFinal1 / ElevacaoFinal2;

		System.out.println("O resultado da conta é: " + ResultadoConta);

	}

}
