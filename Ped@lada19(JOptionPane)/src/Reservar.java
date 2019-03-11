import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.swing.JOptionPane;

public class Reservar {

	public void fazerReserva() {
		for(int i = 0;  i < Banco_de_Dados.reservas.length; i++) {

			if(Banco_de_Dados.reservas[i] == null) {
				int id_reserva = i;
				for(Cliente cliente:Banco_de_Dados.clientes) {
					if(cliente != null) {

						JOptionPane.showMessageDialog(null,"\nID: "+cliente.getId_cliente()+"\nNome: "+cliente.getNome()+"\nCPF: "+cliente.getCpf());
					}
				}

				String j2 = JOptionPane.showInputDialog(null,"\nSelecione o cliente pelo seu id: " );
				int j = Integer.parseInt(j2);

				Cliente c = Banco_de_Dados.clientes[j];

				for(Bicicleta bicicleta:Banco_de_Dados.bicicletas) {
					if(bicicleta != null) {

						JOptionPane.showMessageDialog(null,"\nID: "+bicicleta.getID_bicicleta()+
								"\nModelo: "+bicicleta.getModelo()
								+"\nStatus: "+bicicleta.getStatus()
								+"\nPreço: "+bicicleta.getPreco());
					}
				}

				int k = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua bicicleta pelo id: "));

				Bicicleta b = Banco_de_Dados.bicicletas[k];
				Date data = new Date();

				long data_de_entrega = data.getTime();
				long data_de_devolucao = data.getTime();
				double preco_final = 0.0;


				String check = "aberta";

				int tipo = Integer.parseInt(JOptionPane.showInputDialog("Selecione a forma de aluguel: \n" 
						+ "1 - horas\n"
						+ "2 - semanal\n"
						+ "3 - mensal"));


				Reserva nova = new Reserva(preco_final, id_reserva, c, b, check, data_de_entrega, data_de_devolucao, tipo);
				Banco_de_Dados.reservas[i] = nova;
				Banco_de_Dados.bicicletas[k].setStatus("alugada");

				JOptionPane.showMessageDialog(null,"\nReserva efetuada com id: " + i);
				break;


			}
		}
	}

	public void Check_out() {}
	public void finalizarReserva(){
DateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja encerrar uma reserva?");
		if(resposta==0) {
			for(Reserva reserva:Banco_de_Dados.reservas) {
				if(reserva != null) {
					//System.out.println("\nId da reserva: " +reserva.getId_reserva() + "\nId do cliente: " + reserva.getC().getId_cliente() + "\nId da bicicleta: " + reserva.getB().getID_bicicleta() + "\nNome do cliente: " + reserva.getC().getNome() + "\nModelo da bicicleta: " + reserva.getB().getModelo() + "\nPreço por hora: " + reserva.getB().getPreco() + "\nData em que a bicicleta foi retirada: " + reserva.getData_de_entrega() + "\nA reserva está\n " + reserva.getCheck());
					JOptionPane.showMessageDialog(null, "\nId da reserva: " 
							+reserva.getId_reserva() + "\nId do cliente: " 
							+ reserva.getC().getId_cliente() + "\nId da bicicleta: " 
							+ reserva.getB().getID_bicicleta() + "\nNome do cliente: " 
							+ reserva.getC().getNome() + "\nModelo da bicicleta: " 
							+ reserva.getB().getModelo() + "\nPreço por hora: " 
							+ reserva.getB().getPreco() + "\nData em que a bicicleta foi retirada: " 
							+ dt.format(reserva.getData_de_entrega()) + "\nA reserva está " 
							+ reserva.getCheck());
				}
			}

			int m = Integer.parseInt(JOptionPane.showInputDialog("Escolha a reserva através do seu id ou digite"));

			String checkNovo = "fechada";
			Date datao = new Date();
			Banco_de_Dados.reservas[m].setCheck(checkNovo);
			if(Banco_de_Dados.reservas[m].getTipo() == 3) {
				Banco_de_Dados.reservas[m].setData_de_devolucao(datao.getTime());
				Pagamento pg = new Mensal(Banco_de_Dados.reservas[m]);
				Banco_de_Dados.reservas[m].setPreco_final(pg.pagamento());
				
			}

			if(Banco_de_Dados.reservas[m].getTipo() == 2) {
				Banco_de_Dados.reservas[m].setData_de_devolucao(datao.getTime());
				Pagamento pg = new Semanal(Banco_de_Dados.reservas[m]);
				Banco_de_Dados.reservas[m].setPreco_final(pg.pagamento());
				
			}

			if(Banco_de_Dados.reservas[m].getTipo() == 1) {
				
				calcularPreco(m);
			}

			//calcularPreco(m);
			Banco_de_Dados.bicicletas[Banco_de_Dados.reservas[m].getB().getID_bicicleta()].setStatus("disponivel");
			

			JOptionPane.showMessageDialog(null, "A quantidade de horas foi: " + (((Banco_de_Dados.reservas[m].getData_de_devolucao()/3600000) - 
					Banco_de_Dados.reservas[m].getData_de_entrega()/3600000)) 
					+ String.format("\nO preço final é de: %.2f" ,Banco_de_Dados.reservas[m].getPreco_final()));
		}
	}

	public static void calcularPreco(int m) {
		Date data = new Date();
		long check_out = data.getTime();
		Banco_de_Dados.reservas[m].setData_de_devolucao(check_out);
		long tempofinal=  check_out - Banco_de_Dados.reservas[m].getData_de_entrega() ;
		System.out.println(tempofinal /3600000 + " Horas/n");
		System.out.println((tempofinal /3600000) * Banco_de_Dados.bicicletas[Banco_de_Dados.reservas[m].getB().ID_bicicleta].preco);
		Banco_de_Dados.reservas[m].setPreco_final((tempofinal /3600000) * Banco_de_Dados.bicicletas[Banco_de_Dados.reservas[m].getB().ID_bicicleta].preco);


	}

}
