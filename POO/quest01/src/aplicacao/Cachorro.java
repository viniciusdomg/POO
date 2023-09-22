package aplicacao;

public class Cachorro {

	private String nome;
	private String raca;
	private int idade;
	
	public Cachorro () {
		nome = "cachorro sem nome";
		raca = "nenhuma raça definid";
		idade = 0;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String informarEstado() {
		if(nome=="cachorro sem nome") {
			return "não existe cachorro";
		}else {
			return "cachorro esta bem";
		}
	}
	
	public Cachorro clonarCachorro() {
		return new Cachorro();
	}
}
