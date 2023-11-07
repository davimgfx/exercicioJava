package aula12;

public class Reptil extends Animal{
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Rastejar");
	}

	@Override
	public void alimentar() {
		System.out.println("Comer vegetais");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("SOM DE RÉPTIL BUUUUUUUUUUUUUU");
	}
	
}
