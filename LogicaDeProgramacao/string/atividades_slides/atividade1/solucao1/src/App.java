public class App {

public static void main(String[] args) {
    palavra("Maroto");
}

public static void palavra(String p) {
  for(int i = 0; i < p.length() ; i++){
     System.out.println(p.charAt(i));
  }
}
}