# Repositório de Atividades de Java - Funções, String e Vetores
Bem-vindo ao repositório de atividades de Java focadas em vetores e funções! Este repositório foi criado para auxiliá-lo nas atividades propostas pelo seu professor de Lógica de Programação e Algoritmos. Aqui você encontrará uma variedade de exercícios e exemplos relacionados a vetores e funções em Java, com resolução. <br>

*Os arquivos de resolução estão dentro da página src, com o nome app.java*

## Estrutura do Repositório
O repositório está organizado da seguinte maneira:

```
|-- funcoes/
    |-- atividade_slides/
        |-- atividade1
           |-- enunciado.
           |-- solucao1.java
           |-- solucao2.java
        |-- atividade2
           |-- enunciado.
           |-- solucao1.java
    |-- atividade_lista/
        |-- atividade1
|-- string/
...
```
A pasta atividades/ contém subpastas, e cada subspasta possui uma fonte diferente, para cada atividade específica. Cada atividade conterá o enunciado do exercício e a solução em java. Sinta-se à vontade para adicionar suas próprias soluções nesta pasta.

## Menu
Para facilitar sua navegação, utilize o menu:

### Atividades Slides (Função)
Num | Enunciado | Solução1 | Solução2 
---|---|---|---
1 | [Enunciado](funcoes/atividades_slides/atividade1/enunciado.md) | [Solucao1](funcoes/atividades_slides/atividade1/solucao1/src/App.java) | X
2 | [Enunciado](funcoes/atividades_slides/atividade2/enunciado.md) | [Solucao1](funcoes/atividades_slides/atividade2/solucao1/src/App.java) | X
3 | [Enunciado](funcoes/atividades_slides/atividade3/enunicado.png) | [Solucao1](funcoes/atividades_slides/atividade3/solucao1/src/App.java) | X
4 | [Enunciado](funcoes/atividades_slides/atividade4/enunciado.md) | [Solucao1](funcoes/atividades_slides/atividade4/solucao1/src/App.java) | X
5 | [Enunciado](funcoes/atividades_slides/atividade5/enunciado.png) | [Solucao1](funcoes/atividades_slides/atividade5/solucao1/src/App.java) | X
### Atividade Lista (Função)
Num | Enunciado | Solução1 | Solução2 
---|---|---|---
1 | [Enunciado](funcoes/atividades_lista/atividade1/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade1/solucao1/src/App.java) | X
2 | [Enunciado](funcoes/atividades_lista/atividade2/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade2/solucao1/src/App.java) | X
3 | [Enunciado](funcoes/atividades_lista/atividade3/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade3/solucao1/src/App.java) | X
4 | [Enunciado](funcoes/atividades_lista/atividade4/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade4/solucao1/src/App.java) | X
5 | [Enunciado](funcoes/atividades_lista/atividade5/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade5/solucao1/src/App.java) | X
6 | [Enunciado](funcoes/atividades_lista/atividade6/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade6/solucao1/src/App.java) | X
### Atividade Slide (String)
Num | Enunciado | Solução1 | Solução2 
---|---|---|---
1 | [Enunciado](string/atividades_slides/atividade1/enunciado.md) | [Solucao1](string/atividades_slides/atividade1/solucao1/src/App.java) | X

### Atividade Lista (String)

### Atividade Slide (Vetores)

### Atividade Lista (Vetores)

## Contribuindo
Sinta-se à vontade para contribuir com este repositório! Se você tiver soluções alternativas para as atividades existentes ou quiser adicionar novas atividades ou exemplos, siga estas etapas:

Faça um fork deste repositório.

Crie um novo branch para suas modificações:
```
git checkout -b minha-nova-atividade
```
Adicione suas soluções na pasta apropriada, seguindo o modelo, se ja existir solucao1.java, crie solucao2.java.

Commit suas alterações:
```
git commit -m "Adicionar nova atividade"  
```
Faça push para o branch no seu fork:
```
git push origin minha-nova-atividade
```
Abra um pull request neste repositório.

## Considerações Finais
Este repositório foi criado para auxiliá-lo em suas atividades de Java relacionadas a vetores e funções. Certifique-se de compreender os conceitos por trás de cada atividade e aproveite a oportunidade para aprimorar suas habilidades de programação. Se tiver alguma dúvida, consulte seu professor ou abra uma issue neste repositório.

