package controller;

import util.Teclado;

public class ex_05 {
	/*
	 * 5)	Fazer um programa que pergunte o sal�rio de um funcion�rio e apresente este sal�rio com um aumento de 15%.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario, resul;
		
		salario = Teclado.lerDouble("Digite o seu salario: ");
		
		resul = salario * 1.15;
		
		System.out.println("Seu salario com o aumento de 15% �: " + resul);

	}

}
