import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra:");
        palavra = sc.nextLine();
        
        for(int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra[i])
        }
    }

    
}
