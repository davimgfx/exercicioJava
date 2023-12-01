import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        int[] idades = new int[3];
        preencherVetores(nomes, idades);
          for(int i = 0; i < 3; i++){
          System.out.println("Nome: "+nomes[i]+" Idade: "+idades[i]);
       }
        calcularMedia(nomes, idades);
    }
    
    public static void preencherVetores(String[] v, int[] n) {
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i < 3; i++){
          System.out.println("Digite seu nome: ");
          v[i] = sc.next();
          System.out.println("Digite sua idade: ");
         n[i] = sc.nextInt();
       }
    }

  public static void calcularMedia(String[] v, int[] n){
      double soma = 0, media;
      for(int i = 0; i < 3; i++){
        soma += n[i];
       }
      media = soma/3;
    System.out.println("A media é "+media);
    for(int i = 0; i < 3; i++){
        if(n[i] >= media){
           System.out.println("Possui idade acima da media "+v[i]);
        }
       }
  }
  
}