package Vetor;

import java.util.Arrays;

public class Exemplo1 {
	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0; i < 5; i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}
		array[0] = 0;
		
		System.out.println("----------");
		System.out.println("Novo array");
		System.out.println("----------");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("----------");
		System.out.println("Array length");
		System.out.println("----------");
		System.out.println(array.length);
	
		int sum = Arrays.stream(array).reduce(0, (a, b) -> a + b);
		
		System.out.println("----------");
        System.out.println("Soma: " + sum);
        System.out.println("----------");
	}
}
