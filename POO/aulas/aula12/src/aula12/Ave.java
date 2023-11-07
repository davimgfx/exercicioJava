package aula12;

public class Ave extends Animal{
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo pedra");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("SOM DE AVE UIAUSDIAUDIASUDA");
	}
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}
}
