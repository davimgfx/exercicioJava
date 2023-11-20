package Estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item[] itens = new Item[5];

        // Inicializando o vetor com objetos variados
        itens[0] = new Acessorio("Cinto", 15, 10, 10);
        itens[1] = new RoupaTamanhoUnico("Saia", 25, 5, 20);
        itens[2] = new RoupaPMG("Camisa", 30, 10, 15, 10, 20);
        itens[3] = new Acessorio("Pulseira", 8, 5, 12);
        itens[4] = new RoupaPMG("Saída de praia", 40, 8, 12, 15, 6);

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Mostra o menu
            System.out.println("Escolha uma opção:");
            for (int i = 0; i < itens.length; i++) {
                System.out.println(i + " - " + itens[i].getDescricao());
            }
            System.out.println(itens.length + " - Sair do sistema");

            // Obtém a opção do usuário
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            // Verifica se a opção é válida
            if (opcao >= 0 && opcao < itens.length) {
                // Chama os métodos comuns da interface
                itens[opcao].venda();
                itens[opcao].reposicaoEstoque();
            } else if (opcao != itens.length) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != itens.length);

        System.out.println("\nEstoque Final:");
        for (Item item : itens) {
            System.out.println(item.getDescricao() + ": " + item.getQuantidade());
        }
    }
}
