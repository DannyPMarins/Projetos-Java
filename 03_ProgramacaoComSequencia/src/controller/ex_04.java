package controller;

import util.Teclado;

public class ex_04 {
	
	/*
	 * 4)	Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, ant, suc;
		
		num1 = Teclado.lerInt("Digite um numero: ");
		
		ant = num1 - 1;
		suc = num1 + 1;
		
		System.out.println("O antecessor do numero digitado é " + ant + " e o sucessor é " + suc);
	
		
		
		

	}

}
