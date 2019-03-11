import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cadastro {
	public static Scanner scanner;
	
	public Cadastro() {

		scanner = new Scanner(System.in);
	}
	
	public void cadastrarCliente() {
		scanner = new Scanner(System.in);
		for(int i = 0;  i < Banco_de_Dados.clientes.length; i++) {
			
			if(Banco_de_Dados.clientes[i] == null) {
				
	
				int id_cliente = i;
				
				
				String nome = JOptionPane.showInputDialog("Insira o nome para o cliente: ");
				
				
				String endereco = JOptionPane.showInputDialog("\nInsira o endereço para o cliente: ");
				
				
				String telefone = JOptionPane.showInputDialog("\nInsira um telefone para o cliente: ");
				
				
				String cpf = JOptionPane.showInputDialog("\nInsira um cpf para o cliente: ");
				
				
				String data_nasc = JOptionPane.showInputDialog("\nInsira a data de nascimento para o cliente: ");
				int dia_nasc= Integer.parseInt(data_nasc.substring(0,2));
				int mes_nasc= Integer.parseInt(data_nasc.substring(2,4));
				int ano_nasc= Integer.parseInt(data_nasc.substring(4,8));
				
				Cliente nova = new Cliente(id_cliente, nome, endereco, telefone, cpf, dia_nasc, mes_nasc, ano_nasc);
				Banco_de_Dados.clientes[i] = nova;
				
				JOptionPane.showMessageDialog(null, "\nNovo Cliente adicionado com id : " + i);
				break;
				
				
			}
		}
	}
	
	public void cadastrarBicicleta() {
		scanner = new Scanner(System.in);
		for(int i = 0; i < Banco_de_Dados.bicicletas.length; i++) {
			if(Banco_de_Dados.bicicletas[i] == null) {
				int ID = i;
				
				
				String modelo2 = JOptionPane.showInputDialog("\nEscolha o modelo para a bicicleta dentre as opções: "
						+ "\n1- urbana          \n2-dobravel          \n3-infantil          \n4-bmx ");
				int modelo = Integer.parseInt(modelo2);
				
				String status;
				
				
				String escolha2 = JOptionPane.showInputDialog("\nInsira um status para a bicicleta: "
						+ "\n1- disponivel         \n2- alugada          \n3- manutenção");
				int escolha = Integer.parseInt(escolha2);
				if(escolha ==1) {
					status = "disponivel";
				}
				if(escolha ==2) {
					status = "alugada";
				}
				else {
					status = "manutenção";
				}
				
				String valor = JOptionPane.showInputDialog("\nInsira um preço para a bicicleta: ");
				double preco = Double.parseDouble(valor);
				
				Bicicleta nova = new Bicicleta(ID, modelo, status, preco);
				Banco_de_Dados.bicicletas[i] = nova;
				
				JOptionPane.showMessageDialog(null, "\nNova bicicleta adicionada com id: " + i);
				break;
				
			}
		}
	}
}
