package aulacomobjectsgenerics;

import aulacomgenerics.Boneca;
import aulacomgenerics.Carrinho;

public class Main {
//Implementação sem generics
	public static void main(String[] args) {
		//Criando uma caixa para guardar carrimhos
		CaixaBrinquedos caixaCarrinhos = new CaixaBrinquedos();
		
		caixaCarrinhos.guardar(new Carrinho("Hooot hells"));
		
		CaixaBrinquedos caixaBoneca = new CaixaBrinquedos();
		caixaBoneca.guardar(new Boneca("Barbiiie"));
		
		//verifica o tipo do objeto antes de fazer o cast
		if(caixaCarrinhos.pegar() instanceof Carrinho) {
		Carrinho carrinho = (Carrinho) caixaCarrinhos.pegar();
		System.out.println(carrinho.getModelo());
		}
	
		if(caixaBoneca.pegar() instanceof Boneca) {
			Boneca boneca = (Boneca) caixaBoneca.pegar();
			System.out.println(boneca.getModelo());
			}
		
	}

}
