package br.com.estrutura.dados.arvore;

public class Nodo {
	
	/**

	public Nodo avo(Nodo n) {
	    if (n.getParent() == null) {
	        return null; // Nao ter pai significa nao ter avo
	    }
	    Nodo pai = n.getParent();
	    return pai.getParent(); // Se o pai tiver pai, retorna-o. Caso contrario, o 
	    // retorno do metodo getParent sera null, e o retorno será null.
	}
	
	public Nodo tio(Nodo n) {
	    Nodo avo = avo(n);
	    if (avo == null) {
	        return null;
	    }
	    Nodo pai = n.getParent();
	    // Nao existe como saber se o pai eh maior ou menor que o avo, entao
	    // para recuperar o tio, comparamos os dois.
	    
	    if (pai.compareTo(avo) > 0) { // Se pai > avo
	        return avo.getLeft(); // retorna o filho da esquerda, que eh menor.
	        // Caso nao exista, retorna null.
	    } else { // Se pai < avo
	        return avo.getRight(); // retorna o filho da direita, que eh maior.
	        // Caso nao exista, retorna null.
	    }
	}
	
	public void fixCase1(Nodo n) {
	    if (n.getParent() == null) { // Se o no for raiz, pinta de preto.
	        n.setColor(Color.BLACK);
	    } else { // Se nao for, parte para o caso 2.
	        fixCase2(n);
	    }
	}
	
	public void fixCase2(Nodo n) {
	    Color corDoPai = n.getParent().getColor();
	    if (corDoPai.equals(Color.RED) { // Se o pai tiver cor vermelha, parte
	        fixCase3(n); // para o caso 3. Se nao, a arvore esta correta.
	    }
	    
	}
	
	public void fixCase3(Nodo n) {
	    // So se chega a este metodo se o pai do no for vermelho.
	    // Verificaremos agora se o tio dele tambem eh vermelho.
	    Nodo tio = tio(n); // Caso nao exista tio, a variavel recebe null.
	    if (tio != null && tio.getColor().equals(Color.RED)) {
	        // se existe tio e ele eh vermelho:
	        // pinta o pai e o tio de preto, o avo de vermelho e roda o fixcase1 no
	        // avo para fazer os ajustes, caso estes sejam necessarios.
	        Nodo pai = n.getParent();
	        pai.setColor(Color.BLACK);
	        tio.setColor(Color.BLACK);
	        
	        Nodo avo = avo(n);
	        avo.setColor(Color.RED);
	        fixCase1(avo);
	    } else {
	        fixCase4(n); // Caso nao haja tio ou ele seja preto, parte ao caso 4.
	    }
	}
	
	public void fixCase4(Nodo n) {
	    Nodo pai = n.getParent();
	    Nodo avo = avo.getParent();
	    
	    if (n.compareTo(pai) > 0 && pai.compareTo(avo) < 0) {
	        // Se o no eh filho da direita e o pai eh filho da esquerda
	        rotaciona_esquerda(pai);
	        
	        n = n.getLeft(); // o no passa a ser o seu filho da esquerda, que
	        // antes da rotacao era o seu pai.
	    } else if (n.compareTo(pai) < 0 && pai.compareTo(avo) > 0) {
	        // Se o no eh filho da esquerda e o pai eh filho da direita
	        rotaciona_direita(pai);
	        
	        n = n.getRight(); // o no passa a ser o seu filho da direita, que
	        // antes da rotacao era o seu pai.
	    }
	    fixCase5(n);
	}
	
	public void fixCase5(Nodo n) {
	    Nodo avo = avo(n);
	    Nodo tio = tio(n);
	    Nodo pai = n.getParent();
	    
	    // pinta o pai de preto e o avo de vermelho
	    avo.setColor(Color.RED);
	    pai.setColor(Color.BLACK);
	    
	    if (n.compareTo(pai) < 0 && pai.compareTo(avo) < 0) {
	        // se o no eh filho da esquerda e o pai tambem, 
	        // rotaciona o avo a direita.
	        rotaciona_direita(avo);
	    } else {
	        // se nao, quer dizer que o no eh filho da direita e o pai tambem,
	        // e rotacionamos o avo a esquerda.
	        rotaciona_esquerda(avo);
	    }
	}
	
	public int blackHeightRecursive(Nodo no) {
  		int altura = 0;
  		if (!Nodo.isEmpty()) {
  			if (no.getColour() == Colour.BLACK) {
  				altura = 1 + Math.max(blackHeightRecursive(no.getLeft()), blackHeightRecursive(no.getRight()));
  			} else {
  				altura = Math.max(blackHeightRecursive(no.getLeft()), blackHeightRecursive(no.getRight()));
  			}
  		}
  		return altura;
  	} **/
}
