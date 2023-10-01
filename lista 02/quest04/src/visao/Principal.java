package visao;
import aplicacao.Ingresso;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		Random rand= new Random();
		 
		ArrayList<Ingresso> room = new ArrayList<Ingresso>();
		
		int code, min = 1000, max = 9999, option, i, cont = 0;
		String cpfAux, response;
		boolean flag = true, flag2 =  false, flag3, flag4;
		
		System.out.println("---TICKET PURCHASE---");
		
		do {
			System.out.println("\n---------------");
			System.out.println("1- Buy Ticket");
			System.out.println("2- Alter Data");
			System.out.println("3- Give up your ticket");
			System.out.println("4- Check Tickets");
			System.out.println("5- Exit");
			System.out.println("-----------------");
			System.out.println("\nEnter the option you want");
			option = keyBoard.nextInt();
			
			switch(option) {
			
			case 1:	Ingresso ticket = new Ingresso();	
				System.out.println("\nEnter your CPF: ");
				keyBoard.nextLine();
				ticket.setCpf(keyBoard.nextLine());
				for(i=0; i<room.size(); i++) {
					if(ticket.getCpf().equals(room.get(i))) {
						System.out.println("\n\t--You cannot make another purchase--");
						flag = false;
					}
				}
				if(flag) {
					System.out.println("Enter the name of movie: ");
					ticket.setName(keyBoard.nextLine());
					System.out.println("Choose your seat: ");
					ticket.setSeat(keyBoard.nextInt());
					System.out.println("Half or Whole? (Enter 'Meia' or 'Inteira'): ");
					keyBoard.nextLine();
					ticket.setValue(keyBoard.nextLine());
					code = (int)(Math.random()*(max - min + 1) + min);
					ticket.setNumberId(code);
				}
				room.add(ticket);
				cont++;
				break;
				
			case 2: if(cont>0) { 
				System.out.println("\nEnter the CPF you entered on your ticket: ");
				keyBoard.nextLine();
				cpfAux = keyBoard.nextLine();
				for(i=0; i<room.size(); i++) {
					if(room.get(i).getCpf().equals(cpfAux)) {
						Ingresso ticketAux = room.get(i);
						System.out.println("\n--Enter New Data--");
						System.out.println("new CPF: ");
						room.get(i).setCpf(keyBoard.nextLine());
						System.out.println("new seat: ");
						room.set(i, ticketAux).setSeat(keyBoard.nextInt());
						System.out.println("Half or Whole? (Enter 'Meia' or 'Inteira'): ");
						keyBoard.nextLine();
						room.set(i, ticketAux).setValue(keyBoard.nextLine());
						flag2 = true;
					}
				}
				if(!flag2) {
					System.out.println("\nERROR :: --The CPF you indicated is incorrect--");
				}
			}else {
				System.out.println("\n--No purchases yet");
			}
				break;
				
			case 3:	if(cont>0) {
				System.out.println("\nEnter your CPF: ");
				keyBoard.nextLine();
				cpfAux = keyBoard.nextLine();
				for(i=0; i<room.size(); i++) {
					if(room.get(i).getCpf().equals(cpfAux)) {
						do {
							flag3 = false;
							System.out.println("\nDo you really want to give up your ticket (Enter: Sim or Nao)?");
							response = keyBoard.nextLine();
							if(response.equals("Sim")) {
								room.remove(i);
								cont--;
								System.out.println("\nSuccessful withdrawal!!");
								flag3 = true;
							}else if(response.equals("Nao")) {
								System.out.println("\n--Withdrawal canceled--");
								flag3 = true;
							}else {
								System.out.println("\nENTER A VALID RESPONSE");
							}
						}while(!flag3);
					}
				}
			}else {
				System.out.println("\n--No purchases yet");
			}
				break;
				
			case 4:	if(cont>0) {
				flag4 = false;
				System.out.println("\nEnter the ticket CPF: ");
				keyBoard.nextLine();
				cpfAux = keyBoard.nextLine();
				for(i=0; i<room.size(); i++) {
					if(room.get(i).getCpf().equals(cpfAux)) {
						System.out.println("\n-- YOUR TICKET DETAILS --");
						System.out.println("Ticket number: "+room.get(i).getNumberId());
						System.out.println("CPF: "+room.get(i).getCpf());
						System.out.println("Chosen film: "+room.get(i).getName());
						System.out.println("Chosen Seat: "+room.get(i).getSeat());
						System.out.println("Entrance: "+room.get(i).getValue());
						flag4 = true;
					}
				}
				
				if(!flag4) {
					System.out.println("\n--CPF invalid--");
				}
				
			}else {
				System.out.println("\n--No purchases yet");
			}
				
				break;
				
			case 5: System.out.println("\n\n-- GOODBYE =)");
				break;
				
			default: System.out.println("\nERROR :: --Enter a valid option--");
			
			}
		}while(option!=5);
	}
}
