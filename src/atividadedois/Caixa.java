package atividadedois;

public class Caixa<T> {
	// cria um vetor de elementos d tipo generico
	private T[] elementos;

	// construtor q armazena os itens da classe
	public Caixa(int capacidade) {
		elementos = (T[]) new Object[capacidade];
	}

	//add
	// metodos para implementar uma classe generica
	public void adicionar(T elemento, int indice) {
		elementos[indice] = elemento;
	}

	//informa o que a emcada indice informado 
	public T obter(int indice) {
		return elementos[indice];
	}
}
