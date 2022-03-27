package Lista0303;

import util.Teclado;

public class ex_03 {
	/*
	 * 3) Fazer um programa que pergunte dois valores reais e apresente o primeiro
	 * 	com acréscimo de 30% e o segundo com desconto de 25%.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, an1, an2, n2p;
		
		n1 = Teclado.lerDouble("Digite um numero real");
		n2 = Teclado.lerDouble("Digite outro numero real");
		
		an1 = n1 * 1.30;
		n2p = (n1 * n2 / 100);
		an2 = n2 - n2p;
		
		System.out.println("O valor de " + n1 + " com acrescimo de 30% é " + an1);
		System.out.println("O valor de " + n2 + " com desconto de 25% é de " + an2);
		
		

	}

}
