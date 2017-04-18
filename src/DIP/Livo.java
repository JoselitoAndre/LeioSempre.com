package DIP;

import OCP.Emprestimo;

public class Livo implements Emprstimo {

	@Override
	public void comfirmaEmprestimo() {
		/*
		 * condicao para emprestimo:
		 * Está com o LeioSempre
		 */
		
		
	}

	@Override
	public void negaemprestimo() {
		/*
		 * condicao para negar o emprestimo
		 * Está com o assinante e nao ter um exemplar disponivel
		 */
		
		
	}

}
