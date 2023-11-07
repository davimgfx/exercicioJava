package aula12;

public class Peixe extends Animal{
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo plactons");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("SOM DE PEIXE BLUCBLUCLBLUC");
	}
	
	public void soltarBolha() {
		System.out.println("BOLHASSSSSSSS AHAHAHHAHAAAHAHHA");
	}
}
