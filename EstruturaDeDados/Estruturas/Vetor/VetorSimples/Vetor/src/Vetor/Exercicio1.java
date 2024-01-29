// Write a function that can return the smallest value of an array or the index of that value.
// The function's 2nd parameter will tell whether it should return the value or the index.
// Assume the first parameter will always be an array filled with at least 1 number and no duplicates.
// Assume the second parameter will be a string holding one of two values: 'value' and 'index'.

// min([1,2,3,4,5], 'index') // => 0
// min([1,2,3,4,5], 'value') // => 1

// min([1,2,-3,4,5], 'index') // => 2
// min([1,2,-3,4,5], 'value') // => -3

// min([-1,8,-3,0,-5], 'index') // => 4
// min([-1,8,-3,0,-5], 'value') // => -5


package Vetor;


public class Exercicio1 {
	public static void main(String[] args) {
		int[] arrayTeste1  = {1, 2, 3, 4, 5};
	    int[] arrayTeste2 = {1, 2, -3, 4, 5};
	    int[] arrayTeste3 = {-1, 8, -3, 0, -5};
		
		System.out.println(minIndex(arrayTeste1));
		System.out.println(minIndex(arrayTeste2));
		System.out.println(minIndex(arrayTeste3));
		System.out.println("---------------------");
		System.out.println(minValue(arrayTeste1));
		System.out.println(minValue(arrayTeste2));
		System.out.println(minValue(arrayTeste3));
		System.out.println("---------------------");
		System.out.println(min(arrayTeste1, "index"));
		System.out.println(min(arrayTeste1, "value"));
		System.out.println(min(arrayTeste2, "index"));
		System.out.println(min(arrayTeste2, "value"));
		System.out.println(min(arrayTeste3, "index"));
		System.out.println(min(arrayTeste3, "value"));
	}
	
	public static int min(int[] arry, String toReturn) {
		if(toReturn == "index") {
			return minIndex(arry);
		} else {
			return minValue(arry);
		}
	}

	
	public static int minIndex(int[] arry) {
		int minIndexValue = 0;
		for(int i = 0; i < arry.length; i++) {
			if(minIndexValue > arry[i]) {
					minIndexValue = i;
				}
			}
		
		return minIndexValue;
	}
	
	public static int minValue(int[] arry) {
		int minIndexValue = arry[0];
		for(int i = 0; i < arry.length; i++) {
			if(minIndexValue > arry[i]) {
					minIndexValue = arry[i];
				}
			}
		
		return minIndexValue;
	}
	

}
