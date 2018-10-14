package br.com.estrutura.dados.arvore;

public class No {
	public Integer v;
	public No p, esq, dir;
	public boolean cor;

	public No(int n, boolean cor) {
		this.v = n;
		this.cor = cor;
		this.p = this.esq = this.dir = Arvore.nil;
	}

	// Busca o n� que ser� o pai do proximo n� a ser inserido
	public No encontra(int n) {
		if (n < this.v && this.esq != Arvore.nil)
			return this.esq.encontra(n);
		else if (n > this.v && this.dir != Arvore.nil)
			return this.dir.encontra(n);
		else
			return this;
	}

	// Busca o menor valor da �rvore
	public No minimo() {
		if (this.esq != Arvore.nil)
			return esq.minimo();
		else
			return this;
	}

	public No sucessor() {
		if (this.dir != Arvore.nil)
			return this.dir.minimo();
		else
			return this;
	}

}
