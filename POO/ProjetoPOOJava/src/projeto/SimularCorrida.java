package projeto;

public class SimularCorrida {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Carro 1");
        Veiculo carro2 = new Veiculo("Carro 2");
        int distanciaMaxima = 50;
        
        System.out.println("INICIO DA CORRIDA!");
        System.out.println("--------------------------------------------------");
        System.out.println("#");
        System.out.println("#");
        System.out.println("--------------------------------------------------");
        
        while (carro1.getDistancia() < distanciaMaxima && carro2.getDistancia() < distanciaMaxima) {
            carro1.mover();
            carro2.mover();
            
            imprimirCorrida(carro1, carro2);
        }
        resultadoCorrida(carro1, carro2);
    }
    
    
    public static void imprimirCorrida(Veiculo carro1, Veiculo carro2) {
        int distanciaCarro1 = carro1.getDistancia();
        int distanciaCarro2 = carro2.getDistancia();
        String representacaoCarro1 = "";
        String representacaoCarro2 = "";
        
        System.out.println("---------------------------------------------------");
        
        for (int i = 0; i < distanciaCarro1; i++) {
            representacaoCarro1 += " ";
        }
        
        representacaoCarro1 += "#";
         
        for (int i = 0; i < distanciaCarro2; i++) {
            representacaoCarro2 += " ";
        }
        
       
        representacaoCarro2 += "#";
        
        System.out.println(representacaoCarro1);
        System.out.println(representacaoCarro2);
        
        System.out.println("---------------------------------------------------");
        
    }
    
    public static void resultadoCorrida(Veiculo carro1, Veiculo carro2){
		int distanciaCarro1 = carro1.getDistancia();
        int distanciaCarro2 = carro2.getDistancia();
        
        if(distanciaCarro1 > distanciaCarro2) {
        	System.out.println(carro1.getNome()+" venceu a corrida!");
        	System.out.print(carro1.getNome()+" andou : " + distanciaCarro1);
            System.out.print(" | ");
            System.out.println(carro2.getNome()+" andou : " + distanciaCarro2);
        } else if ( distanciaCarro2 > distanciaCarro1) {
        	System.out.println(carro2.getNome()+" venceu a corrida!");
        	System.out.print(carro1.getNome()+" andou : " + distanciaCarro1);
            System.out.print(" | ");
            System.out.println(carro2.getNome()+" andou : " + distanciaCarro2);
        } else {
        	System.out.println("EMPATE!!!");
        	System.out.print(carro1.getNome()+" andou : " + distanciaCarro1);
            System.out.print(" | ");
            System.out.println(carro2.getNome()+" andou : " + distanciaCarro2);
        }
	}
}

	