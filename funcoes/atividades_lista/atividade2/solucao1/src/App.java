import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(mmc(a, b));

	}

	public static int mmc(int a, int b) {
		int minimoMultiplo=b;
		
		while((minimoMultiplo%a!=
0)||(minimoMultiplo%b!=0)) {
			minimoMultiplo++;
		}
		return minimoMultiplo;
	}