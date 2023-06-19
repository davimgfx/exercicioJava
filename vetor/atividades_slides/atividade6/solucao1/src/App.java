import java.util.Random;

public class Main {
    public static void main(String[] args) {
      double[] mediasFinais = {9.5, 9.5, 9.5, 9.5, 9.5};
      int numDeAlunos = 5;
      double media = mediaDaTurma(mediasFinais, numDeAlunos);
      System.out.println("A media da turma foi "+media);
    }
    
    public static double mediaDaTurma(double[] v, int n) {
        double soma = 0;
        for(int i = 0; i < v.length; i++){
          soma += v[i];
        }
        return soma/n;
    }

}