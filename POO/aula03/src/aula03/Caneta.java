package aula03;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	public boolean tampada;
	
	public Caneta() { // Método Construtor
		this.tampar();
		this.cor = "Azul";
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	
	public void setModelo(String m){
		this.modelo = m;
	}
	
	
	public float getPonta(){
		return this.ponta;

	}
	
	
	public void setPonta(float p){
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	
	public void status(){
		System.out.println("A caneta do modelo: "+this.getModelo());
		System.out.println("Tem a ponta: "+this.getPonta());
		System.out.println("A cor: "+this.cor);
		System.out.println("Esta tampada? "+this.tampada);
	}
	
	

}
