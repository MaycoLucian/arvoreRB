package br.com.estrutura.dados.arvore;

public class Nodo {

	public Integer valor;
	public Nodo p;
	public Nodo esq;
	public Nodo dir;
	public boolean ver; // Uma flag booleana, que quando tiver valor "true",
							// significa que o Nodo eh de cor vermelha, caso contrario eh preto

	public Nodo(int valor, boolean ver) {
		this.valor = valor;
		this.ver = ver;
		this.p = this.esq = this.dir = Arvore.nil;
	}

	public Nodo encontra(int n) {
		if (n < this.valor && this.esq != Arvore.nil)
			return this.esq.encontra(n);
		else if (n > this.valor && this.dir != Arvore.nil)
			return this.dir.encontra(n);
		else
			return this;
	}

	public Nodo maximo() {
		if (this.dir != Arvore.nil)
			return dir.maximo();
		else
			return this;
	}
	
	/**
	 * Vai mostrar o valor mais baixo presente na árvore a partir do Nodo que esta rodando no momento
	 * @return
	 */	
	public Nodo minimo() {
		if (this.esq != Arvore.nil) return esq.minimo();
		else return this;
	}

	public void imprimirArvore() {
		if (this.esq != Arvore.nil)
			this.esq.imprimirArvore();
		System.out.println(this.valor);
		if (this.dir != Arvore.nil)
			this.dir.imprimirArvore();
	}

	/**
	 * Informa o valor do Nodo que antecede (em termos de valores) o atual Nodo
	 */
	public Nodo predecessor() {
		if (this.esq != Arvore.nil)
			return this.esq.maximo();
		else
			return this;
	}

	/**
	 * Informa o valor do Nodo que sucede (em termos de valores) o atual Nodo
	 */
	public Nodo sucessor() {
		if (this.dir != Arvore.nil)
			return this.dir.minimo();
		else
			return this;
	}
	
	public void grafico() {
		if (this.ver) {
				System.out.println("\t" + this.valor + " [style = filled, fillcolor = red];");
		} else {
				System.out.println("\t" + valor + " [style = filled, fillcolor = black, fontcolor = white];");
		}

		if (this.esq != Arvore.nil) {
				System.out.println("\t" + valor + " -> " + this.esq.valor + " [label = \" esq\"];");
				this.esq.grafico();
		}
		else {
				System.out.println("\t" + valor + " -> nil [label = \" esq\"];");
		}

		if (this.dir != Arvore.nil) {
				System.out.println("\t" + valor + " -> " + this.dir.valor + " [label = \" dir\"];");
				this.dir.grafico();
		}
		else {
				System.out.println("\t" + valor + " -> nil [label = \" dir\"];");
		}
	}
	
	public void encontra50(Integer q, int aux, Arvore res) {
		if(q >= 50) return;

		if (this.esq != Arvore.nil) {
			this.esq.encontra50(q, aux, res);
		}
		if (this.valor > aux && q < 50) {
			res.adiciona(this.valor);
			q++;
		}
		if (this.dir != Arvore.nil) {
			this.dir.encontra50(q, aux, res);
		}
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Nodo getP() {
		return p;
	}

	public void setP(Nodo p) {
		this.p = p;
	}

	public Nodo getEsq() {
		return esq;
	}

	public void setEsq(Nodo esq) {
		this.esq = esq;
	}

	public Nodo getDir() {
		return dir;
	}

	public void setDir(Nodo dir) {
		this.dir = dir;
	}

	public boolean isVer() {
		return ver;
	}

	public void setVer(boolean ver) {
		this.ver = ver;
	}
}
