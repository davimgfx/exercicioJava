import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];
        int[] idade = new int[4];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o " + (i + 1) + "^ Nome:");
            nomes[i] = sc.nextLine();
            
            System.out.println("Digite a idade de " + nomes[i] + ":");
            idade[i] = Integer.parseInt(sc.nextLine()); 
        }
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idade[i]);
        }
        media(idade, nomes); 
    }

    public static void media(int[] idades, String[] nomes) {
        int soma = 0; 
        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }
        double media = soma / idades.length; 
        
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > media) {
                System.out.println("A pessoa " + nomes[i] + " tem idade " + idades[i] + " maior que a media: " + media);
            }
        }
    }
}
