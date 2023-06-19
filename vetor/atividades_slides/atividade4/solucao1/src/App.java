
public class App {
    public static void main(String[] args) {
      int[] fibo = preencherFibonacci(2);
      for (int i = 0; i <  fibo.length; i++) {
        System.out.println(fibo[i]);
      }
    }
    
    public static int[] preencherFibonacci(int n) {
        int[] array = new int[n];
        int a=1,b=1, c=a+b, i=1;
        array[0] = 1;
        while(i < n){
          c = a+b;
          a = b;
          b = c;
          array[i] = a;
          i++;
        }
    return array;
    }
}