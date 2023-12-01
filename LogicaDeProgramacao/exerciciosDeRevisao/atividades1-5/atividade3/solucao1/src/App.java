import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double nota1, nota2, nota3, peso1, peso2, peso3;
        Scanner sc=new Scanner(System.in);	
		System.out.println("Informe suas tres notas e seus pesos");
        nota1=sc.nextDouble();
        peso1=sc.nextDouble();
        nota2=sc.nextDouble();
        peso2=sc.nextDouble();
        nota3=sc.nextDouble();
        peso3=sc.nextDouble();
        mediaFinal(nota1, nota2, nota3, peso1, peso2, peso3);
    }
    public static void mediaFinal(double n1, double n2, double n3, double p1, double p2, double p3){
        double media = (n1*p1 + n2*p2 + n3*p3)/(p1 + p2 + p3);
        System.out.println("A media final é "+media);
    }
}