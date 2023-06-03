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
3 | [Enunciado](funcoes/atividades_lista/atividade3/enunicado.md) | [Solucao1](funcoes/atividades_lista/atividade3/solucao1/src/App.java) | X
4 | [Enunciado](funcoes/atividades_lista/atividade4/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade4/solucao1/src/App.java) | X
5 | [Enunciado](funcoes/atividades_lista/atividade5/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade5/solucao1/src/App.java) | X
6 | [Enunciado](funcoes/atividades_lista/atividade6/enunciado.md) | [Solucao1](funcoes/atividades_lista/atividade6/solucao1/src/App.java) | X
### Atividade Slide (String)

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
Atividade Slide Exercicio 1 String
public class App {
  
    public static void main(String[] args) {
        palavra("Maroto");
    }

    public static void palavra(String p) {
      for(int i = 0; i < p.length() ; i++){
         System.out.println(p.charAt(i));
      }
    }
}

Atividade Slide Exercicio 2 String
public class Main {
  
    public static void main(String[] args) {
        palavra("Ronaldo");
    }

    public static void palavra(String p) {
      for(int i = 0; i < p.length() ; i++){
        for(int j=0; j<=i; j++) {
				System.out.print(p.charAt(j));
			}
			System.out.println();;
      }
    }
}

Atividade Slide Exercicio 3 String
public class Main {
  
    public static void main(String[] args) {
       System.out.println(quantosa("Sacanagem"));
    }

    public static int quantosa(String p) {
        int count = 0;
        p = p.toLowerCase();
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 'a') {
                count++;
            }
        }
       return count;
    }
}

Atividade Slide Exercicio 4String
public class Main {
  
    public static void main(String[] args) {
      System.out.println(removerSubstring("removersub", "sub"));
    }

 public static String removerSubstring(String palavra, String substring){
        return palavra.replace(substring, "");
    }
}

Atividade Slide Exercicio 5 String
public class Main {
    public static void main(String[] args) {
        String[] teste = removerPrimeiraUltimaPalavra("eu sou o Douglas");
        for (int i = 0; i < teste.length; i++) {
            System.out.print(teste[i]+" ");
        }
    }

    public static String[] removerPrimeiraUltimaPalavra(String frase) {
        String[] palavras = frase.split(" ");
        String[] novafrase = new String[palavras.length - 2];

        for (int i = 0; i < novafrase.length; i++) {
            novafrase[i] = palavras[i + 1];
        }

        return novafrase;
    }
}

Atividade Lista Exercicio 1 String
public class Main {
    public static void main(String[] args) {
       primeiraLetraA("Arara");
    }

    public static void primeiraLetraA(String p) {
      p = p.toLowerCase();
       if(p.charAt(0) == 'a'){
        System.out.println(p);
       } else {
        System.out.println("Não começa com letra!");
       }
    }
}

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
