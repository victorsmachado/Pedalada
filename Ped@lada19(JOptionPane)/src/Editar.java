import javax.swing.JOptionPane;
import java.util.Scanner;

public class Editar{
	public static Scanner scanner;

	public static void editarCliente(){
		scanner = new Scanner(System.in);

		int leave = 0;
		int option = 0;
		int cliente = 0;
		while(leave == 0) {
			switch(option) {
			case 1:{
				option = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n" +
				"2 - Editar nome. \n" +
				"3 - Editar endereço. \n" +
				"4 - Editar telefone. \n" +
				"5 - Editar cpf. \n" +
				"6 - Editar data de nascimento. \n" +
				"7 - Sair. \n"));
				
				if(option == 7)
					leave=1;
				break;
			}

			case 0:{
				String C1 = "";
				
				for(Cliente cliente1:Banco_de_Dados.clientes) {
					if(cliente1 != null) {
						String C = cliente1.getId_cliente() + " - " + cliente1.getNome() + "\n";
						
						C1 = C1 + C;
					}
				}
				JOptionPane.showMessageDialog(null, C1 );
				
				cliente = Integer.parseInt(JOptionPane.showInputDialog("escolha o cliente digitando o seu id: "));
				option = 1;
				break;
			}

			case 2:{
				
				String nomeNovo = JOptionPane.showInputDialog("Digite o novo nome.\n");
				Banco_de_Dados.clientes[cliente].setNome(nomeNovo);
				
				JOptionPane.showMessageDialog(null, "\nNome alterado\n");
				option = 1;
				break;
			}

			case 3:{
				
				String enderecoNovo = JOptionPane.showInputDialog("Digite o novo endereço.\n");
				Banco_de_Dados.clientes[cliente].setEndereco(enderecoNovo);
				
				JOptionPane.showMessageDialog(null, "\nEndereço alterado\n");
				option = 1;
				break;
			}

			case 4:{
				
				String telefoneNovo = JOptionPane.showInputDialog("Digite o novo telefone.\n");
				Banco_de_Dados.clientes[cliente].setTelefone(telefoneNovo);
				
				JOptionPane.showMessageDialog(null, "\nTelefone alterado\n");
				option = 1;
				break;}

			case 5:{
				
				String cpfNovo = JOptionPane.showInputDialog("Digite o novo cpf.\n");
				Banco_de_Dados.clientes[cliente].setCpf(cpfNovo);
				
				JOptionPane.showMessageDialog(null, "\nCPF alterado\n");
				option = 1;
				break;}

			case 6:{
				
				String data_nascNovo = JOptionPane.showInputDialog("Digite o nova data de nascimento.\n");
				int dia_nascNovo= Integer.parseInt(data_nascNovo.substring(0,2));
				int mes_nascNovo= Integer.parseInt(data_nascNovo.substring(2,4));
				int ano_nascNovo= Integer.parseInt(data_nascNovo.substring(4,8));
				Banco_de_Dados.clientes[cliente].setDia_nasc(dia_nascNovo);
				Banco_de_Dados.clientes[cliente].setMes_nasc(mes_nascNovo);
				Banco_de_Dados.clientes[cliente].setAno_nasc(ano_nascNovo);
			
				JOptionPane.showMessageDialog(null, "Data de nascimento alterado.\n");
				option = 1;
				break;
			}

			}
		}
	}
	public static void editarBicicleta(){
		int leave = 0;
		int option = 0;
		int bicicleta = 0;
		while(leave == 0) {
			switch(option) {
			case 1:{
				option = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n" +
						"2 - Editar modelo. \n" +
						"3 - Editar status. \n" +
						"4 - Editar preço. \n" +
						"5 - Sair. \n"));
				
				if(option == 5)
					leave=1;
				break;
			}

			case 0:{
				String B1 ="";
				for(Bicicleta bicicleta1:Banco_de_Dados.bicicletas) {
					if(bicicleta1 != null) {
						
						String B = bicicleta1.getID_bicicleta() + " - " + bicicleta1.getModelo() + " - " + bicicleta1.getPreco() + "\n";
					
						B1 = B1 + B;
					}
					
				}
				JOptionPane.showMessageDialog(null, B1 );
				bicicleta = Integer.parseInt(JOptionPane.showInputDialog("escolha a bicicleta digitando o seu id: "));
				option = 1;
				break;

			}

			case 2:{
				
				String modelo2 = JOptionPane.showInputDialog("\nEscolha o novo modelo indicando o numero ao lado das opções das bicicletas: "
						+ "\n1- urbana          \n2-dobravel          \n3-infantil          \n4-bmx ");
				int modeloNovo = Integer.parseInt(JOptionPane.showInputDialog(modelo2));
				Banco_de_Dados.bicicletas[bicicleta].setModelo(modeloNovo);
				
				JOptionPane.showMessageDialog(null, "Modelo alterado\n");
				option = 1;
				break;
			}

			case 3:{
				
				String escolha2 = JOptionPane.showInputDialog("\nInsira um status para a bicicleta: "
						+ "\n1- disponivel         \n2- alugada          \n3- manutenção");
				int escolha = Integer.parseInt(escolha2);
				String statusNovo = "";
				if(escolha ==1) {
					statusNovo = "disponivel";
				}
				if(escolha ==2) {
					statusNovo = "alugada";
				}
				else {
					statusNovo = "manutenção";
				}
				Banco_de_Dados.bicicletas[bicicleta].setStatus(statusNovo);
				
				JOptionPane.showMessageDialog(null, "Status alterado\n");

				option = 1;
				break;
			}

			case 4:{
				
				double precoNovo = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço.\n"));
				Banco_de_Dados.bicicletas[bicicleta].setPreco(precoNovo);
				
				JOptionPane.showMessageDialog(null, "Preço alterado\n");

				option = 1;
				break;
			}
			}
		}
	}

	public static void editarReserva(){
		int leave = 0;
		int option = 0;
		int reserva = 0;
		while(leave == 0) {
			switch(option) {
			case 1:{
				
				option = Integer.parseInt(JOptionPane.showInputDialog("\nEscolha uma das opções: \n" +
						"2 - Editar status da reserva. \n" +
						"3 - Editar preço da reserva. \n" +
						"4 - Editar data de entrega. \n" +
						"5 - Editar data de devolução. \n" +
						"6 - Editar Cliente. \n" +
						"7 - Editar Bicicleta. \n" +
						"6 - Sair. \n"));
				if(option == 6)
					leave=1;
				break;
			}

			case 0:{
				String R1 ="";
				for(Reserva reserva1:Banco_de_Dados.reservas) {
					if(reserva1 != null) {
						
						String R = reserva1.getId_reserva() + " - " + reserva1.getC().getNome() + " - " + reserva1.getC().getCpf() + "\n";
						
						R1 = R1 + R;
					}
					
				}
				JOptionPane.showMessageDialog(null, R1 );
				reserva = Integer.parseInt(JOptionPane.showInputDialog("escolha a reserva digitando o seu id: "));
				option = 1;
				break;
			}

			case 2:{
				
				String checkNovo = JOptionPane.showInputDialog("Digite o novo status da reserva.\n");
				Banco_de_Dados.reservas[reserva].setCheck(checkNovo);
				
				JOptionPane.showMessageDialog(null, "Status alterado");
				option = 1;
				break;
			}

			case 3:{
				
				double precoNovo = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço. \n"));
				Banco_de_Dados.reservas[reserva].setPreco_final(precoNovo);
				
				JOptionPane.showMessageDialog(null, "Preço alterado");
				option = 1;
				break;
			}

			case 4:{
				
				long data_de_entregaNovo = Long.parseLong(JOptionPane.showInputDialog("Digite a nova data de entrega. \n"));
				Banco_de_Dados.reservas[reserva].setData_de_entrega(data_de_entregaNovo);;
				
				JOptionPane.showMessageDialog(null, "Data de entrega alterada");
				option = 1;
				break;
			}

			case 5:{
				
				long data_de_devolucaoNovo = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova data de devolução.\n"));
				Banco_de_Dados.reservas[reserva].setData_de_devolucao(data_de_devolucaoNovo);
				
				JOptionPane.showMessageDialog(null, "Data de devolução alterada");
				option = 1;
				break;
			}

			case 6:{
				
				String C1 = "";
				
				for(Cliente cliente1:Banco_de_Dados.clientes) {
					if(cliente1 != null) {
						String C = cliente1.getId_cliente() + " - " + cliente1.getNome() + "\n";
						
						C1 = C1 + C;
					}
				}
				JOptionPane.showMessageDialog(null, C1 );
				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione o cliente pelo seu ID. \n"));
			    Cliente clienteNovo = Banco_de_Dados.clientes[escolha];
			    Banco_de_Dados.reservas[reserva].setC(clienteNovo);
			    JOptionPane.showMessageDialog(null, "Cliente alterado.");
				option = 1;
				break;
			}

			case 7:{
				
				String B1 ="";
				for(Bicicleta bicicleta1:Banco_de_Dados.bicicletas) {
					if(bicicleta1 != null) {
						String B = bicicleta1.getID_bicicleta() + " - " + bicicleta1.getModelo() + " - " + bicicleta1.getPreco() + "\n";
						B1 = B1 + B;
					}
				}
				JOptionPane.showMessageDialog(null, B1 );
				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione a bicicleta pelo seu ID. \n"));
			    Bicicleta bicicletaNova = Banco_de_Dados.bicicletas[escolha];
			    Banco_de_Dados.reservas[reserva].setB(bicicletaNova);

						
			    JOptionPane.showMessageDialog(null, "Bicicleta alterada.");
				option = 1;
				break;
			}
			}
		}
	}
}
