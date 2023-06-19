public class App {

public static void main(String[] args) {
    palavra("Ronaldo");
}

public static void palavra(String p) {
  for(int i = 0; i < p.length() ; i++){
    for(int j=0; j<=i; j++) {
			System.out.print(p.charAt(j));
		}
		System.out.println();;
  }
}
}