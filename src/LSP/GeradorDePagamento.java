package LSP;

import java.util.List;

public class GeradorDePagamento {
	
	private PagamentoBoleto boleto;
	private PagamentoCartao cartao;
	
	public void formadePagamento(List <Pagamento> pagamento) {
		
		for( Pagamento i : pagamento){
			if (i== boleto){
				boleto.boleto();	
			} 
			else {
				cartao.catao();
			}
		}
	}
	

}
