package aula14;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int expericiencia;
	
	 public Pessoa(String nome, int idade, String sexo) {
	        super();
	        this.nome = nome;
	        this.idade = idade;
	        this.sexo = sexo;
	        this.expericiencia = 0;
	    }

	protected void ganharExp() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExpericiencia() {
		return expericiencia;
	}

	public void setExpericiencia(int expericiencia) {
		this.expericiencia = expericiencia;
	}
	
	
}
