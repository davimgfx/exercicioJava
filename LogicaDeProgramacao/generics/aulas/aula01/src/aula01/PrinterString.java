package aula01;

public class PrinterString {
	private String number;
	
	public PrinterString(String num) {
		this.number = num;
	}
	
	public void print() {
		System.out.println(getNumber());
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
