public class App {

  public static void main(String[] args) {
    System.out.println(eTriangulo(3, 3, 5));
    classificacao(3, 3,5);
  }
  
  public static boolean eTriangulo(int lado1, int lado2, int lado3){
      if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
        return true;
      }
      else{
        return false;
      }
  }

  public static void classificacao(int lado1, int lado2, int lado3){
      if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
        if(lado1 == lado2 && lado2 == lado3){
          System.out.println("É equilátero");
        } else if (lado1 != lado2 && lado2 !=  lado3 && lado3 != lado2){
          System.out.println("É isósceles");
        } else {
          System.out.println("É escaleno");
        }
      }
      else{
        System.out.println("Não é um triangulo");
      }
  }
}