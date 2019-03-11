
public class Bicicleta extends Veiculo {
	public int ID_bicicleta;
	public int modelo;
	public String status;
	public double preco;

	
	public Bicicleta(int ID, int modelo, String status, double preco) {
		this.setID_bicicleta(ID);
		this.setModelo(modelo);
		this.setStatus(status);
		this.setPreco(preco);
		
	}
	
	public Bicicleta() {}

	public int getID_bicicleta() {
		return ID_bicicleta;
	}

	public void setID_bicicleta(int iD_bicicleta) {
		ID_bicicleta = iD_bicicleta;
	}
	
	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	

}
