public class App { public static void main(String[] args) { imprimePiramide("oi vida"); }

public static void imprimePiramide(String p) {
  for(int i = 0; i < p.length(); i++){
      System.out.println(p.charAt(i));
    }
}
}