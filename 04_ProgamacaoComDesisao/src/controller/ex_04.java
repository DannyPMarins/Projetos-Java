package controller;

import util.Teclado;

public class ex_04 {
	/*
	 * 4) Desenvolver um programa que pergunte um valor num�rico inteiro e fa�a a
	 * exibi��o desse valor caso seja divis�vel por 4 e 5. N�o sendo divis�vel por 4
	 * e 5, o programa dever� exibir a mensagem �Valor n�o � divis�vel por 4 e 5�.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, div4, div5;
		
		n1 = Teclado.lerInt("Digite um numero:");
		
		div4 = n1 % 4;
		div5 = n1 % 5;
		
		if (div4 == 0 && div5 == 0 ) {
			 System.out.println("Esse numero � divisivel por 4 e 5.");
		}else {
			System.out.println("Esse numero N�O � divisivel por 4 e 5");
		}
		
		

	}

}
