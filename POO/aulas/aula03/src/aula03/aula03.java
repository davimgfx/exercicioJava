package aula03;

public class aula03 {
	public static void main(String[] args) {
		// Exemplo 1
		Caneta canetaAzul = new Caneta();
		
		// Como modelo é publico pode fazer com set ou com o objeto
		
		//canetaAzul.modelo("BIC")
		//canetaAzul.setModelo("BIC");
		
		// Já ponta não é possivel
		//canetaAzul.setPonta(0.5f);
		
		//canetaAzul.status();
		
		//System.out.println("Tenho uma caneta azul modelo: "+canetaAzul.getModelo());
		//System.out.println("Tenho uma caneta azul modelo: "+canetaAzul.modelo);
		
		//System.out.println("Tenho uma caneta azul modelo: "+canetaAzul.getPonta());
		//System.out.println("Tenho uma caneta azul modelo: "+canetaAzul.ponta);
		
		//Exemplo 2
		//canetaAzul.status();
		
		//Exemplo 3
		Caneta01 canetaVermelha = new Caneta01("BIC", "Amarela", 0.4f);
		canetaVermelha.status();
	}
}
