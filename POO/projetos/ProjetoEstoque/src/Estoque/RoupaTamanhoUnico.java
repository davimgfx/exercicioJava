package Estoque;

public class RoupaTamanhoUnico extends Peca implements Item{
	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void venda() {
		setQuantidade(getQuantidade() - 1);
		System.out.println("Venda realizada com sucesso. Estoque atual: " + getQuantidade());
	}
	
}
