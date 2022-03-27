package controller;

import util.Teclado;

public class ex_03 {
	/*
	 * 3)	Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. Considere U$1,00 = R$5,24.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dolar, resultado, conver;
		
		conver = 5.24;
		
		dolar = Teclado.lerDouble("Digite quantos dolares voce gostaria de converter para real: ");
		
		resultado = dolar * conver;
		
		System.out.println("Sua converção é de R$" + resultado);
		
		
		

	}

}
