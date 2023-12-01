import java.util.Scanner;

public class Main {
    // Declare these variables as class fields to make them accessible in the methods.
    static char nomeDoCliente;
    static double saldoInicialDaConta;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Insira o seu nome: ");
        nomeDoCliente = sc.next().charAt(0); // Read the first character of the input.

        System.out.println("Insira o saldo da sua conta: ");
        saldoInicialDaConta = sc.nextDouble();

        do {
            System.out.println("Digite a operação: 1 - Depósito 2 - Retirada 3 - Sair ");
            n = sc.nextInt();
            operacaoDaConta(n);
        } while (n != 3);
      
        sc.close(); // Close the scanner at the end of the program.
    }

    public static void operacaoDaConta(int n) {
        double valorAdicionar, valorRemover;
        Scanner sc = new Scanner(System.in);
        
        if (n == 1) {
            System.out.println("Insira o valor a adicionar: ");
            valorAdicionar = sc.nextDouble();
            saldoInicialDaConta += valorAdicionar;
            System.out.println(saldoInicialDaConta);
        } 
        else if (n == 2) {
            System.out.println("Insira o valor a sacar: ");
            valorRemover = sc.nextDouble();
            saldoInicialDaConta -= valorRemover; // Use valorRemover instead of valorAdicionar.
            System.out.println(saldoInicialDaConta);
        } else if (n == 3) {
             System.out.println("Saindo...");
             if(saldoInicialDaConta > 0){
                 System.out.println("CONTA PREFERENCIAL");
             } else if (saldoInicialDaConta < 0 ){
                 System.out.println("CONTA ESTOURADA");
             } else {
                 System.out.println("CONTA ZERADA");
             }
        } else {
             System.out.println("Operação não encontrada, tente de novo");
        }
    }
}
