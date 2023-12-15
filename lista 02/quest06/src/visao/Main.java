package visao;
import aplicacao.Aluno;
import aplicacao.Disciplina;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Disciplina> materias = new ArrayList<Disciplina>();
		
		Disciplina disciplina;
		Aluno aluno;
		int opcao, i;
		String nomeProf, titulo;
		int cargaHor, codDisc = 0, codBusca, matAux;
		boolean matriculaExistente;
		
		do {
			System.out.println("\n------MENU------");
			System.out.println("1- Cadastrar uma disciplina");
			System.out.println("2- Cadastrar aluno em uma disciplina");
			System.out.println("3- Consultar aluno da disciplina");
			System.out.println("4- GOAT da disciplina");
			System.out.println("5- Retornar dados de uma disciplina");
			System.out.println("6- Retornar media da turma na disciplina");
			System.out.println("7- Alterar professor da disciplina");
			System.out.println("8- Sair");
			System.out.println("\nDigite a opcção que deseja");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1: disciplina = new Disciplina(codDisc);
				System.out.println("\nDigite o nome do Professor: ");
				teclado.nextLine();
				nomeProf = teclado.nextLine();
				System.out.println("Digite o titulo do Professor: ");
				titulo = teclado.nextLine();
				System.out.println("Digite a quantidade total da carga horária da matéria: ");
				cargaHor = teclado.nextInt();
				
				disciplina.inserirDisciplina(codDisc, titulo, cargaHor, nomeProf);
				codDisc++;
				materias.add(disciplina);
				System.out.println("\n--Disciplina Cadastrada!!--");
				break;
				
			case 2: if(codDisc>0) {
					System.out.println("\n---------------");
					for(i=0; i<materias.size(); i++) {
						System.out.println(materias.get(i).getDados());
					}
					
					System.out.println("\nDigite o codigo da disciplina que deseja cadastrar: ");
					codBusca = teclado.nextInt();
					if(codBusca >= 0 && codBusca <= codDisc) {
						matriculaExistente = false;
						System.out.println("Digite a matricula do aluno: ");
						matAux = teclado.nextInt();
						
							if(materias.get(codBusca).consultarAluno(matAux) != null &&
								materias.get(codBusca).consultarAluno(matAux).getMatricula() == matAux) {
								matriculaExistente = true;
							}
						
						
						if(matriculaExistente) {
							System.out.println("Matricula ja cadastrada");
						}else {
							aluno = new Aluno();
							System.out.println("Digire o nome do aluno: ");
							teclado.nextLine();
							aluno.setNome(teclado.nextLine());
							System.out.println("Digite as notas 1 e 2 do aluno: ");
							aluno.setNotaP1(teclado.nextFloat());
							aluno.setNotaP2(teclado.nextFloat());;
							System.out.println("Digite  nota do trabalho do aluno: ");
							aluno.setNotaT(teclado.nextFloat());
							
							materias.get(codBusca).inserirAluno(aluno);
						}
					}else {
						System.out.println("Codigo de disciplina invalido");
					}
				}else {
					System.out.println("\n--Primeiro cadastre uma disciplina--");
				}
				break;
				
			case 3: if(codDisc > 0) {
				System.out.println("Digite o codigo da disciplina que deseja consultar o aluno:");
				codBusca = teclado.nextInt();
					if(codBusca >= 0 && codBusca <= codDisc) {
						do {
							System.out.println("Digite a matricula do aluno que deseja consultar:");
							matAux = teclado.nextInt();
							matriculaExistente = false;
							if(materias.get(codBusca).consultarAluno(matAux) == null) {
								matriculaExistente = true;
							}
							
							if(matriculaExistente)
								System.out.println("Matricula invalida, digite novamente");
						}while(matriculaExistente);
	
						System.out.println("\n------------------------------------");
						System.out.println("Dados do aluno:\n");
						System.out.println(materias.get(codBusca).consultarAluno(matAux).getNome());
						System.out.println("Media: "+materias.get(codBusca).consultarAluno(matAux).getMedia());
						System.out.println(materias.get(codBusca).consultarAluno(matAux).getEstado());		
						System.out.println("------------------------------------\n");
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				}else {
					System.out.println("\n--Nenhuma disciplina cadastrada--");
				}
				break;
				
			case 4: if(codDisc>0) {
					System.out.println("Digite o codigo da disciplina que deseja consultar o melhor aluno:");
					codBusca = teclado.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisc) {
						System.out.println("Melhor aluno da disciplina:");
						System.out.println(materias.get(codBusca).melhorAluno());
						System.out.println();
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				}else {
					System.out.println("\n--Nenhuma disciplina Cadastrada--");
				}
				break;
				
			case 5: if(codDisc>0) {
					System.out.println("Digite o codigo da disciplina que deseja visualizar os dados:");
					codBusca = teclado.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisc) {
						System.out.println("Dados da disciplina:");
						System.out.println(materias.get(codBusca).getDados());
						System.out.println();
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				}else {
					System.out.println("\n--Nenhuma disciplina Cadastrada--");
				}
				break;
				
			case 6: if(codDisc>0) {
					System.out.println("\nDigite o código da disciplina");
					codBusca = teclado.nextInt();
					
					if(codBusca >= 0 && codBusca <= codDisc) {
						System.out.println("\nMedia da turma: "+materias.get(codBusca).mediaDaTurma());
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				}else {
					System.out.println("\n--Nenhuma disciplina Cadastrada--");
				}
				break;
			case 7: if(codDisc>0) {
					System.out.println("\nDigite o código da turma que deseja mudar o professor: ");
					codBusca = teclado.nextInt();
				
					if(codBusca >= 0 && codBusca <= codDisc) {
						System.out.println("Digite o novo nome do professor:");
						teclado.nextLine();
						nomeProf = teclado.nextLine();
						System.out.println("Digite a titulacao do novo professor:");
						titulo = teclado.nextLine();
						
						materias.get(codBusca).alterarProfessor(nomeProf, titulo);
						System.out.println("Professor alterado com sucesso!!!!");
					}else {
						System.out.println("Codigo de diciplina invalido");
					}
				}else {
					System.out.println("\n--Nenhuma disciplina cadastrada--");
				}
				break;
			case 8: System.out.println("\n--FIM DO PROGRAMA--");
				break;
			default: System.out.println("\n--Digite uma opção válida--");
			}
			
		}while(opcao!=5);

	}

}
