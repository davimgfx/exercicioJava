public class App { public static void main(String[] args) { System.out.println(troca0por1("00101101a11a")); }

public static String troca0por1(String p) {
  return p.replace('0', '1');
}
}