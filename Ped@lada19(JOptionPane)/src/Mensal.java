
public class Mensal extends Pagamento {

	public Mensal(Reserva reserva) {
		super(reserva);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pagamento() {
		long x = reserva.getData_de_entrega();
		long l = x  /3600000;
		
		long y = reserva.getData_de_devolucao();
		long t = y  /3600000;
		
		long tempo = t  - l;
		
		
		//double desconto = reserva.getB().getPreco() /100 *30;
		double precofinal = (tempo * reserva.getB().getPreco()) * 0.70;
		return precofinal;
	}

}
