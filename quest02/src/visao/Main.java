package visao;
import java.util.Scanner;
import aplicacao.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Aluno c1 = new Aluno();
		Aluno c2 = new Aluno();
		Aluno c3 = new Aluno();
		int opcao, cont=0, contNota=0, i;
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
				System.out.println("Digite a nome do aluno 1: ");
				c1.setNome(teclado.nextLine());
				System.out.println("Digite a matricula do aluno 1: ");
				c1.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("Digite a nome do aluno 2: ");
				c2.setNome(teclado.nextLine());
				System.out.println("Digite a matricula do aluno 2: ");
				c2.setMatricula(teclado.nextInt());
				teclado.nextLine();
				System.out.println("Digite a nome do aluno 3: ");
				c3.setNome(teclado.nextLine());
				System.out.println("Digite a matricula do aluno 3: ");
				c3.setMatricula(teclado.nextInt());
				cont++;
			break;
		case 2: for(i=0;i<3;i++) {
				System.out.println("Digite a primeira nota do aluno "+ i+1 +": ");
				n1 = teclado.nextFloat();
				System.out.println("Digite a segunda nota do aluno "+ i+1 +": ");
				n2 = teclado.nextFloat();
				System.out.println("Digite a terceira nota do aluno "+ i+1 +": ");
				n3 = teclado.nextFloat();
				if(i==0) {
					c1.setNotas(n1, n2, n3);
				}else if(i==1) {
					c2.setNotas(n1, n2, n3);
				}else {
					c3.setNotas(n1, n2, n3);
				}
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7: System.out.println("\nFIM DO PROGRAMA\n");
			break;
		default: System.out.println("\nDigite um valor que tenha nas opções");
		
		}
			
			
			
		}while(opcao!=7);
	}

}
