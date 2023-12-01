import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 50;
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        int maiorNumero = vetor[0];
        int posicaoMaior = 0;
        
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
                posicaoMaior = i;
            }
        }
        
        System.out.println("O maior número está na posição: " + posicaoMaior);
        
        scanner.close();
    }
}
