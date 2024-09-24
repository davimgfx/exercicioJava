public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10000];
        preencherVetor(vetor);
        //acharNumeroBuscaLiner(vetor, 5000);
        acharNumeroBuscaBinaria(vetor, 2500);
    }

    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1; // Preenchendo com números de 1 a 10.000
        }
    }

    public static int acharNumeroBuscaLiner(int[] vetor, int numero){
        System.out.println("");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(i + 1);
            if(vetor[i] == numero){
                return i;
            }
        }
        return -1;
    }

    public static int acharNumeroBuscaBinaria(int[] vetor, int numero){
        int inicio = 0;
        int fim = vetor.length - 1;
        int count = 0;

        while(inicio <= fim){
            count++;
            int meio = (inicio + fim) / 2;

            if(vetor[meio] == numero){
                System.out.println("Numero do contador: "+ count);
                return meio;
            } else if(vetor[meio] < numero){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}