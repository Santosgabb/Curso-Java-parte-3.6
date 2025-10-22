package aulagenericsimplementacao;

import aulacomgenerics.Boneca;
import aulacomgenerics.Carrinho;

public class Principal {
//Uma boa forma de se utilizar o generics
	public static void main(String[] args) {
		//Criando uma caixa para guardar carrinhos
		CaixaGenerica<Carrinho> caixaDeCarrinho = new CaixaGenerica<>(); 
		caixaDeCarrinho.guardar(new Carrinho("Ferrari"));
		
		//Criando uma caixa para guardar Boneca
		CaixaGenerica<Boneca> caixaDeBoneca = new CaixaGenerica<>(); 
		caixaDeBoneca.guardar(new Boneca("Avatar"));
		
		//PEGA A boneca onde esta na caixa 
		Carrinho carrinho = caixaDeCarrinho.pegar();
		Boneca boneca = caixaDeBoneca.pegar();
		
		//saida dos resultados
		System.out.println(carrinho.getModelo());
		System.out.println(boneca.getModelo());

	}

}
