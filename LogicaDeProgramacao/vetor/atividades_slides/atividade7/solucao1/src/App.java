import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] mediasFinais = {9.5, 9.5, 9.5, 7.5, 2.5};
        int numDeAlunos = 5;
        double media = mediaDaTurma(mediasFinais, numDeAlunos);
        int alunosQuePassaram = acimadamedia(mediasFinais, media);
        System.out.println("A média da turma foi " + media);
        System.out.println("Os alunos que passaram foram " + alunosQuePassaram);
    }
    
    public static double mediaDaTurma(double[] v, int n) {
        double soma = 0;
        for(int i = 0; i < v.length; i++){
          soma += v[i];
        }
        return soma / n;
    }
  
     public static int acimadamedia(double[] arrayMedias, double m) {
        int contador = 0;
        for(int i = 0; i < arrayMedias.length; i++){
          if(arrayMedias[i] >= m){
            contador++;
          }
        }
        return contador;
    }
}
