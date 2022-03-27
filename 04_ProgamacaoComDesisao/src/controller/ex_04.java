package controller;

import util.Teclado;

public class ex_04 {
	/*
	 * 4) Desenvolver um programa que pergunte um valor numérico inteiro e faça a
	 * exibição desse valor caso seja divisível por 4 e 5. Não sendo divisível por 4
	 * e 5, o programa deverá exibir a mensagem “Valor não é divisível por 4 e 5”.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, div4, div5;
		
		n1 = Teclado.lerInt("Digite um numero:");
		
		div4 = n1 % 4;
		div5 = n1 % 5;
		
		if (div4 == 0 && div5 == 0 ) {
			 System.out.println("Esse numero é divisivel por 4 e 5.");
		}else {
			System.out.println("Esse numero NÃO é divisivel por 4 e 5");
		}
		
		

	}

}
