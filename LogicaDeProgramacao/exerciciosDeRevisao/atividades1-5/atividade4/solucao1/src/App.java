import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int horas, minutos, segundos, inicioAtividade, fimAtividade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o início da atividade");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        inicioAtividade = horaDoDia(horas, minutos, segundos);

        System.out.println("Informe o fim da atividade");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        fimAtividade = horaDoDia(horas, minutos, segundos);

        horaTotal(inicioAtividade, fimAtividade);
    }

    public static int horaDoDia(int h, int m, int s) {
        return (s + m * 60 + h * 3600);
    }

    public static void horaTotal(int inicio, int fim) {
        int hora, minutos, segundos;
        int horaTotal = fim - inicio; // Corrigido o cálculo da horaTotal

        if (horaTotal >= 3600) {
            hora = horaTotal / 3600;
            horaTotal %= 3600; // Calculando o restante dos segundos após subtrair as horas
        } else {
            hora = 0;
        }

        minutos = horaTotal / 60;
        segundos = horaTotal % 60;

        System.out.println("Tempo total da atividade: " + hora + "h " + minutos + "min " + segundos + "s");
    }
}
