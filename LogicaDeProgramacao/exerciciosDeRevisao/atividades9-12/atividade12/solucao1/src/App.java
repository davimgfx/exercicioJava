import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[100];
        int indice = 0; // Inicializa o índice como 0
        int soma = 0;
        int maiornumero = Integer.MIN_VALUE;
        int menornumero = Integer.MAX_VALUE;
        int somapar = 0;
        int qntpar = 0;
        
        System.out.println("Digite números positivos (digite -1 para encerrar):");
        int numero = sc.nextInt();
        
        while (numero != -1 && indice < numeros.length) {
            if (numero > 0) {
                numeros[indice] = numero;
                indice++;
                soma += numero;
                if (numero > maiornumero) {
                    maiornumero = numero;
                }
                if (numero < menornumero) {
                    menornumero = numero;
                }
                if (numero % 2 == 0) {
                    somapar += numero;
                    qntpar++;
                }
            } else {
                System.out.println("Número inválido. Digite um número positivo ou -1 para encerrar:");
            }
            numero = sc.nextInt();
        }
        sc.close(); // Fecha o Scanner para evitar vazamento de recursos

        System.out.println("A soma foi: " + soma);
        System.out.println("A quantidade de números digitados foi: " + indice);
        System.out.println("A média foi: " + (soma / indice));
        System.out.println("O maior e menor números foram: " + maiornumero + " e " + menornumero);
        
        if (qntpar > 0) {
            System.out.println("A média dos números pares foi: " + (somapar / qntpar));
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }
    }
}
