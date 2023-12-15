package aplicacao;

public class CalculadoraMelhorada extends Calculadora {

	private String memoria;
	
	public String verUltimaOperacao() {

		if(memoria == "+"){
			return "Operação de soma";
		}else if(memoria == "-") {
			return "Operação de subtração";
		}else if(memoria=="*"){
			return "Operação de multiplicação";
		}else if(memoria=="/") {
			return "Operação de divisão";
		}else if( memoria=="^") {
			return "Operação de potência";
		}else{
			return "Não há última operção";	
		}
		
	}
	
	public double potencia(double op1, double op2) {
		return Math.pow(op1, op2);
	}
	
	public double calcular(String operador, double op1, double op2) {
		
		memoria = operador ;
		
		switch(operador) {
		case "^": return potencia(op1, op2);
		default: return calcular();
		}
	}
}
