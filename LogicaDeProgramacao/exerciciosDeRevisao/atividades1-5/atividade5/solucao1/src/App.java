import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);	
        int idade;
        System.out.println("Informe sua idade");
        idade = sc.nextInt();
        Categorias(idade);
    }

    public static void Categorias(int idade) {
        if ( idade <= 15){
            System.out.println("Sem permissão");
        } else if((idade > 15 && idade <= 17) || idade > 65){
            System.out.println("Facutativo");
        } else {
            System.out.println("Obrigatorio");
        }
    }
    
}
