package Exemplos;

public class Exemplo2 {
    int[] v2 = {5, 4, 1, 3, 2};
    int tam = v2.length;  // Corrigido para v2.length
    int trocas, chamadas = 0;

    public void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public void bubbleSort(int[] v, int n) {
        chamadas++;
        if (n < 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (v[i] > v[i + 1]) {
                swap(v, i, i + 1);
                System.out.println("Index atual: " + i + " Index posterior: " + (i + 1));
                System.out.println("Troca: " + v[i] + " Por: " + v[i + 1]);
                trocas++;
            }
        }
        System.out.println("Chama a função recursivamente");

        bubbleSort(v, n - 1);
    }

    public static void main(String[] args) {
        Exemplo2 exemplo = new Exemplo2();

        exemplo.bubbleSort(exemplo.v2, exemplo.tam);
        for (int i = 0; i < exemplo.tam; i++) {
            System.out.print(exemplo.v2[i] + " ");
        }
        System.out.println("\nA função foi chamada: " + exemplo.chamadas + " e teve: " + exemplo.trocas + " trocas");
    }
}
