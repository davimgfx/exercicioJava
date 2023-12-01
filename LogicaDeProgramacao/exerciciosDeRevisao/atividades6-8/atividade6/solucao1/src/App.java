import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int macas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas maças deseja comprar: ");
        macas = sc.nextInt();

        System.out.println(calcularPreçoTotal(macas));
    }

    public static double calcularPreçoTotal(int qnt) {
        if(qnt < 12){
            return 0.3*qnt;
        } else {
            return 0.25*qnt;
        }
    }
}
