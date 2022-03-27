package L501;

import util.Teclado;

public class L502Q04 {
	
	/*
	 * 4) Desenvolver um programa que apresente os resultados de uma tabuada de um número n 
	 *    qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x 9, n x 10)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, cont = 1;
		
		n = Teclado.lerInt("Informe um numero:");
		
		
		do {
			
			System.out.println(n + " X " + cont + " = " + (n * cont));
			
			cont ++;
		} while(cont <= 10);
		
		
		/*
		while (cont <= 10) {
			
			System.out.println(n * cont);
			
			cont ++;
		}
		*/
	}

}
