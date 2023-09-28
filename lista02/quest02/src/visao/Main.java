package visao;
import java.util.Scanner;
import java.util.ArrayList;
import aplicacao.Pedido;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Pedido> p = new ArrayList<Pedido>();
		
		int opcao, id=0, idAux, i;
		boolean flag1, flag2;
		String respCliente;
		
		System.out.println("--IBOTIJÃO--");
		
		do {
			System.out.println("\n1- Fazer Pedido");
			System.out.println("2- Confirmar Entrega");
			System.out.println("3- Ver Pedidos Confirmados");
			System.out.println("4- Ver Pedidos Entregues");
			System.out.println("5- Sair");
			
			System.out.println("\nDigite a opção que deseja: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
			case 1: Pedido ped = new Pedido(id);
				System.out.println("\nDigite sua Localização: ");
				teclado.nextLine();
				ped.setEndereco(teclado.nextLine());
				System.out.println("Digite a hora atual: ");
				ped.setHora(teclado.nextLine());
				
				System.out.println("\n\n---DADOS---");
				System.out.println("Número do Pedido: "+ped.getId());
				System.out.println("Endereço Atual: "+ped.getEndereco());
				System.out.println("Hora em que foi realizara: "+ped.getHora());
				do {
					System.out.println("\nDeseja confirmar esses dados (Digite 'confirmo' ou 'alterar'?");
					respCliente = teclado.nextLine();
					if(respCliente.equals("confirmo")) {
						System.out.println("\nDigite a quantidade de botijões que deseja: ");
						ped.setQtdBotijoes(teclado.nextInt());
						ped.setTotalCompra();
						System.out.println("\nDigite o numero do cartão de crédito: ");
						teclado.nextLine();
						ped.setNumeroDoCartao(teclado.nextLine());
						
						flag1 = true;
						
					}else if(respCliente.equals("alterar")) {
						System.out.println("\nDigite nova Localização: ");
						ped.setEndereco(teclado.nextLine());
						System.out.println("Digite a hora atual: ");
						ped.setHora(teclado.nextLine());
						flag1=false;
						
					}else {
						System.out.println("\nDigite um dos dois conforme foi mostrado!");
						flag1=false;
					}
					
				}while(!flag1);
				
				id++;
				p.add(ped);
				break;
				
			case 2:if(id>0) {
					System.out.println("\nDigite o ID que deseja confirmar entrega: ");
					idAux = teclado.nextInt();
					flag2 = false;
					for(i=0;i<p.size();i++) {
						if(idAux==p.get(i).getId()) {
							System.out.println("\nStatus alterado, pedido foi entregue!!");
							Pedido pedido = p.get(i);
							p.set(i, pedido).setEntrega(true);
							flag2=true;
						}
					}
					if(!flag2) {
						System.out.println("Pedido não Localizado");
					}
				}else {
					System.out.println("\nAinda não foi feito nenhum pedido!!");
				}
				break;
				
			case 3:if(id>0) {
				for(i=0;i<p.size();i++) {
					if(p.get(i).getEntrega()==false) {
						System.out.println("\n\nNúmero do Pedido: "+p.get(i).getId());
						System.out.println("Endereço: "+p.get(i).getEndereco());
						System.out.println("Hora que foi pedido: "+p.get(i).getHora());
						System.out.println("Seu pedido será entrege daqui a 30 minutos de quando foi pedido");
						System.out.println("Status: Confirmado");
						System.out.println("\n\tTotal: "+p.get(i).getTotalCompra());
					}
				}
				}else {
					System.out.println("\nAinda não foi feito nenhum pedido!!");
				}
				break;
				
			case 4:if(id>0) {
					for(i=0;i<p.size();i++) {
						if(p.get(i).getEntrega()==true) {
							System.out.println("\n\nNúmero do Pedido: "+p.get(i).getId());
							System.out.println("Endereço: "+p.get(i).getEndereco());
							System.out.println("Hora que foi pedido: "+p.get(i).getHora());
							System.out.println("Status: Entregue");
							System.out.println("\n\tTotal: "+p.get(i).getTotalCompra());
						}
					}
				}else {
					System.out.println("\nAinda não foi feito nenhum pedido!!");
				}
				break;
				
			case 5:
				System.out.println("\n\nFim do Programa!!");
				break;
				
				default: System.out.println("\nERROR");
			}
			
		}while(opcao!=5);
	}

}
