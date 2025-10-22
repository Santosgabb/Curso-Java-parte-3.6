
public class Main {
	public static void main (String []args) {
	//criando uma caixa para guardar Strings(ou caixa d String
	Caixa<String> caixaNomes = new Caixa<>();
	Caixa<Integer> caixaIdade = new Caixa<>();
	//guardando os tipos que foi criado 
	caixaNomes.guardar("Gabriel");
	caixaIdade.guardar(22);
	
	//convertendo o que foi recebido em uma var local 
	String nome = caixaNomes.pegar();
	Integer idade = caixaIdade.pegar();
	
	System.out.println("Nome: "+nome + ", Idade: "+ idade);
	
	Caixa<Integer> caixaNumero = new Caixa<>();
	Integer num = Integer.valueOf(44);
	caixaNumero.guardar(num);
	Integer valorResgatado = caixaNumero.pegar();
	System.out.println(valorResgatado);
	
	
	
	}

}
