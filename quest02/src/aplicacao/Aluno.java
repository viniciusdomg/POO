package aplicacao;

public class Aluno {
	private String nome, situacao;
	private float nota1, nota2, nota3, media;
	private int matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public float getNota1() {
		return nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public float getNota3() {
		return nota3;
	}
	public void setNotas(float nota1, float nota2, float nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public String alterarNota(int codNota, float valorNovo) {
		if(codNota==1) {
			nota1 = valorNovo;
			return "Nota alterada com sucesso";
		}else if(codNota==2) {
			nota2 = valorNovo;
			return "Nota alterada com sucesso";
		}else if(codNota==3) {
			nota3 = valorNovo;
			return "Nota alterada com sucesso";
		}else {
			return "Digitou um codigo de nota inexistente";
		}
	}
	
	
	public float getMedia() {
		return media;
	}
	public void calcularMedia() {
		media = (nota1+nota2+nota3)/3;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public boolean buscarMatricula(int matricula) {
		if(this.matricula!=matricula) {
			return false;
		}else {
			return true;
		}
	}
	
	
}
