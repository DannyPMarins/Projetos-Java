package controller;

import util.Teclado;

public class ex_06 {
	
	/*
	 * 6)	Fazer um programa que pergunte uma temperatura ao usu�rio, em graus Fahrenheit, e apresente esta temperatura convertida em graus Celsius. 
	 *  A f�rmula da convers�o � c = (f � 32) x 5 : 9 , onde c  � a temperatura em graus Celsius e f  em Fahrenheit.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double f, c;
		
		f = Teclado.lerDouble("Digite os graus em Fahrenheit: ");
		c = (f - 32) * 5 / 9;
		
		System.out.println("A conver��o de " + f + "fahrenheit � de " + c + " graus celsius");

	}

}
