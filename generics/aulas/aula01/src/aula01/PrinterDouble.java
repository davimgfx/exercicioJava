package aula01;

public class PrinterDouble {
	private double number;
	
	public PrinterDouble(double num) {
		this.number = num;
	}
	
	public void print() {
		System.out.println(getNumber());
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
}
