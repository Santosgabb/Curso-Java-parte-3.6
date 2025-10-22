package aulacomgenerics;

public class BrinquedosMain {

	public static void main(String[] args) {
		//criação dos obj
		Carrinho c = new Carrinho("hot wheels");
		Boneca b = new Boneca("Barbie");
		
		//exibindo os resultado dos obj criado atravez do atributo
		System.out.println("Carrinho: " + c.getModelo());
		System.out.println("Boneca: " + b.getModelo());
	}

}
