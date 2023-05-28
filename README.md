# Repositório de Atividades de Java - Vetores e Funções
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
|-- vetores/
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
3 | [Enunciado](funcoes/atividades_slides/atividade3/enunicado.png) | [Solucao1](funcoes/atividades_slides/atividade3/solucao1/src/App.java)
4 | [Enunciado](funcoes/atividades_slides/atividade4/enunicado.png) | [Solucao1](funcoes/atividades_slides/atividade4/solucao1/src/App.java)
5 | [Enunciado](funcoes/atividades_slides/atividade5/enunicado.png) | [Solucao1](funcoes/atividades_slides/atividade5/solucao1/src/App.java)
### Atividade Lista (Função)

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

Exercicio 1 Lista

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
		int n, soma=0, cont=0, p=2;
    Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(cont!=n) {
			if(acharPrimo(p)) {
				soma += p; 
				cont++;
			}
			p++;
		}
		System.out.println(soma);
	}

	public static boolean acharPrimo(int n){
    int count = 0;
    int i = 1;
    while(i <= n){
      if(n % i == 0){
        count++;  
      }
      i++;
    }
    if(count == 2){
       return true;
    } else{
      return false;
    }
  }
}


Exercicio 2 Lista

import java.util.Scanner;

public class L6Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(mmc(a, b));

	}

	public static int mmc(int a, int b) {
		int minimoMultiplo=b;
		
		while((minimoMultiplo%a!=
0)||(minimoMultiplo%b!=0)) {
			minimoMultiplo++;
		}
		return minimoMultiplo;
	}
	
	Exercicio 3 Lista
	
	public class Main {

	public static void main(String[] args) {
		System.out.println(Fibonacci(2));
	}

	public static int Fibonacci(int n) {
		int a=1,b=1, c=a+b, i=2;
		if (n == 1 || n == 2) return 1;
    while(i < n){
      c = a+b;
      a = b;
      b = c; 
      i++;
    }
    return c;
  }
}

Exercicio 4 Lista
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
     String opcao;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Voce quer ver a tabuada?  ");
      opcao = sc.nextLine();
      if(opcao.equals("n")){
        break;
      }
      if (opcao.equals("s")) {
        System.out.println("Digite o numero");
        int n = sc.nextInt();
        tabuada(n);
      }
    }
  }

  public static void tabuada(int n1) {
    for(int i = 0; i < 11; i++){
      System.out.println(n1+" x "+i+" = "+(n1*i));
    }
  }
}

Exercicio 5 Java
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Defina o valor de "n" desejado
        
        double soma = valordesa(n);
        
        DecimalFormat df = new DecimalFormat("#.######"); // Define o padrão de formatação com 6 casas decimais
        
        String resultadoFormatado = df.format(soma);
        
        System.out.println("A soma da série harmônica até " + n + " é: " + resultadoFormatado);
    }

    public static double valordesa(int n1) {
        double soma = 1;
        int i = 1;
        while (i < n1) {
            soma += 1.0 / i;
            i++;
        }
        return soma;
    }
}

