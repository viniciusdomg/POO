package aplicacao;
import aplicacao.Aluno;
import java.util.ArrayList;

public class Disciplina {

	ArrayList<Aluno> aluno; 
	private int codDisc, cargaHoraria;
	private String nomeProf, titulo;
	
	public Disciplina (int codigoDisciplina) {
		codDisc = codigoDisciplina;
		this.aluno = new ArrayList<Aluno>();
	}
	
	public void inserirDisciplina(int codDisc, String titulo, int cargaHoraria, String nomeProf) {
		this.codDisc = codDisc;
		this.cargaHoraria = cargaHoraria;
		this.titulo = titulo;
		this.nomeProf = nomeProf;
	}
	
	public String getDados() {
		return "\nCódigo da disciplina - "+codDisc+"\nTítulo do Professor - "+titulo+
				"\nProfessor - "+nomeProf+"\nCarga horaria total: "+cargaHoraria+"h";
	}
	
	public String melhorAluno() {
		double media = -1;
		String nomeAluno = "";
		for(int i=0; i < this.aluno.size();i++) {
			if(this.aluno.get(i).getMedia() > media) {
				nomeAluno = this.aluno.get(i).getNome();
				media = this.aluno.get(i).getMedia();
			}
		}
		if(media>0) {
			return nomeAluno + "\nMedia: "+media;
		}else {
			return "\n--Aluno não encontrado--";
		}
	}
	
	public double mediaDaTurma() {
		double media = 0;
		for(int i=0; i < this.aluno.size();i++) {
			media += this.aluno.get(i).getMedia();
		}
		media /= aluno.size();
		return media;
	}
	
	public void inserirAluno(Aluno aluno) {
		this.aluno.add(aluno);
	}
	
	public Aluno consultarAluno(int matricula) {
		Aluno dados = null;
		for(int i=0; i < this.aluno.size();i++) {
			if(this.aluno.get(i).getMatricula()==matricula) {
				dados = aluno.get(i);
			}
		}
		return dados;
	}
	
	public void alterarProfessor(String titulo, String nome) {
		this.titulo = titulo;
		nomeProf = nome;
	}
	
	
}
