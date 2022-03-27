package L501;

import util.Teclado;

public class L503Q02 {
	
	/*
	 * 2)	Desenvolver um programa que apresente o total da soma de n números inteiros 
	 *      do número 1 até n, onde n é um valor informado pelo usuário.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, soma = 0;
		
		n = Teclado.lerInt("informe o valor de um numero: ");
		
		for ( int cont = 1 ; cont <= n ; cont ++) {
			
			soma = soma + cont;
						
		}
		
		System.out.println("A soma dos numeros de 1 até " + n +" é " + soma);
	}

}
