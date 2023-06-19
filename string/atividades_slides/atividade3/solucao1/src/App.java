public class App {

public static void main(String[] args) {
   System.out.println(quantosa("Sacanagem"));
}

public static int quantosa(String p) {
    int count = 0;
    p = p.toLowerCase();
    for (int i = 0; i < p.length(); i++) {
        if (p.charAt(i) == 'a') {
            count++;
        }
    }
   return count;
}
}