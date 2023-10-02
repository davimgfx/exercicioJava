package aula07;

public class lutador {
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;
	public lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura,
			float peso) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.altura = altura;
		setPeso(peso);
	}
	
	public void apresentar() {
		System.out.println("Lutador: "+ getNome());
		System.out.println("Origem: "+ getNacionalidade());
		System.out.println("Idade: "+getIdade()+" anos");
		System.out.println("Altura: "+getAltura()+" metros");
		System.out.println("Pesando: "+getPeso()+" kg");
		System.out.println("Ganhou: "+getVitorias()+" partidas");
		System.out.println("Perdeu: "+getDerrotas()+" partidas");
		System.out.println("Empatou: "+getEmpates()+" partidas");
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCategoria() {
		if (getPeso() < 52.2) {
			this.categoria = "Invalido";
		} else if (getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (getPeso() <= 83.9 ) {
			this.categoria = "Médio";		
		} else if ( getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	
	public String getCategoria() {
		return categoria;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}


	
}
