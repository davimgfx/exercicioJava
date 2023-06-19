import java.util.Random;

public class App{
    public static void main(String[] args) {
      int[] array = preencherArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
      System.out.println("");
      System.out.println("");
      bubbleSort(array);
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
    }
    
    public static int[] preencherArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(50) + 1;
            array[i] = numero;
        }
        
        return array;
    }
  
 public static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adjacentes
                if (array[j] > array[j + 1]) {
                    // Troca os elementos de posição
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

