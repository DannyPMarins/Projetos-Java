package Lista0303;

import util.Teclado;

public class ex_05 {
	/*
	 * Fazer um algoritmo que calcule e apresente o valor do volume de uma lata de
	 * óleo, utilizando a fórmula v = π*r^2*h . Onde v=Volume, π=3.14159265, r = raio
	 * e h = altura.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v, r, h;
		
		r = Teclado.lerDouble("Digite o valor do raio:");
		h = Teclado.lerDouble("Digite o valor da altura: ");
		
		v = Math.PI * Math.pow(r, 2) * h;
		
		System.out.println("O volume da lata de oleo é de " + v);

	}

}
