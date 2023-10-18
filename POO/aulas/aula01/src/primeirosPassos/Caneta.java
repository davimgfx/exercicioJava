package primeirosPassos;

public class Caneta {
		String modelo, cor;
		float ponta;
		int carga;
		boolean tampada;
		
		void status() {
			System.out.println("Uma caneta "+this.cor+" do modelo "+this.modelo+" e está "+(tampada == true ? "tampada" : "destampada"));
		}
		
		void rabiscar() {
			if(this.tampada) {
				System.out.println("Impossivel rabiscar");
			} else {
				System.out.println("Ok! Rabiscar");
			}
		}
		
		void tampar() {
			if(!this.tampada) {
				this.tampada = true;
				System.out.println("Caneta tampada");
			} else {
				System.out.println("Sua caneta ja está tampada!");
			}
		}
		
		void destampar() {
			if(this.tampada) {
				this.tampada = false;
				System.out.println("Caneta destampada");
			} else {
				System.out.println("Sua caneta ja está destampada");
			}
		}
	
}

/* 
package primeirosPassos;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

 
    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = true; 
    }

    
    public void tampar() {
        if (!tampada) {
            tampada = true;
            System.out.println("Caneta tampada");
        } else {
            System.out.println("Sua caneta já está tampada!");
        }
    }

    public void destampar() {
        if (tampada) {
            tampada = false;
            System.out.println("Caneta destampada");
        } else {
            System.out.println("Sua caneta já está destampada");
        }
    }

  
    public void verificarEstado() {
        if (tampada) {
            System.out.println("Está tampada");
        } else {
            System.out.println("Não está tampada");
        }
    }

 
}
*/