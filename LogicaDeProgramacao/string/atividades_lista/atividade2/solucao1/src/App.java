public class App { public public static void main(String[] args) { conta1("0010110111"); }

public static void conta1(String p) {
  int count = 0;
  for(int i = 0; i < p.length(); i++){
    if(p.charAt(i) == '1'){
    count++;
   }
  }
  System.out.println(count);
}
}