package visao;
import aplicacao.Robo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int [] vetor = new int[2];
		int [][] espaco = new int[20][40];
		
		Robo r = new Robo();
		int o, l, c;
		
		do {
			System.out.println("\n------------------");
			System.out.println("1- Andar para Cima");
			System.out.println("2- Andar para Baixo");
			System.out.println("3- Andar para Direita");
			System.out.println("4- Andar para Esquerda");
			System.out.println("5- Mostrar Posição Atual");
			System.out.println("6- Definir quantidade de passos do robô");
			System.out.println("7- Acabar com o joguinho");
			System.out.println("\n>>");
			o = teclado.nextInt();
			
			switch(o) {
			
			case 1: if(r.getLinha()+r.getPasso()>=0) {
				r.andarFrente();
			}else {
				System.out.println("\nJá está na borda, não pode ir para cima");
			}
				break;
			case 2: if(r.getLinha()+r.getPasso()<=19) {
				r.andarTras();
			}else {
				System.out.println("\nJá está na borda, não pode ir para baixo");
			}
				break;
			case 3: if(r.getColuna()+r.getPasso()<=40) {
				r.andarDireita();
			}else {
				System.out.println("\nJá está na borda, não pode ir para direita");
			}
				break;
			case 4: if(r.getColuna()+r.getPasso()>=0) {
				r.andarEsquerda();
			}else {
				System.out.println("\nJá está na borda, não pode ir para esquerda");
			}
				break;
			case 5: for(l=0; l<20; l++) {
				for(c=0; c<40; c++) {
					System.out.print(r.mostrarPosicaoAtual(l, c));
					if(c==39) {
						System.out.println();
					}
				}
			}
				break;
				
			case 6: System.out.println("\nDefina a quantidade de passos: ");
					r.setPasso(teclado.nextInt());
				break;
				
			case 7: System.out.println("\n\nFim do Programa!!");
				break;
				
			default: System.out.println("\n\nEscola somente as opções permitidas!!");
			}
			
		}while(o!=6);
		
	}
}
