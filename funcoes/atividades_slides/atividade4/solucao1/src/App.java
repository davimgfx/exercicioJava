public class Main {

  public static void main(String[] args) {
    triangulo(3, 3, 5);
  }
  
  public static void triangulo(int lado1, int lado2, int lado3){
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
