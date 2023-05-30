import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadora(sc);
    }

    public static void calculadora(Scanner sc) {
        int n1, n2, opcao = 0;
        System.out.println("Digite dois valores: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        while (opcao != 6) {
            System.out.println("Escolha 1 - Somar, 2 - Subtrair, 3 - Multiplicação, 4 - Divisão, 5 - Trocar Valores, 6 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + (n1+n2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + (n1-n2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + (n1*n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        System.out.println("Resultado da divisão: " + (n1/n2));
                    }
                    break;
                case 5:
                    int temp = n1;
                    n1 = n2;
                    n2 = temp;
                    System.out.println("Valores trocados.");
                    break;
                case 6:
                    System.out.println("Encerrando a calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
    }
}
