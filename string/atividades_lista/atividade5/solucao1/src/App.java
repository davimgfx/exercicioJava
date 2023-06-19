public class App { public static void main(String[] args) { imprimeAoContrario("oi vida"); }

public static void imprimeAoContrario(String p) {
  for(int i = p.length() - 1; i >= 0; i--){
    System.out.print(p.charAt(i));
  }
}
}