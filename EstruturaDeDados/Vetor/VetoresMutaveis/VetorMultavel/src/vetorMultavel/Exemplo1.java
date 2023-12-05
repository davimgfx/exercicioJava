package vetorMultavel;

import java.util.ArrayList;
import java.util.Collections;

public class Exemplo1 {
	public static void main(String[] args) {
		
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
		
	}
}
