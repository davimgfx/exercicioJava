// Uma pista de Kart permite 10 voltas para cada um de 6 corredores. 
// Faça um programa que leia os nomes e os tempos (em segundos)
// cada volta de cada corredor e guarde as informações em uma matriz.
// Ao final, o programa deve informar:
// De quem foi a melhor volta da prova, e em que volta.
// Para saber as posições dos ganhadores, é preciso calcular a médias da 10 voltas
// e quem tiver o menor tempo ganha


package VetorMultidimensional;

import java.util.Random;

public class Exercicio1 {
	  public static void main(String[] args) {
		  float[][] array = preencherArray();
		  String[] nomes = {"Davi", "Felipe", "Antonio", "Cesar", "Gabriel", "Fernando"};
		  VoltaInfo melhorVoltaInfo = melhorVolta(array, nomes);
		  System.out.println(melhorVoltaInfo.toString());
		 
	}
	  
	  public static float[][] preencherArray() {
	        float[][] array = new float[6][10];
	        Random random = new Random();
	        for (int i = 0; i < array.length; i++) {
	        	for(int j = 0; j < array[i].length; j++) {
	        		float numero = random.nextFloat(10) + 1;
	        		array[i][j] = numero;
	        		System.out.print(array[i][j] + " ");
	        	}
	        	System.out.println("");
	        }
	        
	        return array;
	    }
	  
	  public static VoltaInfo melhorVolta(float[][] array, String[] corredores){
		  float melhorVoltaValor = array[0][0];
		  int numeroDaVolta = 1;
		  int corredor = 1;
		  String nomeDoCorredor = corredores[0];
		  for (int i = 0; i < array.length; i++) {
	        	for(int j = 0; j < array[i].length; j++) {
	        		if(array[i][j] < melhorVoltaValor) {
	        			melhorVoltaValor = array[i][j];
	        			numeroDaVolta = j + 1;
	        			corredor = i;
	        		}
	        	}
	        }
		  for (int i = 0; i < corredores.length; i++) {
	        	if(corredor == i) {
	        		nomeDoCorredor = corredores[i];
	        	}
	        }
		  
	        
		  return new VoltaInfo(melhorVoltaValor, numeroDaVolta, nomeDoCorredor);
	  }
	  
	  public static String[] calcularPosicoesDosGanhadores(float[][] array, String[] corredores) {
		  ''''
	  }
}
