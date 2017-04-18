package LSP;

import java.util.Date;


public class Pagamento {
	
	private float valor;
	private Date periodo;
	public Pagamento(float valor, Date periodo) {
		super();
		this.valor = valor;
		this.periodo = periodo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}
	
	

}
