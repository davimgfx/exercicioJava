# O que é um VETOR ?

- Armazena uma coleção de valores, geralmente por convenção, do mesmo tipo.

<img src="https://res.cloudinary.com/dfbny1pcr/image/upload/v1701647141/kwuhlewrakdcmw8otdor.png" alt="Exemplo de Vetor"/>

## Vetores simples
- Um vetor simples é uma estrutura de dados que armazena uma coleção de valores do mesmo tipo de forma linear. Cada elemento dentro do vetor é acessado por meio de um índice, começando geralmente do índice 0.

```
int[] vetorSimples = {1, 2, 3, 4, 5};
```
## Vetores multidimensional

```
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## Vetores mutáveis
- Visto a limitação ofericidas pelos vetores, o Java possui Listas para facilitar o trabalho.
```
ArrayList<String> lista = new ArrayList<>();
		
// Adição de elementos
lista.add("Elemento 1");
lista.add("Elemento 2");
lista.add("Elemento 3");
lista.add("Elemento 4");
lista.add("Elemento 5");
lista.add("Elemento 6");
		
// Acesssar
String elemento1 = lista.get(0);
String elemento2 = lista.get(1);
System.out.println(elemento1);
System.out.println(elemento2);

// Remover
lista.remove("Elemento 2");

// Atualizar
// "Remove toda a lista e cria uma nova"
// lista.set(0, "Novo Valor");

//Verificar se Existe
boolean existe = lista.contains("Novo Valor");
System.out.println(existe);

// Tamanho
int tamanho = lista.size();

//Organizar
Collections.sort(lista);

for(int i=0; i<lista.size(); i++) {
    System.out.println(lista.get(i));
}
```

## Busca em vetores
- Como buscar itens especificos da forma mais eficiente sem saber seu índice? Como organizar um vetor?

### Busca linear
- A busca linear é o método mais simples, onde os elementos do vetor são percorridos sequencialmente até encontrar o item desejado.

```
public static int buscaLinear(int[] vetor, int elemento) {
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == elemento) {
            return i; // Retorna a posição do elemento se encontrado
        }
    }
    return -1; // Retorna -1 se o elemento não for encontrado
}
```

### Busca binária
- A busca binária é uma abordagem mais eficiente, mas requer que o **vetor esteja ordenado**. Esse algoritmo compara o elemento alvo com o valor no meio do vetor, reduzindo a busca pela metade a cada iteração.

```
public static int buscaBinaria(int[] vetor, int elemento) {
    int inicio = 0;
    int fim = vetor.length - 1;

    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;

        if (vetor[meio] == elemento) {
            return meio; // Retorna a posição do elemento se encontrado
        } else if (vetor[meio] < elemento) {
            inicio = meio + 1;
        } else {
            fim = meio - 1;
        }
    }

    return -1; // Retorna -1 se o elemento não for encontrado
}
```

## Ordenação de vetores
- Imagine que queremos orgazinar 10 números aleatórios em um vetor, do maior número para o menor.

<img src="https://res.cloudinary.com/dfbny1pcr/image/upload/v1701785490/jbqriaqqhjuhfscr1uoo.png"/>

- A forma mais simples seria:

```
package vetorMultavel;

public class Main {
	public static void main(String[] args) {
		int[] array = {17, 555, 946, 358, 719, 384, 92, 674, 328, 871};
		
		int[] sortedArray = sortArray(array);

        System.out.println("Array ordenado do maior para o menor:");
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
	}
	
	  private static int findMax(int[] arr) {
	        int maxIndex = 0;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > arr[maxIndex]) {
	                maxIndex = i;
	            }
	        }
	        return maxIndex;
	    }

	    
	    private static int[] sortArray(int[] arr) {
	        int[] sortedArray = new int[arr.length];

	        for (int i = 0; i < arr.length; i++) {
	            int maxIndex = findMax(arr);
	            sortedArray[i] = arr[maxIndex];
	            arr[maxIndex] = Integer.MIN_VALUE; 
	        }

	        return sortedArray;
	    }
}

```

## Notação Big O
- Descreve o desempenho ou complexidade de um algorismo.
  
### **Tempo O(1)**
  
```
resultado = meuVetor[1]
meuVetor[2] = 104
resultado1 = meuVetor[3]
```

- Algoritmo tem um **tempo constante** de execução, independente do tamanho do vetor.

### **Tempo O(n)**

  Imagine ordenar agora um vetor com 300 números, com a busca linear. Agora 800. Agora 1500. Conforme cresce o vetor, mais tempo vai demorar.

- Algoritmo tem um **tempo linear** de execução, depende diretamente do tamanho do vetor.

Obs: Por isso que existe algoritmos que buscam reduzir esse tempo. Alguns deles:
- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Heap Sort
- Radix Sort