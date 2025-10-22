package atividadedois;

public class Main {

	public static void main(String[] args) {
		Caixa<Double> caixaPreco = new Caixa<>(3);
		caixaPreco.adicionar(22.88, 0);
		caixaPreco.adicionar(41.98, 1);
		caixaPreco.adicionar(13.88, 2);
		
		System.out.println(caixaPreco.obter(0));
		System.out.println(caixaPreco.obter(1));
		System.out.println(caixaPreco.obter(2));
		
		Caixa<Character> caixaLetra = new Caixa<>(3);
		caixaLetra.adicionar('b', 0);
		caixaLetra.adicionar('A', 1);
		caixaLetra.adicionar('c', 2);

		System.out.println(caixaLetra.obter(0));
		System.out.println(caixaLetra.obter(1));
		System.out.println(caixaLetra.obter(2));

	
	}

}
