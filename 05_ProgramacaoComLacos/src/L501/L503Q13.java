package L501;

import util.Teclado;

public class L503Q13 {
	
	/*
	 * 13)	Sabendo-se que uma Polegada equivale a 2,54 cent�metros, desenvolver um programa
	 *      que exiba uma tabela de convers�es de polegadas para cent�metros, de 1 polegada at�
	 *      um valor inteiro de polegada inserido pelo usu�rio.
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
