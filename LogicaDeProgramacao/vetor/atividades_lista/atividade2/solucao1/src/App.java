import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = new String[6];
        preencherVetores(nomes);
        for (int i = 0; i < 6; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("");
        }
        eleicao(nomes);
    }

    public static void preencherVetores(String[] v) {
        v[0] = "Branco";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Digite seu nome: ");
            v[i] = sc.next();
        }
    }

    public static void eleicao(String[] nomes) {
        int opcao;
        int[] votos = new int[6];
        Scanner sc = new Scanner(System.in);
        do {
            for (int i = 0; i < 6; i++) {
                System.out.printf("Opção %d - %s | Votos: %d\n", i, nomes[i], votos[i]);
            }
            System.out.println("Deseja votar em qual candidato? (Digite o número da opção ou -1 para sair)");
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                votos[opcao]++;
            } else if (opcao != -1) {
                votos[0]++;
            }
        } while (opcao != -1);

        int maiorVotos = votos[1];
        for (int i = 1; i < 6; i++) {
            if (votos[i] > maiorVotos) {
                maiorVotos = votos[i];
            }
        }

        System.out.println("O vencedor foi:");
        for (int i = 1; i < 6; i++) {
            if (votos[i] == maiorVotos) {
                System.out.println(nomes[i]);
            }
        }
    }
}