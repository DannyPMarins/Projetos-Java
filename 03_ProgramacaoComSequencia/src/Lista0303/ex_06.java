package Lista0303;

import util.Teclado;

public class ex_06 {
	/*
	 * 6) Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos
	 * valores, de forma que a variável a passe a possuir o valor da variável b, e
	 * que a variável b passe a possuir o valor da variável a, e apresente os
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
		
		System.out.println("O valor de a é: " + a);
		System.out.println("O valor de b é: " + b);
		
		

	}

}
