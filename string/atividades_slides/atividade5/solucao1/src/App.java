public class App {

public static void main(String[] args) { String[] teste = removerPrimeiraUltimaPalavra("eu sou o Douglas"); for (int i = 0; i < teste.length; i++) { System.out.print(teste[i]+" "); } }

public static String[] removerPrimeiraUltimaPalavra(String frase) {
    String[] palavras = frase.split(" ");
    String[] novafrase = new String[palavras.length - 2];

    for (int i = 0; i < novafrase.length; i++) {
        novafrase[i] = palavras[i + 1];
    }

    return novafrase;
}
}