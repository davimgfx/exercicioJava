import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int[] array = preencherArray();
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
      quantDeVezes(array, 3);
    }
    
    public static int[] preencherArray() {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(5) + 1;
            array[i] = numero;
        }
        
        return array;
    }
  public static void quantDeVezes(int[] v, int n){
     int contador = 0;
     for (int i = 0; i < v.length; i++) {
        if(v[i] == n){
          contador++;
        }
    }
    System.out.println("O numero "+n+" apareceu no vetor "+contador+" vezes");
  }
}