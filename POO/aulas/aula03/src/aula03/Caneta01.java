package aula03;

public class Caneta01 {
	public String modelo;
	private float ponta;
	private String cor;
	public boolean tampada;
	public Caneta01(String m, String c, float p) {
		setModelo(m);
		setCor(c);
		setPonta(p);
		tampar();
	}
	public void setModelo(String m){
		this.modelo = m;
	}
	public void setCor(String c) {
		this.cor = c;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = true;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void status(){
		System.out.println("A caneta do modelo: "+this.getModelo());
		System.out.println("Tem a ponta: "+this.getPonta());
		System.out.println("A cor: "+this.cor);
		System.out.println("Esta tampada? "+this.tampada);
	}
	
}
