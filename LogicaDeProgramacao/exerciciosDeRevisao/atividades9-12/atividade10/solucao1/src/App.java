import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean fibonumber;

        System.out.println("Insira o valor de n: (n > 0) ");
        n = sc.nextInt();
        fibonumber = calcularFibonacci(n);
    
        System.out.println(fibonumber);
    }

    public static boolean calcularFibonacci(int n) {
        if (n == 1 || n == 2) {
            return true;
        }

        int numeroAnterior = 1;
        int numeroAtual = 1;

        while (numeroAtual < n) {
            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;

            if (numeroAtual == n) {
                return true;
            }
        }

        return false;
    }
}
