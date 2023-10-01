package visao;
import aplicacao.Calculadora;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Calculadora A = new Calculadora();
		Calculadora B = new Calculadora(); 
		Calculadora C = new Calculadora();
		int i, opcao;
		int [] num1 = new int[10];
		int [] num2 = new int[10];
		boolean flag = false, contG = false;
		
		System.out.println("---Calculadora de Vetores---");
		do {
			System.out.println("\n----MENU----");
			System.out.println("1- Cadastrar Elementos");
			System.out.println("2- Mostrar Elementos");
			System.out.println("3- Guardar Soma em outro vetor");
			System.out.println("4- Sair");
			System.out.println("\nDigite qual opção você deseja: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
			System.out.println();
				for(i=0; i<10; i++)
			{
				System.out.println("Digite no vetor A o "+(i+1)+"o Elemento: ");
				A.setNum1(teclado.nextInt(), i);
			}
				System.out.println();
			for(i=0; i<10; i++)
			{
				System.out.println("Digite no vetor B o "+(i+1)+"o Elemento: ");
				B.setNum1(teclado.nextInt(), i);
			}
			flag = true;
				break;
			case 2: if(flag) {
				System.out.println();
				for(i=0;i<10;i++)
			{
				System.out.println("Vetor A elemento "+ (i+1) +": "+A.getNum1(i));	
			}
			System.out.println();	
			for(i=0;i<10;i++)
			{
				System.out.println("Vetor B elemento "+ (i+1) +": "+B.getNum1(i));	
			}
			if(contG) {
				System.out.println();
				for(i=0;i<10;i++)
				{
					System.out.println("Vetor C elemento "+ (i+1) +": "+C.getNum1(i));	
				}
			}
			}else {
				System.out.println("\nPrimeiro cadastre os Vetores A e B!!");
			}
				break;
			case 3:if(flag) {
				for(i=0;i<10;i++) {
					num1[i] = A.getNum1(i);
					num2[i] = B.getNum1(i);
				}
				
				for(i=0;i<10;i++) 
				{
					C.somaDosElementos(num1[i], num2[i], i);
				}
				contG = true;
			}else {
				System.out.println("\nCadastre os elementos de A e B primeiro!!");
			}
				break;
			case 4: System.out.println("\nFIM DO PROGRAMA!!");
				break;
			default: System.out.println("\nDigite uma opção Válida");
			}
			
		}while(opcao!=4);

	}

}
