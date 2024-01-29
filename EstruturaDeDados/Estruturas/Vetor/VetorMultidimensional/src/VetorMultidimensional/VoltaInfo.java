package VetorMultidimensional;

public class VoltaInfo {
	  	private float tempo;
	    private int numeroDaVolta;
	    private String corredor;

	    public VoltaInfo(float tempo, int numeroDaVolta, String corredor) {
	        this.tempo = tempo;
	        this.numeroDaVolta = numeroDaVolta;
	        this.corredor = corredor;
	    }

	    public float getTempo() {
	        return tempo;
	    }

	    public int getNumeroDaVolta() {
	        return numeroDaVolta;
	    }
	     

		public String getCorredor() {
			return corredor;
		}

		@Override
		public String toString() {
			return "Melhor tempo: "+getTempo()+"\n"+"Na volta: "+getNumeroDaVolta()+"\n"+"Corredor: "+getCorredor();
		}
	    
	    
}
