import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da sua matriz: ");
        int tamanho = sc.nextInt();
        int[][] matriz = new int[tamanho][tamanho];

        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int iniciador = 1;
         for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                matriz[i][j] = iniciador;
                iniciador++;
            }
        }

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        sc.close();
    }
}
