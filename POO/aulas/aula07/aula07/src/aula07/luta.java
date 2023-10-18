package aula07;

import java.util.Random;

public class luta {
	private  lutador desafiado;
	private lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	public void marcarLuta(lutador l1, lutador l2) {
		if((l1 != l2) && (l1.getCategoria() == l2.getCategoria())) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("Luta marcada entre "+this.desafiado.getNome()+" e "+this.desafiante.getNome());
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Luta invalida");
		}
		
	}
	
	public void lutar() {
		int resultado;
		if(aprovado) {
			desafiado.apresentar();
			desafiante.apresentar();
			Random random = new Random();
			resultado = random.nextInt(3);
			if(resultado == 0){
				desafiado.empatarLuta();
				desafiante.empatarLuta();
			} else if (resultado == 1) {
				desafiado.ganharLuta();
				desafiante.perderLuta();
			} else if ( resultado == 2) {
				desafiado.perderLuta();
				desafiante.ganharLuta();
			}
		}
		
	}

	public lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(lutador desafiado) {
		this.desafiado = desafiado;
	}

	public lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	
	
}
