package L501;

import util.Teclado;

public class L503Q13 {
	
	/*
	 * 13)	Sabendo-se que uma Polegada equivale a 2,54 centímetros, desenvolver um programa
	 *      que exiba uma tabela de conversões de polegadas para centímetros, de 1 polegada até
	 *      um valor inteiro de polegada inserido pelo usuário.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pol;
		
		pol = Teclado.lerDouble("Informe o valor de polegada:");
		
		for ( double cont = 1; cont <= pol; cont++) {
			System.out.println("A polegada " + cont + " equivale a " + (cont * 2.54) );
		}
		

	}

}
