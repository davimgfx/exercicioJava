package aula13;

public class Bode extends Animal{
	// Sobrecarga
	public void emitirSom() {
		System.out.println("Som de Cachorro auuuuuuuu");
	}
	public void emitirSom(int n) {
		System.out.println("Som de Cachorro auuuuuuuu "+n);
	}
	public void emitirSom(int n, String letra) {
		System.out.println("Som de Cachorro auuuuuuuu "+n+" "+letra);
	}
}
