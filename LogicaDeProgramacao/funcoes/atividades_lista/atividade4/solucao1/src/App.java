import java.util.Scanner;

public class App {

  public static void main(String[] args) {
     String opcao;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Voce quer ver a tabuada?  ");
      opcao = sc.nextLine();
      if(opcao.equals("n")){
        break;
      }
      if (opcao.equals("s")) {
        System.out.println("Digite o numero");
        int n = sc.nextInt();
        tabuada(n);
      }
    }
  }

  public static void tabuada(int n1) {
    for(int i = 0; i < 11; i++){
      System.out.println(n1+" x "+i+" = "+(n1*i));
    }
  }
}