package L501;

import util.Teclado;

public class L503Q03 {
	
	/*
	 * 3)	Desenvolver um programa que apresente os resultados de uma tabuada de um 
	 *      n�mero qualquer informado pelo usu�rio.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		n = Teclado.lerInt("Informe um numero para que seja gerado a tabuada de multiplica��o: ");
		
		for ( int cont = 0 ; cont <= 10 ; cont ++) {
			
			System.out.println(n + " x " + cont + " = " + (n * cont));
		}
		

	}

}