Divirta-se programando!

## Créditos
Christianne Orrico Dalforno, professora de Lógica de Programação e Algoritmos na UCSAL

## Precisando organizar
Atividade Lista Exercicio 2 String
public class Main {
    public static void main(String[] args) {
       conta1("0010110111");
    }

    public static void conta1(String p) {
      int count = 0;
      for(int i = 0; i < p.length(); i++){
        if(p.charAt(i) == '1'){
        count++;
       }
      }
      System.out.println(count);
    }
}

Atividade Lista Exercicio 3 String
public class Main {
    public static void main(String[] args) {
       contaLetra("00101101a11a", 'a');
    }

    public static void contaLetra(String p, char letra) {
      int count = 0;
      for(int i = 0; i < p.length(); i++){
        if(p.charAt(i) == letra){
        count++;
       }
      }
      System.out.println(count);
    }
}

Atividade Lista Exercicio 4 String
public class Main {
    public static void main(String[] args) {
        System.out.println(troca0por1("00101101a11a"));
    }

    public static String troca0por1(String p) {
      return p.replace('0', '1');
    }
}

Atividade Lista Exercicio 5 String
public class Main {
    public static void main(String[] args) {
        imprimeAoContrario("oi vida");
    }

    public static void imprimeAoContrario(String p) {
      for(int i = p.length() - 1; i >= 0; i--){
        System.out.print(p.charAt(i));
      }
    }
}

Atividade Lista Exercicio 6 String
public class Main {
    public static void main(String[] args) {
       String novaPalavra = substituaPalavras("oi vida linda", 'a', 'b');
	     System.out.println(novaPalavra);
    }
  
    public static String substituaPalavras(String frase, char letra1, char letra2) {
        return frase.replace(letra1, letra2);
    }
}


Atividade Lista Exercicio 7 String
public class Main {
    public static void main(String[] args) {
        imprimePiramide("oi vida");
    }

    public static void imprimePiramide(String p) {
      for(int i = 0; i < p.length(); i++){
          System.out.println(p.charAt(i));
        }
    }
}
Atividade Lista Exercicio 8 String
public class Main {
    public static void main(String[] args) {
       int numDePalavras = contarPalavras("oi vida linda");
	     System.out.println(numDePalavras);
    }
    public static int contarPalavras(String frase) {
        String[] palavras = frase.split(" ");
        return palavras.length;
    }
}

Atividade Lista Exercicio 9 String
public class Main {
    public static void main(String[] args) {
        imprimePiramide("oi vida");
    }

    public static void imprimePiramide(String p) {
      for(int i = 0; i < p.length(); i++){
        for(int j = 0; j <= i; j++){
          System.out.print(p.charAt(j));
        }
        System.out.println("");
      }
    }
}

Atividade Slide Exercicio 1 Vetor
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = preencherArray();
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
      System.out.println("O maior numero é "+ maiornumero(array));
    }
    
    public static int[] preencherArray() {
        int[] array = new int[5];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(21);
            array[i] = numero;
        }
        
        return array;
    }
  public static int maiornumero(int[] v){
     int maior = v[0];
     for (int i = 1; i < v.length; i++) {
        int proxnumero = v[i];
        if(proxnumero > maior){
          maior = proxnumero;
        }
    }
    return maior;
  }
}

Atividade Slide Exercicio 2 Vetor
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int[] array1 = preencherArray();
      int[] array2 = preencherArray();
      int[] somadosarrays = somarArrays(array1, array2);
      for (int i = 0; i < array1.length; i++) {
        System.out.println(array1[i]);
        System.out.println(array2[i]);
        System.out.println("A soma dos arrays no index "+i+" é "+somadosarrays[i]);
        System.out.println();
      }
    }
    
      public static int[] preencherArray() {
        int[] array = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(21);
            array[i] = numero;
        }
        
        return array;
    }
  public static int[] somarArrays(int[] array1, int[] array2){
     int[] novoArray = new int[10];
     for (int i = 0; i < novoArray.length; i++) {
      novoArray[i] = array1[i] + array2[i];
    }
    return novoArray;
  }
}

    
 Atividade Slide Exercicio 3 Vetor
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int[] array = preencherArray();
      for (int i = array.length - 1; i >= 0; i--) {
        System.out.println(array[i]);
      }
    }
    
    public static int[] preencherArray() {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
      
        for (int i = 0; i < array.length; i++) {
         System.out.println("Digite um número ");
          int numero = sc.nextInt();
            array[i] = numero;
        }
        System.out.println("");
        return array;
    }

}


    
Atividade Slide Exercicio 4 Vetor

