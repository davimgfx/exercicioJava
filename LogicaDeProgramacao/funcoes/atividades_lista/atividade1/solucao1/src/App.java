import java.util.Scanner;
public class App {

  public static void main(String[] args) {
		int n, soma=0, cont=0, p=2;
    Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(cont!=n) {
			if(acharPrimo(p)) {
				soma += p; 
				cont++;
			}
			p++;
		}
		System.out.println(soma);
	}

	public static boolean acharPrimo(int n){
    int count = 0;
    int i = 1;
    while(i <= n){
      if(n % i == 0){
        count++;  
      }
      i++;
    }
    if(count == 2){
       return true;
    } else{
      return false;
    }
  }
}
