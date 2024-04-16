package instancia;
import javax.swing.JOptionPane;

import instancia.controller;

public class view {
	public static void main(String[] args) {
		
		int matriz [][] = new int[30][30];
		controller c = new controller();
		int opc = 0;
		
		
		//carregarMatriz - qualquer valor
		//Classificar matriz do menor pro maior
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n1 - Carregar Matriz\n2 - "
					+ "Classificar Matriz\n9 - FIM"));
			switch (opc) {
			case 1:
				matriz = c.carregarMatriz(matriz);
				break;
			case 2:
				System.out.println("===================");
				c.classificaMatriz(matriz);
				break;
			case 9:
				System.out.println("Fim");
				return;
			default:
				System.out.println("Tente novamente");
				break;
			}
			
		} while (opc != 9);
	}
}
