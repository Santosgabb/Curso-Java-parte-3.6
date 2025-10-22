package atividade;

public class Peixe  {
	//atributos
	private String nome;
	private double tamanho ; 
	
	//construtor
	public Peixe (String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	
	public String getNome() {
		return nome;
	}


	public double getTamanho() {
		return tamanho;
	}


	//metodo
	public String getModelo() {
		return "Nome: |"+nome + "| |Tamanho: " + tamanho+"|";
	}
}
