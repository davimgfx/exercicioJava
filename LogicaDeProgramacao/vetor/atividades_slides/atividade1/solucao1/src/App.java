import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] array = preencherArray();
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
      System.out.println("O maior numero é "+ maiornumero(array));
    }
    
    public static int[] preencherArray() {
        int[] array = new int[5];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(21);
            array[i] = numero;
        }
        
        return array;
    }
  public static int maiornumero(int[] v){
     int maior = v[0];
     for (int i = 1; i < v.length; i++) {
        int proxnumero = v[i];
        if(proxnumero > maior){
          maior = proxnumero;
        }
    }
    return maior;
  }
}
