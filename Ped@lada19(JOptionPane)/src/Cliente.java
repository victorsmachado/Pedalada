
public class Cliente {
	
	public int id_cliente;
	public String nome;
	public String endereco;
	public String telefone;
	public String cpf;
	public int dia_nasc;
	public int mes_nasc;
	public int ano_nasc;
	
	
	public Cliente(int id_cliente, String nome, String endereco, String telefone, String cpf, int dia_nasc, int mes_nasc, int ano_nasc) {
		this.setId_cliente(id_cliente);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setCpf(cpf);
		this.setDia_nasc(dia_nasc);
		this.setMes_nasc(mes_nasc);
		this.setAno_nasc(ano_nasc);
		
	}

	public Cliente() {}
	
	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDia_nasc() {
		return dia_nasc;
	}

	public void setDia_nasc(int dia_nasc) {
		this.dia_nasc = dia_nasc;
	}

	public int getMes_nasc() {
		return mes_nasc;
	}

	public void setMes_nasc(int mes_nasc) {
		this.mes_nasc = mes_nasc;
	}

	public int getAno_nasc() {
		return ano_nasc;
	}

	public void setAno_nasc(int ano_nasc) {
		this.ano_nasc = ano_nasc;
	}

}
