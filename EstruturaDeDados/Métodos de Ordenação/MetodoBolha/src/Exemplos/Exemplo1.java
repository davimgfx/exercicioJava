package Exemplos;

public class Exemplo1 {
    int[] v = {10, 5, 2, 8, 25, 15};
    int[] v2 = {20, 19, 18, 17, 16, 11};
    int tam = v.length;
    int vezesQueAfuncaoEChamada = 0;

    public void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public void bubbleSort(int[] v, int n) {
    	vezesQueAfuncaoEChamada++; 
        if (n < 1) return;
        
        for (int i = 0; i < n - 1; i++) {
            if (v[i] > v[i + 1]) {
                swap(v, i, i + 1);
                System.out.println("Index atual: "+i+" Index posterior: "+(i+1));
                System.out.println("Troca: "+v[i]+" Por: "+v[i + 1]);
            }
        }
        System.out.println("Chama a função recursivamente");
        
        bubbleSort(v, n - 1);
    }

    public static void main(String[] args) {
        Exemplo1 exemplo = new Exemplo1();
        
       // exemplo.bubbleSort(exemplo.v, exemplo.tam);
       // for (int i = 0; i < exemplo.tam; i++) {
       //     System.out.print(exemplo.v[i] + " ");
       // }
       // System.out.println("\nA função foi chamada: "+exemplo.vezesQueAfuncaoEChamada);
        
   
        exemplo.bubbleSort(exemplo.v2, exemplo.tam);
        for (int i = 0; i < exemplo.tam; i++) {
            System.out.print(exemplo.v2[i] + " ");
        }
        System.out.println("\nA função foi chamada: "+exemplo.vezesQueAfuncaoEChamada);
    }
}
