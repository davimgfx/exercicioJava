public class App {

	public static void main(String[] args) {
		System.out.println(Fibonacci(2));
	}

	public static int Fibonacci(int n) {
		int a=1,b=1, c=a+b, i=2;
		if (n == 1 || n == 2) return 1;
    while(i < n){
      c = a+b;
      a = b;
      b = c; 
      i++;
    }
    return c;
  }
}