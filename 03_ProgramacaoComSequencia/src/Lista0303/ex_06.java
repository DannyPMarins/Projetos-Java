package Lista0303;

import util.Teclado;

public class ex_06 {
	/*
	 * 6) Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos
	 * valores, de forma que a vari�vel a passe a possuir o valor da vari�vel b, e
	 * que a vari�vel b passe a possuir o valor da vari�vel a, e apresente os
	 * valores trocados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, aux;
		
		a = Teclado.lerDouble("Digite o valor de a: ");
		b = Teclado.lerDouble("Digite o valor de b: ");
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("O valor de a �: " + a);
		System.out.println("O valor de b �: " + b);
		
		

	}

}
