import javax.swing.JOptionPane;

public class Menu {
	public static void imprimirMenu() {
		Cadastro cadastro = new Cadastro();
		Reservar checkin = new Reservar();
		Banco_de_Dados banco = new Banco_de_Dados();
		int sair = 0;
		int opcao = 0 ;
		banco.bancoBicicletas();
		banco.bancoClientes();
		
		
		while(sair == 0) {
			switch(opcao) {
				case 0:{
					
					int escolha = Integer.parseInt(JOptionPane.showInputDialog("\nEscolha uma das opções: \n"
							+ "1 - Cadastrar.\n"
							+ "2 - Listar.\n"
							+ "3 - Editar.\n"
							+ "4 - Abrir Reserva.\n"
							+ "5 - Finalizar reserva.\n"
							+ "6 - Sair.\n"));
					if(escolha == 1) {
						
						int cadastrar = Integer.parseInt(JOptionPane.showInputDialog("\nEscolha uma das opções: \n"
								+ "1 - Cadastro Cliente.\n"
								+ "2 - Cadastro Bicicleta.\n"));
						if(cadastrar == 1) {
							opcao = 1;
							break;
						}
						else {
							opcao = 2;
							break;
						}
					}
					if(escolha == 2) {
						int listar = Integer.parseInt(JOptionPane.showInputDialog("\nEscolha uma das opções: \n"
								+ "1 - Listar Cliente.\n"
								+ "2 - Listar Bicicleta.\n"
								+ "3 - Listar Reserva.\n"));
						if(listar == 1) {
							opcao = 4;
							break;

						}
						if(listar == 2) {
							opcao = 5;
							break;

						}
						else {
							opcao = 6;
							break;

						}

					}
					if(escolha == 3) {
						int editar = Integer.parseInt(JOptionPane.showInputDialog("\nEscolha uma das opções: \n"
								+ "1 - Editar Cliente.\n"
								+ "2 - Editar Bicicleta.\n"
								+ "3 - Editar Reserva.\n"));
						if(editar == 1) {
							opcao = 7;
							break;

						}
						if(editar == 2) {
							opcao = 8;
							break;

						}
						else {
							opcao = 9;
							break;

						}

					}
					if(escolha == 4) {
						opcao = 3;
						break;
					}
					if(escolha == 5) {
						opcao = 10;
					}
					if(escolha == 6)
						sair = 1;
					break;
				}
				
				case 1:{
					System.out.println("Cadastrar cliente");
					cadastro.cadastrarCliente();
					opcao=0;
					break;
				
				}
				
				case 2:{
					System.out.println("Cadastrar bicicleta");
					cadastro.cadastrarBicicleta();
					opcao=0;
				    break;
				}
				
				case 3:{
					System.out.println("Fazer reserva");
					checkin.fazerReserva();
					opcao=0;
					break;
				}
				
				case 4:{
					System.out.println("Listar clientes");
					Listar.imprimirClientes();
					opcao=0;
					break;
				}
				
				case 5:{
					System.out.println("Listar bicicletas");
					Listar.imprimirBicicletas();
					opcao=0;
					break;
				}
				
				case 6:{
					System.out.println("Listar Reservas");
					Listar.imprimirReservas();
					opcao=0;
					break;
				}
				case 7:{
					System.out.println("Editar dados de clientes");
					Editar.editarCliente();
					opcao=0;
					break;
				}
				
				case 8:{
					System.out.println("Editar dados de bicicletas");
					Editar.editarBicicleta();
					opcao=0;
					break;
				}
				
				case 9:{
					System.out.println("Editar dados da reserva");
					Editar.editarReserva();
					opcao=0;
					break;
				}
				
				case 10:{
					System.out.println("Fazer checkout da reserva");
					checkin.finalizarReserva();
					opcao=0;
					break;
				}
				
				
				default:{
					System.out.println("Erro! Entre com uma opção valida.");
					opcao=0;
					break;
				}
				
		}
	}
	}
}
