package aula09;

public class Main {
   public static void main(String[] args) {
	Pessoa[] p = new Pessoa[2];
	Livro[] l = new Livro[3];
	
	p[0] = new Pessoa("Pedro", 22, "M");
	p[1] = new Pessoa("Maria", 24, "F");
	
	Pessoa pessoaParaLivro = p[0];
	
	l[0] = new Livro("Aprendendo Java", "Jose", 300, pessoaParaLivro);
	System.out.println(l[0].detalhes());
}
}
