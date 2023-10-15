package visao;
import java.util.ArrayList;
import java.util.Scanner;
import aplicacao.Contato;

public class TelaPrincipal {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		ArrayList <Contato> contact = new ArrayList<Contato>();
		
		int option, cont=0, i;
		boolean flag, flag2;
		String numberAux, response;
		
		System.out.println(" -- CONTACT LISTA -- ");
		
		do {
			System.out.println("\n-----------------");
			System.out.println("1- Registe contact");
			System.out.println("2- Delete contact");
			System.out.println("3- List contacts");
			System.out.println("4- Exit");
			System.out.println("-----------------");
			System.out.println("\nEnter the option you want: ");
			option = keyBoard.nextInt();
			
			switch(option) {
			
			case 1:	Contato pessoa = new Contato();
					flag = true;
					System.out.println("\nEnter name: ");
					keyBoard.nextLine();
					pessoa.setName(keyBoard.nextLine());
					do {
						System.out.println("Enter telephone: ");
						pessoa.setTelephone(keyBoard.nextLine());
						for(i=0;i<contact.size();i++) {
							if(contact.get(i).getTelephone().equals(contact.get(cont).getTelephone())) {
								System.out.println("\n--Existing phone number--");
								flag = false;
							}
							
						}
					}while(!flag);
						
					do {
						System.out.println("Enter email: ");
						pessoa.setEmail(keyBoard.nextLine());
						for(i=0;i<contact.size();i++) {
							if(contact.get(i).getEmail().equals(contact.get(cont).getEmail())) {
								System.out.println("\n--Existing email--");
								flag = false;
							}
						}
					}while(!flag);
					cont++;
				contact.add(pessoa);
				break;
				
			case 2:	if(cont>0) {	
				flag2 = false;
				System.out.println("\nEnter the contact number: ");
				keyBoard.nextLine();
				numberAux = keyBoard.nextLine();
				for(i=0;i<contact.size();i++) {
					if(contact.get(i).getTelephone().equals(numberAux)) {
						do {
							System.out.println("\nDo you really want to delete this contact (Enter: Sim or Nao)? ");
							response = keyBoard.nextLine();
							if(response.equals("Sim")) {
								contact.remove(i);
								cont--;
								System.out.println("\nContact successfully deleted!!");
								flag2 = true;
							}else if(response.equals("Nao")) {
								System.out.println("\n--Action canceled--");
								flag2 = true;
							}else {
								System.out.println("\nENTER A VALUE VALID");
							}
						}while(!flag2);
					}
				}
				
				if(!flag2) {
					System.out.println("\nERROr :: --Number Not Found-- ");
				}
			}else {
				System.out.println("\n--No contact refgi");
			}
				break;
				
			case 3:	if(cont>0) {
				System.out.println("\n -- CONTACT LIST -- ");
				for(i=0;i<contact.size();i++) {
					System.out.println("\nName: "+contact.get(i).getName());
					System.out.print("\tTelephone: "+contact.get(i).getTelephone());
					System.out.print("\tEmail: "+contact.get(i).getEmail());
				}
				
			}else {
				System.out.println("\n--No contact refgi");
			}
				break;
				
			case 4: System.out.println("\n\nGOODBYE =)");
				break;
				
			default: System.out.println("\n ERROR :: -- option invalid -- ");
			
			}
			
		}while(option!=5);
			
	}
}
