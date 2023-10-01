package aplicacao;

public class Ingresso {

	private int numberId, seat, value;
	private String cpf, name;
	
	public int getNumberId() {
		return numberId;
	}
	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}
	
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		if(value==8) {
			return "Meia";
		}else {
			return "Inteira";
		}
	}
	public void setValue(String choose) {
		if(choose.equals("Meia")) {
			value = 8;
		}else if(choose.equals("Inteira")) {
			value = 16;
		}
	}
	
	
}
