package controller;

import util.Teclado;

public class ex_09 {
	/*
	 * 9) Desenvolver um programa que pergunte um número e exiba a informação de que ele é positivo, negativo ou nulo.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		num = Teclado.lerInt("Digite um numero:");
		
		if (num > 0) {
			System.out.println("Esse numero é positivo!");
		}else if (num == 0) {
			System.out.println("Esse numero é nulo!");
		}else {
			System.out.println("Esse numero é negativo!");
		}

	}

}
