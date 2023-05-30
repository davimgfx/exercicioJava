import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        int n = 5; // Defina o valor de "n" desejado
        
        double soma = valordesa(n);
        
        DecimalFormat df = new DecimalFormat("#.######"); // Define o padrão de formatação com 6 casas decimais
        
        String resultadoFormatado = df.format(soma);
        
        System.out.println("A soma da série harmônica até " + n + " é: " + resultadoFormatado);
    }

    public static double valordesa(int n1) {
        double soma = 1;
        int i = 1;
        while (i < n1) {
            soma += 1.0 / i;
            i++;
        }
        return soma;
    }
}