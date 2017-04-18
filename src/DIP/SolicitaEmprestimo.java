package DIP;

import OCP.Emprestimo;

public class SolicitaEmprestimo {
	private boolean condicao ;
	private Emprestimo emprestimo;
	
	public void emprstimo(){
		if (condicao){
			String livro = null;
			emprestimo.solicitarEmprestimo(livro);
		}
	}
}
