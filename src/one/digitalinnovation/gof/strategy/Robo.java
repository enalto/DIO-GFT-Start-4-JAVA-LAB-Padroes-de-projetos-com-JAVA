package one.digitalinnovation.gof.strategy;

public class Robo {

	private IComportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}
}
