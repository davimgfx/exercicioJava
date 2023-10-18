package aula2;

public class Caneta {
		public String modelo, cor;
		private float ponta;
		protected int carga;
		protected boolean tampada;
		
		public void status() {
			System.out.println("Uma caneta "+this.cor+" do modelo "+this.modelo+" da ponta "
		+this.ponta+" e carga "+this.carga+" e está "+(tampada == true ? "tampada" : "destampada"));
			
		}
		
		public void rabiscar() {
			if(this.tampada) {
				System.out.println("Impossivel rabiscar");
			} else {
				System.out.println("Ok! Rabiscar");
			}
		}
		
		private void tampar() {
			if(!this.tampada) {
				this.tampada = true;
				System.out.println("Caneta tampada");
			} else {
				System.out.println("Sua caneta ja está tampada!");
			}
		}
		
		private void destampar() {
			if(this.tampada) {
				this.tampada = false;
				System.out.println("Caneta destampada");
			} else {
				System.out.println("Sua caneta ja está destampada");
			}
		}
	
}

