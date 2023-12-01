package aula01;

public class Main {
	 public static void main(String[] args) {
		 
		//PrinterInt intNumber = new PrinterInt(3 + 0);
		//intNumber.print();
		 
		//PrinterDouble doubleNumber = new PrinterDouble(3 + 0.512);
		//doubleNumber.print();
		 
		//PrinterString stringNumber = new PrinterString("3 + 0.512");
		//stringNumber.print();
		 
		 Printer<Integer> intNumber = new Printer<>(3 + 0);
		 intNumber.print();
		 
		 Printer<Double> doubleNumber = new Printer<>(3 + 0.512);
		 doubleNumber.print();
		 
		 Printer<String> stringNumber = new Printer<>("3 + 0.512");
		 stringNumber.print();
	}
}
