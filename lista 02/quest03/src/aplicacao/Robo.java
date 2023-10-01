package aplicacao;

public class Robo {

	private int linha, coluna, passo;
	
	public Robo() {
		linha  = 0;
		coluna  = 0;
		passo = 1;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	
	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	
	public int getPasso() {
		return passo;
	}

	public void setPasso(int passo) {
		this.passo = passo;
	}
	
	
	public String mostrarPosicaoAtual(int linha, int coluna) {
		if(linha==this.linha && coluna==this.coluna) {
			return " 1";
		}else {
			return " -";
		}
	}
	
	public void andarFrente() {
		linha -= passo;
	}
	public void andarTras(){
		linha += passo;
	}
	public void andarDireita() {
		coluna += passo;
	}
	public void andarEsquerda() {
		coluna -= passo;
	}
	
}
