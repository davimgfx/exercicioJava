public class App { public static void main(String[] args) { primeiraLetraA("Arara"); }

public static void primeiraLetraA(String p) {
  p = p.toLowerCase();
   if(p.charAt(0) == 'a'){
    System.out.println(p);
   } else {
    System.out.println("Não começa com letra!");
   }
}
}