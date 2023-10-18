package aula04;

public class ContaBanco {
	public int numCont;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	
	public void estadoAtual() {
		System.out.println("Numero da Conta: " + this.getNumCont());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if ( t == "CP") {
			this.setSaldo(150);
		} else {
			System.out.println("Valores possiveis CC ou CP");
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro!");
		} else if ( this.getSaldo() < 0) {
			System.out.println("Conta em débito!");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada!!!");
		}
	}
	
	public void depositar(double dinheiro) {
		if( this.getStatus()) {
			setSaldo(this.getSaldo() + dinheiro);
		} else {
			System.out.println("Impossivel depositar!");
		}
		
	}
	
	public void sacar(double dinheiro) {
		if(this.getStatus()) {
			if(this.getSaldo() >= dinheiro) {
				this.setSaldo(this.getSaldo() - dinheiro);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível sacar!");
		}
	}
	
	public void pagarMensal() {
		int mensalidade;
		if(this.getTipo() == "CC") {
			mensalidade = 12;
		} else if (this.getTipo() == "CP") {
			mensalidade = 20;
		}
		
		if(this.getStatus()) {
			if(this.getSaldo() > mensalidade) {
				this.setSaldo(this.getSaldo() - mensalidade);
			} else {
				System.out.println("Impossivel paga, conta sem dinheiro!");
			}
		} else {
			System.out.println("Conta fechada!");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumCont() {
		return numCont;
	}

	public void setNumCont(int numCont) {
		this.numCont = numCont;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}

	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
