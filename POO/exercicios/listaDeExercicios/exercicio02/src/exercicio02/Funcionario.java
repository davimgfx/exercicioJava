package exercicio02;

public class Funcionario {
		public String nome;
		public String funcao;
		public double salario;
		
		public Funcionario(String nome, String funcao, double d) {
			super();
			this.nome = nome;
			this.funcao = funcao;
			this.salario = d;
		}
		
		public void ajusteSalario() {
			this.salario += this.salario*0.05;
		}
		
		public void status() {
			System.out.println(this.nome);
			System.out.println(this.funcao);
			System.out.println(this.salario);
		}
}
