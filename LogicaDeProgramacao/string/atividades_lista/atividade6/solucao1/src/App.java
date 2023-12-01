public class App { public static void main(String[] args) { String novaPalavra = substituaPalavras("oi vida linda", 'a', 'b'); System.out.println(novaPalavra); }

public static String substituaPalavras(String frase, char letra1, char letra2) {
    return frase.replace(letra1, letra2);
}
}