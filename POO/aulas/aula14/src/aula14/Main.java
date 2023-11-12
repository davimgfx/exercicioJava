package aula14;

public class Main {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Minecraft");
		v[1] = new Video("Pvp contra os homi");
		v[2] = new Video("Corre soldado");
		System.out.println(v[0].toString());
		v[0].play();
		System.out.println(v[0].toString());
		v[0].play();
		v[0].pause();
		System.out.println(v[0].toString());
		v[0].pause();
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubi", 23, "M", 213, false);
		System.out.println(g[0].toString());
	}
}
