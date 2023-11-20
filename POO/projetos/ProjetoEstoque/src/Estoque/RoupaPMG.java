package Estoque;

import java.util.Scanner;

public class RoupaPMG implements Item{
	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	
	
	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
		int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public void venda() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do item (P, M ou G): ");
        String tamanho = scanner.next().toUpperCase();

        switch (tamanho) {
            case "P":
                if (getQuantidadeP() > 0) {
                    setQuantidadeP(getQuantidadeP() - 1);
                    System.out.println("Venda realizada com sucesso. Estoque atual (P): " + getQuantidadeP());
                } else {
                    System.out.println("Estoque (P) insuficiente para realizar a venda.");
                }
                break;
            case "M":
                if (getQuantidadeM() > 0) {
                    setQuantidadeM(getQuantidadeM() - 1);
                    System.out.println("Venda realizada com sucesso. Estoque atual (M): " + getQuantidadeM());
                } else {
                    System.out.println("Estoque (M) insuficiente para realizar a venda.");
                }
                break;
            case "G":
                if (getQuantidadeG() > 0) {
                    setQuantidadeG(getQuantidadeG() - 1);
                    System.out.println("Venda realizada com sucesso. Estoque atual (G): " + getQuantidadeG());
                } else {
                    System.out.println("Estoque (G) insuficiente para realizar a venda.");
                }
                break;
            default:
                System.out.println("Tamanho inválido.");
                break;
        }

 
    }
    
	
	  public void reposicaoEstoque() {
	        if (getQuantidadeP() < getEstoqueMinimo()) {
	        	setQuantidadeP(getEstoqueMaximo());
	            System.out.println("Estoque (P) reposto para o máximo: " + getQuantidadeP());
	        }

	        if (getQuantidadeM() < getEstoqueMinimo()) {
	            setQuantidadeM(getEstoqueMaximo());
	            System.out.println("Estoque (M) reposto para o máximo: " + getQuantidadeM());
	        }

	        if (getQuantidadeG() < getEstoqueMinimo()) {
	        	setQuantidadeG(getEstoqueMaximo());
	            System.out.println("Estoque (G) reposto para o máximo: " + getQuantidadeG());
	        }
	    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeP() {
		return quantidadeP;
	}

	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}

	public int getQuantidadeM() {
		return quantidadeM;
	}

	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}

	public int getQuantidadeG() {
		return quantidadeG;
	}

	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	@Override
	public int getQuantidade() {
		System.out.print("Quantidade P: "+getQuantidadeP() + ", ");
		System.out.print("Quantidade M: "+getQuantidadeM() + ", ");
		System.out.print("Quantidade G: "+getQuantidadeG()+ ", ");
		return getQuantidadeP() + getQuantidadeM() + getQuantidadeG();
	}

	  
}