public class Main {
    public static void main(String[] args) {
      int[] fibo = preencherFibonacci(2);
      for (int i = 0; i <  fibo.length; i++) {
        System.out.println(fibo[i]);
      }
    }
    
    public static int[] preencherFibonacci(int n) {
        int[] array = new int[n];
        int a=1,b=1, c=a+b, i=1;
        array[0] = 1;
        while(i < n){
          c = a+b;
          a = b;
          b = c;
          array[i] = a;
          i++;
        }
    return array;
    }
}

Atividade Slide Exercicio 5 Vetor
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int[] array = preencherArray();
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
      quantDeVezes(array, 3);
    }
    
    public static int[] preencherArray() {
        int[] array = new int[50];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(5) + 1;
            array[i] = numero;
        }
        
        return array;
    }
  public static void quantDeVezes(int[] v, int n){
     int contador = 0;
     for (int i = 0; i < v.length; i++) {
        if(v[i] == n){
          contador++;
        }
    }
    System.out.println("O numero "+n+" apareceu no vetor "+contador+" vezes");
  }
}

Atividade Slide Exercicio 6 Vetor
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

Atividade Slide Exercicio 7 Vetor
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

Atividade Lista Exercicio 1 Vetor
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        int[] idades = new int[3];
        preencherVetores(nomes, idades);
          for(int i = 0; i < 3; i++){
          System.out.println("Nome: "+nomes[i]+" Idade: "+idades[i]);
       }
        calcularMedia(nomes, idades);
    }
    
    public static void preencherVetores(String[] v, int[] n) {
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i < 3; i++){
          System.out.println("Digite seu nome: ");
          v[i] = sc.next();
          System.out.println("Digite sua idade: ");
         n[i] = sc.nextInt();
       }
    }

  public static void calcularMedia(String[] v, int[] n){
      double soma = 0, media;
      for(int i = 0; i < 3; i++){
        soma += n[i];
       }
      media = soma/3;
    System.out.println("A media é "+media);
    for(int i = 0; i < 3; i++){
        if(n[i] >= media){
           System.out.println("Possui idade acima da media "+v[i]);
        }
       }
  }
  
}

Atividade Lista Exercicio 2 Vetor
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomes = new String[6];
        preencherVetores(nomes);
        for (int i = 0; i < 6; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("");
        }
        eleicao(nomes);
    }

    public static void preencherVetores(String[] v) {
        v[0] = "Branco";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Digite seu nome: ");
            v[i] = sc.next();
        }
    }

    public static void eleicao(String[] nomes) {
        int opcao;
        int[] votos = new int[6];
        Scanner sc = new Scanner(System.in);
        do {
            for (int i = 0; i < 6; i++) {
                System.out.printf("Opção %d - %s | Votos: %d\n", i, nomes[i], votos[i]);
            }
            System.out.println("Deseja votar em qual candidato? (Digite o número da opção ou -1 para sair)");
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 5) {
                votos[opcao]++;
            } else if (opcao != -1) {
                votos[0]++;
            }
        } while (opcao != -1);

        int maiorVotos = votos[1];
        for (int i = 1; i < 6; i++) {
            if (votos[i] > maiorVotos) {
                maiorVotos = votos[i];
            }
        }

        System.out.println("O vencedor foi:");
        for (int i = 1; i < 6; i++) {
            if (votos[i] == maiorVotos) {
                System.out.println(nomes[i]);
            }
        }
    }
}

Atividade Lista Exerccio 3 Vetor
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      int[] array = preencherArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
      System.out.println("");
      System.out.println("");
      bubbleSort(array);
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
       }
    }
    
    public static int[] preencherArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(50) + 1;
            array[i] = numero;
        }
        
        return array;
    }
  
 public static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adjacentes
                if (array[j] > array[j + 1]) {
                    // Troca os elementos de posição
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

