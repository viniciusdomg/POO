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
		
		int code, min = 1000, max = 9999, option, i;
		boolean flag = true;
		
		System.out.println("---TICKET PURCHASE---");
		
		do {
			System.out.println("\n---------------");
			System.out.println("1- Buy Ticket");
			System.out.println("2- Alter Data");
			System.out.println("3- Give up your ticket");
			System.out.println("4- Exit");
			System.out.println("-----------------");
			System.out.println("\nEnter the option you want");
			option = keyBoard.nextInt();
			
			switch(option) {
			
			case 1:	Ingresso ticket = new Ingresso();	
				System.out.println("\nEnter your CPF: ");
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
					ticket.setValue(keyBoard.nextLine());
					code = (int)(Math.random()*(max - min + 1) + min);
					ticket.setNumberId(code);
				}
				room.add(ticket);
				
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			default: System.out.println("\nERROR :: Enter a valid option");
			
			}
		}while(option!=4);
	}
}
