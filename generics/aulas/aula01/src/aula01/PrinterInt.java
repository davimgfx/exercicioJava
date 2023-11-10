package aula01;

public class PrinterInt {
	// não funciona com int
	private Integer number;
	
	public PrinterInt(int num) {
		this.number = num;
	}

	public void print() {
		System.out.println(getNumber());
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}		
}
