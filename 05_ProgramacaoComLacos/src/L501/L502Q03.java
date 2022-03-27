package L501;

import util.Teclado;

public class L502Q03 {
	
	/*
	 * 3)	Desenvolver um programa que apresente o total da soma dos cinco primeiros números inteiros.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 1, soma = 0;
		
		
		do {
			soma = soma + n1;
			n1 ++;
		} while(n1 <= 5);
		
		System.out.println("O total de 1 á 5 é: " + soma);
	}

}
