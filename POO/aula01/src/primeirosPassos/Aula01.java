package primeirosPassos;


public class Aula01 {
	public static void main(String[] args) {
		Caneta canetaAzul = new Caneta();
		// Atribuindo caracteristicas
		canetaAzul.cor = "Azul";
		canetaAzul.ponta = 0.5f;
		canetaAzul.modelo = "Bic";
		canetaAzul.carga = 100;
		canetaAzul.tampada = false;
		// Chamando os métodos
		canetaAzul.status();
		canetaAzul.tampar();
		canetaAzul.status();
		canetaAzul.destampar();
		canetaAzul.rabiscar();
		canetaAzul.status();
	}
}
