package aulacomgenerics;

public class Boneca {
	//atributo
		private String nome;
		
		//construtor
		public Boneca(String nome) {
			this.nome = nome;
		}
		
		//metodo pra retorna o nome do obj que foi recebido
		public String getModelo() {
			return nome;
		}
}
