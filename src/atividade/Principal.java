package atividade;

public class Principal {

	public static void main(String[] args) {
//Chama a classe Cesto q tem referencia a Peixe
		//criação de uma caixa
		Cesto<Peixe> caixaPeixe = new Cesto<>();//p é o nome q refere ao obj criado

		/*chama o P , utiliza o metodo que ha dentro da classe Cesto
		 * 
		 * ai criamos um obj q tem referencia a classe peixe que esta dentro do metodo
		 * 
		 * criamos um objeto dentro do metodo e guardamos ele dentro do metodo da classe Cesto 
		 */
		caixaPeixe.guardar(new Peixe("Nemo", 10.88));

//classe generica<Classe utilizara> = new Classe generica
		Cesto<Polvo> caixaPolvo = new Cesto<>();
		
//chama o obj.usa o metodo(cria o obj da classe que usaremos(colocamos os valores a ele); 		
		caixaPolvo.guardar(new Polvo("Polvo prreto", 80));
		
		//vamos pegar o que ha dentro da caixa e exibirmos
		/*1°Usamos a classe q criamos no metodo, damos o nome a ela
		 * 
		 * 
		 * 
		 */
		//passando a referencia 
		Peixe peixe = caixaPeixe.pegar();
		Polvo polvo = caixaPolvo.pegar();
		
		
		//saida da informações
		System.out.println(peixe.getModelo());
		System.out.println(polvo.getModelo());
	}

}
