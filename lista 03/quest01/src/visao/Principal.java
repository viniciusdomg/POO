package visao;
import aplicacao.CalculadoraMelhorada;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		CalculadoraMelhorada calc = new CalculadoraMelhorada();
		
		System.out.println("Digite o primeiro numero: ");
		calc.setOp1(teclado.nextDouble());
		System.out.println("Digite o operador: ");
		teclado.nextLine();		
		calc.setOperador(teclado.nextLine());
		System.out.println("Digite o segundo numero: ");
		calc.setOp2(teclado.nextDouble());
		System.out.println("\nResultado = "+calc.calcular(calc.getOperador(), calc.getOp1(), calc.getOp2()));
	}

}
