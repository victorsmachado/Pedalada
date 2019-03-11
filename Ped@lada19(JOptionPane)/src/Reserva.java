
public class Reserva {
	
	
	public String check;
	public Bicicleta b;
	public Cliente c;
	public int id_reserva;
	public long data_de_entrega = 0;
	public long data_de_devolucao = 0;
	public double preco_final = 0;
	public int tipo = 0;
	
	public Reserva (double preco_final, int id_reserva, Cliente c, Bicicleta b, String check, long data_de_entrega, long data_de_devolucao, int tipo) {

		this.setId_reserva(id_reserva);
		this.setData_de_entrega(data_de_entrega);
		this.setData_de_devolucao(data_de_devolucao);
		this.setCheck(check);
		this.setB(b);
		this.setC(c);
		this.setPreco_final(preco_final);
		this.setTipo(tipo);
	}
	

	
	
	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}
	
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	
	public long getData_de_entrega() {
		return data_de_entrega;
	}
	public void setData_de_entrega(long data_de_entrega) {
		this.data_de_entrega = data_de_entrega;
	}
	public long getData_de_devolucao() {
		return data_de_devolucao;
	}
	public void setData_de_devolucao(long data_de_devolucao) {
		this.data_de_devolucao = data_de_devolucao;
	}
	public Bicicleta getB() {
		return b;
	}

	public void setB(Bicicleta b) {
		this.b = b;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}
	
	public double getPreco_final() {
		return preco_final;
	}

	public void setPreco_final(double preco_final) {
		this.preco_final = preco_final;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	
}
