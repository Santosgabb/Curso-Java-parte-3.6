package aulagenericsimplementacao;

public class CaixaGenerica<T> {
	// atributos utlilizaçaoo da classe generica
	private T coisaNaCaixa;

	// metodos
	public void guardar(T coisa) {
		this.coisaNaCaixa = coisa;
	}

	// metodo cm retorno
	public T pegar() {
		return coisaNaCaixa;
	}
}
