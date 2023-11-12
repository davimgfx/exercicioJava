package aula14;

public class Gafanhoto extends Pessoa{
	private int login;
	private boolean estaAssistindo;
	
	public Gafanhoto(String nome, int idade, String sexo, int login, boolean estaAssistindo) {
	    super(nome, idade, sexo);
	    this.login = login;
	    this.setEstaAssistindo(estaAssistindo);
	}


	public void viuMaisUm() {
		
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}


	public boolean getEstaAssistindo() {
		return estaAssistindo;
	}


	public void setEstaAssistindo(boolean estaAssistindo) {
		this.estaAssistindo = estaAssistindo;
	}


	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", estaAssistindo=" + estaAssistindo + ", nome=" + nome + ", idade="
				+ idade + ", sexo=" + sexo + ", expericiencia=" + expericiencia + "]";
	}
	
	
	
	
	
}
