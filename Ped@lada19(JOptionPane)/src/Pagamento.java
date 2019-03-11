
public abstract class Pagamento {
	protected Reserva reserva;
	
	public Pagamento(Reserva reserva) {
		this.reserva = reserva;
	}
	
	public abstract double pagamento();
	
	public Reserva getReserva() {
		return reserva;
	}

}
