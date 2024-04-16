package instancia;

import java.util.Arrays;

public class controller {
		
	public int[][] carregarMatriz (int matriz [][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int)((Math.random() * 100));
				System.out.println(matriz[i][j]);
			}
		}
		
	return matriz;	
	}
	
	public void classificaMatriz(int matriz [][]) {
		
		int aux;
		int j = 0;
		int vetor [] = new int [matriz.length];
		
		for (int i = 0 ; i < matriz.length ; i++) {				
			for (j = 0 ; j < matriz.length ; j++) {
				vetor[i] = matriz[i][j];
			}
		}
		
		for (int p = 0 ; p < vetor.length - 1 ; p++) {
		    for (int k = 0 ; k < vetor.length - 1 ; k++) { 
		        if (vetor[k] > vetor[k+1]) { 
		            aux = vetor[k]; 
		            vetor[k] = vetor[k+1];
		            vetor[k+1] = aux;
		        }
		    }
		}
					System.out.println(Arrays.toString(vetor));	

	}
}
