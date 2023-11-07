package aula11;

public class Aluno extends Pessoa{
	private String matricula;
	private String curso;
	
	// public final void pagarMensalidade() {
	public void pagarMensalidade() {
		System.out.println("Paguei!");
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	 public void imprimirInformacoes() {
	        System.out.println("Nome: " + getNome());
	        System.out.println("Idade: " + getIdade());
	        System.out.println("Sexo: " + getSexo());
	        System.out.println("Matrícula: " + getMatricula());
	        System.out.println("Curso: " + getCurso());
	    }
}
