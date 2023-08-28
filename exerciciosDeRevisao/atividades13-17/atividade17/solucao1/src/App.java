import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idade = new int[20];
        
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
    }
}
