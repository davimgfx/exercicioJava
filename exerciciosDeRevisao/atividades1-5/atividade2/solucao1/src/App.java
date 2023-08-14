import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int horas, minutos, segundos;
        Scanner sc=new Scanner(System.in);	
		System.out.println("Informe a hora local");
        horas=sc.nextInt();
        minutos=sc.nextInt();
        segundos=sc.nextInt();
        horaDoDia(horas, minutos, segundos);
    }
    public static void horaDoDia(int h, int m, int s){
        int segundosTotal = s + m*60 + h*3600;
        System.out.println("Os segundos total é "+segundosTotal);
    }
}