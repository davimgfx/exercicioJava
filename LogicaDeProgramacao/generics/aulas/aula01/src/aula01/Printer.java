package aula01;

// É possivel ir alem disso, usar para receber objetos
// é possivel public class Printer <T extends AlgumaClasse>
// é possivel public class Printer <T extends AlgumaInterface>
// Como java so suportar Herança de uma classe, não é possivel <T extends AlgumaClasse && OutraClasse>
// é possivel public class Printer <T extends AlgumaClasse && AlgumaInterface>
public class Printer <T, V>{
	private T number;
	private V value;
	
	public Printer(T num, V val) {
		this.number = num;
		this.value = val;
	}
	
	public void print() {
		System.out.println(getNumber());
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	// metodo generico
	private static <T, V> void shout (T thingToShout, V anotherthingToShout) {
		System.out.println(thingToShout);
		System.out.println(anotherthingToShout);
	}

	// Para retonar T e V, é preciso criar uma classe que possui essas duas estruturas
	// public class Pair<T, V> {
    // private T first;
    // private V second;

    // public Pair(T first, V second) {
    //     this.first = first;
    //     this.second = second;
    // }

    // public T getFirst() {
    //     return first;
    // }

    // public V getSecond() {
    //     return second;
    // }
	
	private static <T, V> T returnShout (T thingToShout, V anotherthingToShout) {
		return T
	}
}
