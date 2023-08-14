import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int temp;
        Scanner sc=new Scanner(System.in);	
		System.out.println("Digite a temperatura em C para converter para F");
        temp=sc.nextInt();
        System.out.println(CparaF(temp));
	}
    public static int CparaF(int c){
    return ((9*c) + 160)/5;
    }
}