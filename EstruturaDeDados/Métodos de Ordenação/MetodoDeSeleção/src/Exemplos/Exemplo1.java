package Exemplos;

public class Exemplo1 {
	public static void main(String[] args) {
		int[] array = {64, 25, 12, 22, 11};

        System.out.println("Array original:");
        metodoDeSelecao(array);

        // Chama o método de ordenação por seleção
        metodoDeSelecao(array);

        System.out.println("\nArray ordenado:");
        metodoDeSelecao(array);
	}
	public static void metodoDeSelecao(int v[]) {
		// Simulação de como ocorre
		// Vai encontrar como menor o numero 11
		// Cria uma variavel auxiliadora para ajudar no processo
		// indiceMenor = 4
		// int temp = v[4]
		// v[4] = v[0]
		// v[0] = v[4]
		for(int i = 0; i < v.length; i++) {
			int indiceMenor = i;
			for( int j = i + 1; j < v.length; j++) {
				if(v[j] < v[indiceMenor]) {
					indiceMenor = j;
					if(i == 0) {
						System.out.println("Indice menor: "+indiceMenor);
					}
				
				}
			}
			
			int temp = v[indiceMenor];
			v[indiceMenor] = v[i];
			v[i] = temp;
		
		}
	}
}
