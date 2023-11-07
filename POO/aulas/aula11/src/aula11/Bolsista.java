package aula11;

public class Bolsista extends Aluno{
	private float bolsa;
		
	public void renovarBolsa() {
		System.out.println("Renovando bolsa");
	}
	
	// Sobreposição
	@Override
	public void pagarMensalidade() {
		System.out.println("É bolsista");
	}
}
