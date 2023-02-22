package view;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		
		//instanciando a classe e criando um objeto
		MultiplicacaoController m = new MultiplicacaoController();
		
		int a = 5;
		int b = 4;
		
		int multiplicacao = m.multiplicacao(a, b);
		System.out.println("Multiplicação por soma: " + multiplicacao);		
		
	}

}