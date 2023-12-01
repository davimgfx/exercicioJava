import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        System.out.println("Digite a quantidade de números primos que você deseja:");
        quantidade = sc.nextInt();
        
        int count = 0; 
        int numero = 2; 
        
        while (count < quantidade) {
            if (ePrimo(numero)) {
                System.out.println(numero);
                count++;
            }
            numero++;
        }
    }

    public static boolean ePrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        int divisor = 2;
        while (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }
        
        return true;
    }
}
