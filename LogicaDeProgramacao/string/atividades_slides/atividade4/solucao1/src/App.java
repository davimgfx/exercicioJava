public class App {

public static void main(String[] args) {
  System.out.println(removerSubstring("removersub", "sub"));
}
public static String removerSubstring(String palavra, String substring){ return palavra.replace(substring, ""); } 
}