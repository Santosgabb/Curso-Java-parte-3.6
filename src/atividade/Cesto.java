package atividade;

public class Cesto<T> {
	//como funciona a classe genericca ,APLICAÇÃO
	//atributos
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
