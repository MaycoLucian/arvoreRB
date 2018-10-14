package br.com.estrutura.dados.main;

import br.com.estrutura.dados.arvore.Arvore;

public class Main {

	public static void main(String args[]) {
		Arvore arv = new Arvore();
		arv.adiciona(10);
		arv.adiciona(20);
		arv.adiciona(21);
		//arv.adiciona(25);
		arv.print();
	}
}
