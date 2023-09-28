package visao;
import java.util.Scanner;
import aplicacao.Aluno;

public class Main{

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Aluno c1 = new Aluno();
		Aluno c2 = new Aluno();
		Aluno c3 = new Aluno();
		int opcao, cont=0, contNota=0, contMedia=0, i, auxMatricula, auxNota;
		float n1, n2, n3;
		
		do {
		System.out.println("------------------------");
		System.out.println("Menu Principal");
		System.out.println("------------------------");
		System.out.println("1- Cadastrar alunos");
		System.out.println("2- Cadastrar Notas");
		System.out.println("3- Calcular medias");
		System.out.println("4- Informar situações");
		System.out.println("5- Informar dados de um aluno");
		System.out.println("6- Alterar nota");
		System.out.println("7- Sair");
		
		System.out.println("\nDigite o que deseja fazer: ");
		opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1: teclado.nextLine();
				System.out.println("\nDigite a nome do aluno 1: ");
				c1.setNome(teclado.nextLine());
				System.out.println("Digite a matricula do aluno 1: ");
				c1.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("\nDigite a nome do aluno 2: ");
				c2.setNome(teclado.nextLine());
				System.out.println("Digite a matricula do aluno 2: ");
				c2.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("\nDigite a nome do aluno 3: ");
				c3.setNome(teclado.nextLine());
				System.out.println("Digite a matricula do aluno 3: ");
				c3.setMatricula(teclado.nextInt());
				cont++;
			break;
		case 2: if(cont>0) {
				for(i=0;i<3;i++) {
					System.out.println("\nDigite a primeira nota do aluno "+ (i+1) +": ");
					n1 = teclado.nextFloat();
					System.out.println("Digite a segunda nota do aluno "+ (i+1) +": ");
					n2 = teclado.nextFloat();
					System.out.println("Digite a terceira nota do aluno "+ (i+1) +": ");
					n3 = teclado.nextFloat();
					if(i==0) {
						c1.setNotas(n1, n2, n3);
					}else if(i==1) {
						c2.setNotas(n1, n2, n3);
					}else {
						c3.setNotas(n1, n2, n3);
					}
				}
				contNota++;
			}else{
				System.out.println("\nPrimeiro cadastre um aluno para depois cadastrar suas notas!!\n");
			}
			break;
		case 3: if(contNota>0) {
				c1.calcularMedia();
				c2.calcularMedia();
				c3.calcularMedia();
				if(c1.getMedia()>=7) {
					c1.setSituacao("Aprovado");
				}else if(c1.getMedia()<3) {
					c1.setSituacao("Reprovado");
				}else {
					c1.setSituacao("Recuperação");
				}
				
				if(c2.getMedia()>=7) {
					c2.setSituacao("Aprovado");
				}else if(c2.getMedia()<3) {
					c2.setSituacao("Reprovado");
				}else {
					c2.setSituacao("Recuperação");
				}
				
				if(c3.getMedia()>=7) {
					c3.setSituacao("Aprovado");
				}else if(c3.getMedia()<3) {
					c3.setSituacao("Reprovado");
				}else {
					c3.setSituacao("Recuperação");
				}
				contMedia++;
				System.out.println("\nMedia de todos os alunos CALCULADAS!\n");
			}else {
				System.out.println("Primeiro Cadastre as notas dos Alunos para depois calcular media!!\n");
			}
			break;
		case 4:if(contMedia>0) {
				System.out.println("\nSituação do 1o aluno: " + c1.getSituacao());
				System.out.println("Situação do 2o aluno: " + c2.getSituacao());
				System.out.println("Situação do 3o aluno: " + c3.getSituacao());
			}else {
				System.out.println("Primeiro calcule a media dos alunos para mostrar as situações!!");
			}
			break;
		case 5:System.out.println("\nDigite a matricula a matricula do aluno que deseja buscar dados: ");
			auxMatricula = teclado.nextInt();
			if(c1.buscarMatricula(auxMatricula)) {
				System.out.println("\nNome do aluno: "+c1.getNome());
				System.out.println("Notas do aluno: "+c1.getNota1()+" | "+c1.getNota2()+" | "+c1.getNota3());
				System.out.println("Media do aluno: "+c1.getMedia());
				System.out.println("Situação escolar do Aluno: "+c1.getSituacao());
			}else if(c2.buscarMatricula(auxMatricula)) {
				System.out.println("\nNome do aluno: "+c2.getNome());
				System.out.println("Notas do aluno: "+c2.getNota1()+" | "+c2.getNota2()+" | "+c2.getNota3());
				System.out.println("Media do aluno: "+c2.getMedia());
				System.out.println("Situação escolar do Aluno: "+c2.getSituacao());
			}else if(c3.buscarMatricula(auxMatricula)) {
				System.out.println("\nNome do aluno: "+c3.getNome());
				System.out.println("Notas do aluno: "+c3.getNota1()+" | "+c3.getNota2()+" | "+c3.getNota3());
				System.out.println("Media do aluno: "+c3.getMedia());
				System.out.println("Situação escolar do Aluno: "+c3.getSituacao());
			}else {
				System.out.println("\nNão existe aluno com essa matricula\n");
			}
			
			break;
		case 6:if(contNota>0) {
				System.out.println("\nDigite a matricula do aluno que deseja alterar as notas: ");
				auxMatricula = teclado.nextInt();
				if(c1.buscarMatricula(auxMatricula)) {
					System.out.println("\nQual nota do aluno "+c1.getNome()+" deseja alterar? ");
					auxNota = teclado.nextInt();
					System.out.println("Novo valor da nota: ");
					n1 = teclado.nextFloat();
					c1.alterarNota(auxNota, n1);
				}else if(c2.buscarMatricula(auxMatricula)) {
					System.out.println("\nQual nota do aluno "+c2.getNome()+" deseja alterar? ");
					auxNota = teclado.nextInt();
					System.out.println("Novo valor da nota: ");
					n2 = teclado.nextFloat();
					c2.alterarNota(auxNota, n2);
				}else if(c3.buscarMatricula(auxMatricula)) {
					System.out.println("\nQual nota do aluno "+c3.getNome()+" deseja alterar? ");
					auxNota = teclado.nextInt();
					System.out.println("Novo valor da nota: ");
					n3 = teclado.nextFloat();
					c3.alterarNota(auxNota, n3);
				}else {
					System.out.println("\nNão há nenhum aluno cadastrado com essa matricula!!\n");
				}
			}else {
				System.out.println("\nNão há nenhuma nota cadastrada para ser alterada!\n");
			}
			break;
		case 7: System.out.println("\nFIM DO PROGRAMA\n");
			break;
		default: System.out.println("\nDigite um valor que tenha nas opções\n");
		
		}
			
		}while(opcao!=7);
	}

}
