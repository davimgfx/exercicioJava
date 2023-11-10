package aula01;

// É possivel ir alem disso, usar para receber objetos
public class Printer <T>{
	private T number;
	
	public Printer(T num) {
		this.number = num;
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
}
