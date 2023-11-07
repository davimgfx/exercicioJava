package aula11;

public class Main {
	 public static void main(String[] args) {
	// Da erro por conta que classe abstrata não pode ser iniciada
	// Pessoa p1 = new Pessoa();
	// Visitante uma herança pobre
	Visitante v1 = new Visitante();
	v1.setNome("Davi");
	v1.setIdade(19);
	v1.setSexo("M");
	
	// Aluno uma herança rica
	Aluno a1 = new Aluno();
	a1.setNome("Pedor");
	a1.setIdade(20);	
	a1.setSexo("M");
	a1.setMatricula("201931231");
	a1.setCurso("Eng de Software");
	a1.pagarMensalidade();
	a1.imprimirInformacoes();
	
	// Bolsista
	Bolsista b1 = new Bolsista();
	b1.setNome("Pedor");
	b1.setIdade(20);	
	b1.setSexo("M");
	b1.setMatricula("201931231");
	b1.setCurso("Eng de Software");
	b1.pagarMensalidade();
	
	}
}
