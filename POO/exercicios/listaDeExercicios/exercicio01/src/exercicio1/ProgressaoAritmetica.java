package exercicio1;

public class ProgressaoAritmetica {
	  	private int primeiroTermo;
	    private int razao;
	    private int termoAtual;

	    public ProgressaoAritmetica(int primeiroTermo, int razao) {
	        this.primeiroTermo = primeiroTermo;
	        this.razao = razao;
	        this.termoAtual = primeiroTermo;
	    }

	    public int proximoTermo() {
	        int proximo = termoAtual;
	        termoAtual += razao;
	        return proximo;
	    }

		public int getTermoAtual() {
			return termoAtual;
		}

		public void setTermoAtual(int termoAtual) {
			this.termoAtual = termoAtual;
		}

	
	    
}
