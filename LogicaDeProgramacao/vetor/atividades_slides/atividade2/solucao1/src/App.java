import java.util.Random;

public class App {
    public static void main(String[] args) {
      int[] array1 = preencherArray();
      int[] array2 = preencherArray();
      int[] somadosarrays = somarArrays(array1, array2);
      for (int i = 0; i < array1.length; i++) {
        System.out.println(array1[i]);
        System.out.println(array2[i]);
        System.out.println("A soma dos arrays no index "+i+" é "+somadosarrays[i]);
        System.out.println();
      }
    }
    
      public static int[] preencherArray() {
        int[] array = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(21);
            array[i] = numero;
        }
        
        return array;
    }
  public static int[] somarArrays(int[] array1, int[] array2){
     int[] novoArray = new int[10];
     for (int i = 0; i < novoArray.length; i++) {
      novoArray[i] = array1[i] + array2[i];
    }
    return novoArray;
  }
}