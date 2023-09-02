package aula2;

public class aula2 {
	public static void main(String[] arg) {
		Caneta c1 = new Caneta();
		// É possivel pois é publico
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		
		// Não é possivel mecher na ponta assim, pois ela é privada
		// c1.ponta = 0.3f;
		
		// É possivel alterar sendo protegida
		c1.carga = 80;
		c1.tampada = true;
		c1.rabiscar();
	}
}
