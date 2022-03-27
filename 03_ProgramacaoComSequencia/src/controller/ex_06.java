package controller;

import util.Teclado;

public class ex_06 {
	
	/*
	 * 6)	Fazer um programa que pergunte uma temperatura ao usuário, em graus Fahrenheit, e apresente esta temperatura convertida em graus Celsius. 
	 *  A fórmula da conversão é c = (f – 32) x 5 : 9 , onde c  é a temperatura em graus Celsius e f  em Fahrenheit.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double f, c;
		
		f = Teclado.lerDouble("Digite os graus em Fahrenheit: ");
		c = (f - 32) * 5 / 9;
		
		System.out.println("A converção de " + f + "fahrenheit é de " + c + " graus celsius");

	}

}
