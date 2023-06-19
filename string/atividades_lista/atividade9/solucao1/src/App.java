public class App {  public static void main(String[] args) { imprimePiramide("oi vida"); }

public static void imprimePiramide(String p) {
  for(int i = 0; i < p.length(); i++){
    for(int j = 0; j <= i; j++){
      System.out.print(p.charAt(j));
    }
    System.out.println("");
  }
}