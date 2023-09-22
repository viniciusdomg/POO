package visao;
import aplicacao.Cachorro;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Cachorro c1 = new Cachorro();
		int opcao;
		
		do {
			System.out.println("---------------------------");
			System.out.println("1 - Cadastrar cachorro");
			System.out.println("2 - Criar outro cachorro");
			System.out.println("3 - Mostrar cachorros");
			System.out.println("---------------------------\n");
			System.out.println("Digite o que deseja");
			opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite um nome para o cachorro");
				c1.setNome(teclado.nextLine());
				System.out.println("Digite a raca do cachorro");
				c1.setRaca(teclado.nextLine());
				System.out.println("Digite a idade do cachorro");
				c1.setIdade(teclado.nextInt());
		
				break;
			case 2: if(c1.getNome()=="cachorro sem nome") {
					System.out.println("Existe um espaço vazio para cadastrar um cachorro");
				}else {
					c1.clonarCachorro();
					System.out.println("Cachorro criado com sucesso!!");
				}
				break;
			case 3: System.out.println("Nome: " + c1.getNome());
					System.out.println("Raca: " + c1.getRaca());
					System.out.println("Idade: " + c1.getIdade());
				break;
				
			default: System.out.println("Digite um valor verdadeiro");
			}
			System.out.println("\nDeseja executar mais alguma ação? (1-sim  2-nao): ");
			opcao = teclado.nextInt();
			System.out.println("\n\n");
		}while(opcao==1);
		
	}
}
