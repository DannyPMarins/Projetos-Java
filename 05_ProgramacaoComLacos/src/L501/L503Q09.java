package L501;

import util.Teclado;

public class L503Q09 {
	
	/*
	 * 9)	Desenvolver um programa que pergunte um n�mero inteiro e exiba os n�meros que s�o,
	 *      ao mesmo tempo, m�ltiplos de 3 e 5, na sequ�ncia de 1 at� o n�mero informado pelo 
	 *      usu�rio.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, resto3, resto5;
		
		numero = Teclado.lerInt("Informe um numero: ");
		
		for ( int cont = 1 ; cont <= numero ; cont ++ ) {
			
			resto3 = cont % 3;
			resto5 = cont % 5;
			
			if (  ( resto3 == 0 ) && ( resto5 == 0)  ) {
				
				System.out.println(cont + " � multiplo de 3 e de 5");
			 }
		}

	}

}
