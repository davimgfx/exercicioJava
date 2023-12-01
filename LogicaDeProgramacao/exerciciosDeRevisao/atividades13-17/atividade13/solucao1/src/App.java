import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero positivo");
        numero = sc.nextInt();
        if (ePrimo(numero)) {
            System.out.println("Primo");
        } else {
            System.out.println("Não é Primo");
        }
    }

    public static boolean ePrimo(int n) {
        int divisor = 2;
        int i = 2; 
        int contador = 0;
        
        while (i <= Math.sqrt(n)) { 
            if (n % i == 0) {
                contador++;
            }
            i++;
        }

        return contador == 0; 
    }
}
