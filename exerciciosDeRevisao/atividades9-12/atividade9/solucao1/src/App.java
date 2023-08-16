import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Insira o valor de n: (n > 0) ");
        n = sc.nextInt();
        calcularValorDeSA(n);
        calcularValorDeSB(n);
        calcularValorDeSC(n);
    }

    public static void calcularValorDeSA(int n) {
       double somaFinal = 1.0;
       for(int i = 1; i < n; i++){
        somaFinal += 1.0 /n;
       }
       System.out.println(somaFinal);
}
    public static void calcularValorDeSB(int n) {
        double somaFinal = 0.0;
        for (int i = 1; i <= n; i++) {
        somaFinal += (i) / (double) (n - i + 1);
        }
        System.out.println(somaFinal);
    }
       public static void calcularValorDeSC(int n) {
    double somaFinal = 1.0;
    for (int i = 2; i <= n; i++) {
        if (i % 2 == 0) {
            somaFinal -= 1.0 / i;
        } else {
            somaFinal += 1.0 / i;
        }
    }
    System.out.println(somaFinal);
}
}