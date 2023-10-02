package aula07;

public class aula07 {
	public static void main(String[] args) {
		lutador l[] = new lutador[6];
		l[0]= new lutador("Pretty Boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
		l[1]= new lutador("Paaa", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
		l[2]= new lutador("Sbap", "EUA", 35, 12, 2, 1, 1.65f, 80.9f);
		l[3]= new lutador("Dead Code", "Australia", 28, 13, 0, 2, 1.93f, 81.9f);
		l[4]= new lutador("UfoCobol", "Brasil", 37, 5, 4, 3, 1.70f, 119.3f);
		l[5]= new lutador("Nerd Forte!!!", "EUA", 30, 12, 2, 4, 1.81f, 105.7f);
		
		
		luta uec01 = new luta();
		uec01.marcarLuta(l[0], l[1]);
		uec01.lutar();
		l[0].apresentar();
	}
	
}
