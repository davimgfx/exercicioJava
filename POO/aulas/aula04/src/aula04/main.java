package aula04;

public class main {
	public static void main(String[] args) {
		ContaBanco p1= new ContaBanco();
		p1.setNumCont(1111);
		p1.setDono("Jubu");
		p1.estadoAtual();
		p1.abrirConta("CC");
		p1.estadoAtual();
		p1.depositar(300);
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumCont(2);
		p2.setDono("Creusa");
		p2.abrirConta("CP");
		p2.depositar(1300);
		p2.sacar(300);
		p2.estadoAtual();
	}
}
