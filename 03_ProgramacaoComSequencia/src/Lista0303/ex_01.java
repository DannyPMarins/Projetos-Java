package Lista0303;

import util.Teclado;

public class ex_01 {
	/*
	 *1} 	Elaborar um programa de computador que pergunte ao usuário o valor do Raio de um círculo e
	 * 		calcule a área do referido círculo, apresentando o resultado deste cálculo.
			Obs: A fórmula da área é a=πr^2. Considere o valor de π=3.14159265.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, a;
		
		r = Teclado.lerDouble("Digite o valor do raio do circulo:");
		
		a = Math.PI * Math.pow(r, 2);
		
		System.out.println("A area do circulo é " + a);

	}

}
