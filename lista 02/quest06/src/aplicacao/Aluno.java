package aplicacao;

public class Aluno {

	private int matricula;
	private String nome, estado;
	private float notaP1, notaP2, notaT;
	double pFinal, media;
	
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public float getNotaP1() {
		return notaP1;
	}
	public void setNotaP1(float notaP1) {
		this.notaP1 = notaP1;
	}
	
	public float getNotaP2() {
		return notaP2;
	}
	public void setNotaP2(float notaP2) {
		this.notaP2 = notaP2;
	}
	
	public float getNotaT() {
		return notaT;
	}
	public void setNotaT(float notaT) {
		this.notaT = notaT;
	}
	
	public double getMedia() {
		return media;
	}
	public void calcularMedia() {
		media = (((notaP1*2.5)+(notaP2*2.5)+(notaT*2))/(2.5+2.5+2));
	}
	
	public double getpFinal() {
		return pFinal;
	}
	public void situacaoFinal() {
		if(media<5) {
			pFinal = 5-media;
		}else {
			pFinal = 0;
		}
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado() {
		if(pFinal>0) {
			estado = "Aluno está em rec Final, precisando de " + pFinal + " pontos";
		}else {
			estado = "Aluno aprovado";
		}
	}
	
}
