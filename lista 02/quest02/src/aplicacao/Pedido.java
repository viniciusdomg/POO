package aplicacao;

public class Pedido {

	private int id, qtdBotijoes;
	private String endereco, hora, numeroDoCartao;
	private boolean entrega;
	private float totalCompra;
	
	public Pedido(int id) {
		this.id = id;
		setEntrega(false);
	}

	public int getId() {
		return id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getQtdBotijoes() {
		return qtdBotijoes;
	}

	public void setQtdBotijoes(int qtdBotijoes) {
		this.qtdBotijoes = qtdBotijoes;
	}
	
	public float getTotalCompra() {
		return totalCompra;
	}
	
	public void setTotalCompra() {
		totalCompra = qtdBotijoes*60;
	}
	
	public void setNumeroDoCartao(String numero) {
		numeroDoCartao = numero;
	}

	public boolean getEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}

}
