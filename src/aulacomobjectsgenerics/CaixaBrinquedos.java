package aulacomobjectsgenerics;

public class CaixaBrinquedos {

	// atributo do tipo Object
	private Object coisaNaCaixa;

	// metodo
	public void guardar(Object coisa) {
		this.coisaNaCaixa = coisa;
	}

	// metodos
	public Object pegar() {
		return coisaNaCaixa;
	}

}
