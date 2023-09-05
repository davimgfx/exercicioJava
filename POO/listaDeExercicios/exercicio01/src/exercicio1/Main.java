package exercicio1;
import java.util.Scanner;

 public class Main {
        	public static void main(String[] args) {
        		Scanner scanner = new Scanner(System.in);
                
                System.out.print("Digite o primeiro termo da progressão: ");
                int primeiroTermo = scanner.nextInt();
                
                System.out.print("Digite a razão da progressão: ");
                int razao = scanner.nextInt();
                
                System.out.print("Digite a quantidade de termos a serem exibidos: ");
                int n = scanner.nextInt();
                
                ProgressaoAritmetica progressao = new ProgressaoAritmetica(primeiroTermo, razao);
                
                System.out.println("Os primeiros " + n + " termos da progressão aritmética são:");
                
                for (int i = 0; i < n; i++) {
                    int termo = progressao.proximoTermo();
                    System.out.print(termo + " ");
                }
                System.out.println("");
                System.out.println(progressao.getTermoAtual()); 
                
                scanner.close();
            }
        }

        System.out.print("Digite a razão da progressão: ");
        int razao = scanner.nextInt();
        
        System.out.print("Digite a quantidade de termos a serem exibidos: ");
        int n = scanner.nextInt();
        
        ProgressaoAritmetica progressao = new ProgressaoAritmetica(primeiroTermo, razao);
        
        System.out.println("Os primeiros " + n + " termos da progressão aritmética são:");
        
        for (int i = 0; i < n; i++) {
            int termo = progressao.proximoTermo();
            System.out.print(termo + " ");
        }
        System.out.println("");
        System.out.println(progressao.getTermoAtual()); 
        
        scanner.close();
    }
}
