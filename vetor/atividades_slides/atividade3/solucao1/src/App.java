import java.util.Scanner;
public class App{
    public static void main(String[] args) {
      int[] array = preencherArray();
      for (int i = array.length - 1; i >= 0; i--) {
        System.out.println(array[i]);
      }
    }
    
    public static int[] preencherArray() {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
      
        for (int i = 0; i < array.length; i++) {
         System.out.println("Digite um número ");
          int numero = sc.nextInt();
            array[i] = numero;
        }
        System.out.println("");
        return array;
    }

}

