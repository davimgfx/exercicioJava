public class App { public static void main(String[] args) { contaLetra("00101101a11a", 'a'); }

public static void contaLetra(String p, char letra) {
  int count = 0;
  for(int i = 0; i < p.length(); i++){
    if(p.charAt(i) == letra){
    count++;
   }
  }
  System.out.println(count);
}
}