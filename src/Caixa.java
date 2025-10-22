
public class Caixa <T>{
	//atributos
	private T coisaNaCaixa;
	
	//metodos
	public void guardar(T coisa) {
		this.coisaNaCaixa =coisa ;
	}
	//metodo cm retorno
	public T pegar() {
		return coisaNaCaixa;
	}

}
