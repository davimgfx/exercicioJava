package Estoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Acessorio extends Peca implements Item {
    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a quantidade vendida: ");
            int quantidadeVendida = scanner.nextInt();
       
            if (quantidadeVendida > 0 && quantidadeVendida <= getQuantidade()) {
                setQuantidade(getQuantidade() - quantidadeVendida);
                System.out.println("Venda realizada com sucesso. Estoque atual: " + getQuantidade());
            } else {
                System.out.println("Quantidade inválida ou insuficiente em estoque.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Certifique-se de inserir um número inteiro entre 0 a 5.");
            
        }
    }
}
