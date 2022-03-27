package L501;

import util.Teclado;

public class L503Q09 {
	
	/*
	 * 9)	Desenvolver um programa que pergunte um número inteiro e exiba os números que são,
	 *      ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número informado pelo 
	 *      usuário.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, resto3, resto5;
		
		numero = Teclado.lerInt("Informe um numero: ");
		
		for ( int cont = 1 ; cont <= numero ; cont ++ ) {
			
			resto3 = cont % 3;
			resto5 = cont % 5;
			
			if (  ( resto3 == 0 ) && ( resto5 == 0)  ) {
				
				System.out.println(cont + " é multiplo de 3 e de 5");
			 }
		}

	}

}
