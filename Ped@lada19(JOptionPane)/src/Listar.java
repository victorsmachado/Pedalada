import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Listar{

	public static void imprimirClientes() {
		//String C1 = "";
		String C = "";
		int lista = 0;
		int exit = 0;
		while(exit == 0) {
			switch(lista) {
			case 0:{
				String opcao2 = JOptionPane.showInputDialog("\nEscolha uma das opções: \n"
						+ "1 - Procurar pelo id.\n"
						+ "2 - Procurar pelo nome.\n"
						+ "3 - Procurar pelo cpf.\n"
						+ "4 - Listar todos os Clientes.\n"
						+ "5 - Sair.\n");

				lista = Integer.parseInt(opcao2);
				if(lista == 11)
					exit = 1;
				break;
			}
			case 1:{
				int id2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que você deseja listar"));
				for(Cliente cliente:Banco_de_Dados.clientes) {
					if(cliente != null) {
						if(id2 == cliente.getId_cliente()) {
							C = "\nID: "+cliente.getId_cliente()+"\nNome: "+cliente.getNome()+"\nEndereço: "
									+cliente.getEndereco()+"\nTelefone: "+cliente.getTelefone()+"\nCPF: "+cliente.getCpf()+"\nData de nascimento: "
									+cliente.getDia_nasc() + "/" + cliente.getMes_nasc() + "/" + cliente.getAno_nasc() + "\n";
						}
					}
				}
				JOptionPane.showMessageDialog(null, C);
				exit = 1;
				break;
			}
			case 2:{
				String nome2 = JOptionPane.showInputDialog("Digite o nome do cliente que você deseja listar");
				for(Cliente cliente:Banco_de_Dados.clientes) {
					if(cliente != null) {
						if(nome2.equals(cliente.getNome())) {
							C = "\nID: "+cliente.getId_cliente()+"\nNome: "+cliente.getNome()+"\nEndereço: "
									+cliente.getEndereco()+"\nTelefone: "+cliente.getTelefone()+"\nCPF: "+cliente.getCpf()+"\nData de nascimento: "
									+cliente.getDia_nasc() + "/" + cliente.getMes_nasc() + "/" + cliente.getAno_nasc() + "\n";
						}
					}
				}
				JOptionPane.showMessageDialog(null, C);
				exit = 1;
				break;
			}
			case 3:{
				String cpf2 = JOptionPane.showInputDialog("Digite o cpf do cliente que você deseja listar");
				for(Cliente cliente:Banco_de_Dados.clientes) {
					if(cliente != null) {
						if(cpf2.equals(cliente.getCpf())) {
							C = "\nID: "+cliente.getId_cliente()+"\nNome: "+cliente.getNome()+"\nEndereço: "
									+cliente.getEndereco()+"\nTelefone: "+cliente.getTelefone()+"\nCPF: "+cliente.getCpf()+"\nData de nascimento: "
									+cliente.getDia_nasc() + "/" + cliente.getMes_nasc() + "/" + cliente.getAno_nasc() + "\n";
						}
					}
				}
				JOptionPane.showMessageDialog(null, C);
				exit = 1;
				break;
			}
			case 4:{
				String C1 = "";
				for(Cliente cliente:Banco_de_Dados.clientes) {
					if(cliente != null) {
						C = "\nID: "+cliente.getId_cliente()+"\nNome: "+cliente.getNome()+"\nEndereço: "
								+cliente.getEndereco()+"\nTelefone: "+cliente.getTelefone()+"\nCPF: "+cliente.getCpf()+"\nData de nascimento: "
								+cliente.getDia_nasc() + "/" + cliente.getMes_nasc() + "/" + cliente.getAno_nasc() + "\n";
						C1 = C1 + C;

					}
				}
				JOptionPane.showMessageDialog(null, C1);
				exit = 1;
				break;
			}
			case 5:{
				exit = 1;
				break;
			}
			default:{
				exit = 1;
			}

			}
		}
		
	}

	public static void imprimirBicicletas() {
		String B1 = "";
		int modelo2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o modelo de bicicletas que você deseja listar ou digite 0 para listar todas."));
		for(Bicicleta bicicleta:Banco_de_Dados.bicicletas) {
			if(bicicleta != null) {
				if(modelo2 == 0) {
					String B = "\nID: "+bicicleta.getID_bicicleta()+
					"\nModelo: "+bicicleta.getModelo()+"\nStatus: "+bicicleta.getStatus()+
					"\nPreço: "+bicicleta.getPreco() + "\n";
					B1 = B1 + B;
				}
				
				if(modelo2 == bicicleta.getModelo()) {
					String B = "\nID: "+bicicleta.getID_bicicleta()+
							"\nModelo: "+bicicleta.getModelo()+"\nStatus: "+bicicleta.getStatus()+
							"\nPreço: "+bicicleta.getPreco() + "\n";
					B1 = B1 + B;
				}
			}
		}
		JOptionPane.showMessageDialog(null, B1);
	}

	public static void imprimirReservas() {
		String R1 = "";
		String nome2 = JOptionPane.showInputDialog("Insira o nome do cliente para listar suas reservas ou digite 0 para listar todas.");
		SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		for(Reserva reserva:Banco_de_Dados.reservas) {
			if(reserva != null) {
				if(nome2.equals("0")) {
					String R = "\nStatus: "+reserva.getCheck()+
							"\nID da Reserva: "+reserva.getId_reserva()+"\nID do Cliente: "+
							reserva.getC().getId_cliente()+"\nNome do Cliente: "+reserva.getC().getNome() +
							"\nID da Bicicleta: "+reserva.getB().getID_bicicleta()+"\nModelo da bicicleta: "+
							reserva.getB().getModelo()+"\nPreço por hora da bicicleta: "+reserva.getB().getPreco()+
							"\nData em que a Bicicleta foi entregue: "+padrao.format(reserva.getData_de_entrega())+
							"\nData em que a bicicleta foi devolvida: "+padrao.format(reserva.getData_de_devolucao()) + 
							"\nPreço final da reserva: "+reserva.getPreco_final();
					R1 = R1 + R;
				}
				
				
				
				if(nome2.equals(reserva.c.getNome())) {
				
						String R = "\nStatus: "+reserva.getCheck()+
						"\nID da Reserva: "+reserva.getId_reserva()+"\nID do Cliente: "+
						reserva.getC().getId_cliente()+"\nNome do Cliente: "+reserva.getC().getNome() +
						"\nID da Bicicleta: "+reserva.getB().getID_bicicleta()+"\nModelo da bicicleta: "+
						reserva.getB().getModelo()+"\nPreço por hora da bicicleta: "+reserva.getB().getPreco()+
						"\nData em que a Bicicleta foi entregue: "+padrao.format(reserva.getData_de_entrega())+
						"\nData em que a bicicleta foi devolvida: "+padrao.format(reserva.getData_de_devolucao()) + 
						"\nPreço final da reserva: "+reserva.getPreco_final();
				R1 = R1 + R;
				}
			}
		}
		JOptionPane.showMessageDialog(null, R1);
	}

}
