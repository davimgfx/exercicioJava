package vetor;

public class Main {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.getTamanho());
	}
}
