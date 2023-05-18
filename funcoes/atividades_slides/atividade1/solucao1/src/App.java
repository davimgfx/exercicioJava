import java.util.Scanner;

public class App {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = sc.nextInt();

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Nome: ");
            String nome = sc.next();
            double media = calcularMedia(sc);
            exibirResultado(nome, media);
            System.out.println();
        }
    }

    public static double calcularMedia(Scanner sc) {
        double somaNotas = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        return somaNotas / 4;
    }

    public static void exibirResultado(String nome, double media) {
        System.out.print("Resultado para " + nome + ": ");

        if (media >= 7.0) {
            System.out.println("Parabéns, você foi aprovado.");
        } else if (media >= 4.0 && media <= 6.9) {
            System.out.println("Apresente-se para a prova final.");
        } else {
            System.out.println("Infelizmente você não atingiu a média mínima.");
        }
    }
}
