import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nivel, horasTrabalhadas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nível (1, 2 ou 3) e as horas trabalhadas: ");
        nivel = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        calcularPrecoTotal(nivel, horasTrabalhadas);
    }

    public static void calcularPrecoTotal(int nivel, int horasTrabalhadas) {
        final int[] VALORES_POR_NIVEL = { 0, 12, 17, 25 }; // Índice 0 é reservado para nível inválido

        if (nivel >= 1 && nivel <= 3) {
            int precoTotal = VALORES_POR_NIVEL[nivel] * horasTrabalhadas;
            System.out.println("Preço total: " + precoTotal);
        } else {
            System.out.println("Nível não encontrado");
        }
    }
}
