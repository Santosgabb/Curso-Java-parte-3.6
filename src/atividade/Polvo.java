package atividade;

public class Polvo {
	private String nome;
	private int tentaculos;

	public Polvo(String nome, int tamanho) {
		this.nome = nome;
		this.tentaculos = tamanho;
	}

	public String getModelo() {
		return "Nome: |"+ nome +"| |Tentaculos: " + tentaculos + "|";
	}

}
