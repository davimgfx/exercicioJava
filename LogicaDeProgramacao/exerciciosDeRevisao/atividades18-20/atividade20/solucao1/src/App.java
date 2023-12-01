import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da linha da sua matriz: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o tamanho da coluna da sua matriz: ");
        int colunas = sc.nextInt();
        int[][] matriz = new int[linhas][colunas];

        int iniciador = 1;
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = iniciador;
                iniciador++;
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
