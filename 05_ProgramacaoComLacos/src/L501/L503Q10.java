package L501;

import util.Teclado;

public class L503Q10 {
	
	/*
	 * 10)	Desenvolver um programa que apresente o fatorial de um número informado pelo usuário.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, fat = 1;
		
		n = Teclado.lerInt("Informe o valor de um numero: ");
		
		for ( int cont = 1; cont <= n; cont++ ) {
			
			fat = fat * cont;
		}
		
		System.out.println("O fatorial de " + n + " é " + fat);
	}

}
