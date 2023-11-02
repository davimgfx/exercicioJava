package aula10;

public class Main {
	 public static void main(String[] args) {
			Pessoa p1 = new Pessoa();
			Aluno p2 = new Aluno();
			Professor p3 = new Professor();
			Funcionario p4 = new Funcionario();
			
			p1.setNome("Pessoa Maria");
			p2.setNome("Aluno João");
			p3.setNome("Professor Francisco");
			p4.setNome("Funcionário José");
			
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			System.out.println(p3.toString());
			System.out.println(p4.toString());
			
			p2.setIdade(14);
			System.out.println(p2.toString());
			p2.fazerAniversario();
			System.out.println(p2.toString());
			
	}
}
