package controller;

import util.Teclado;

public class ex_07 {
	/*
	 * 7)	Fazer um algoritmo que pergunte 3 n�meros e apresente a m�dia aritm�tica entre estes 3 n�meros.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3, media;
		
		num1 = Teclado.lerDouble("Digite um numero real:");
		num2 = Teclado.lerDouble("Digite o segundo numero: ");
		num3 = Teclado.lerDouble("Digite o ter�eiro numero: ");
		
		media = (num1 + num2 + num3) / 3;
		
		System.out.println("A media dos tres numeros � " + media);
		

	}

}
