
public class Banco_de_Dados{
	public static Cliente[] clientes;
	public static Bicicleta[] bicicletas;
	public static Reserva[] reservas;

	
	public Banco_de_Dados() {
		clientes = new Cliente[100];
		bicicletas = new Bicicleta[100];
		reservas = new Reserva[100];
	}
	
	public void bancoBicicletas() {
		for(int i = 0; i < bicicletas.length; i++) {
			if(bicicletas[i] == null) {
				int ID = i;
				int modelo = 2;
				String status = "disponivel";
				double preco = 2.00;
				Bicicleta nova = new Bicicleta(ID, modelo, status, preco);
				bicicletas[i] = nova;
				System.out.println("\nNova bicicleta adicionada com id: "+ i);
				break;
				
			}
		}
	}
	public void bancoClientes() {
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null) {
				int id_cliente = i;
				String nome = "jose";
				String endereco = "rua";
				String telefone = "12";
				String cpf = "25";
				int dia_nasc = 9;
				int mes_nasc = 12;
				int ano_nasc = 1997;
				Cliente nova = new Cliente(id_cliente, nome, endereco, telefone, cpf, dia_nasc, mes_nasc, ano_nasc);
				clientes[i] = nova;
				System.out.println("\nNova bicicleta adicionada com id: "+ i);
				break;
				
			}
		}
	}
	
	
}