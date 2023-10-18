package ProjetoCorrida;

import java.util.Random;

class Veiculo {
    private int velocidade;
    private int distancia;
    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
        this.velocidade = 0;
        this.distancia = 0;
    }

    public void mover() {
        Random random = new Random();
        this.velocidade = random.nextInt(3) + 1; 
        this.distancia += this.velocidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getNome() {
        return nome;
    }
}