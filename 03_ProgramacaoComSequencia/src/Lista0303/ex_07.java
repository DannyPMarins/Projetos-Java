 package Lista0303;

import util.Teclado;

public class ex_07 {
	/*
	 * 7) Fazer um algoritmo que pergunte os valores dos catetos de um triângulo
	 * retângulo e apresente o valor da hipotenusa. Obs: A fórmula é hipotenusa2 =
	 * cateto12 + cateto22 ou, se preferir, hipotenusa = √( cateto12 + cateto22).
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cateto1, cateto2, hipotenusa;
		
		cateto1 = Teclado.lerDouble("Digite o valor do cateto1:");
		cateto2 = Teclado.lerDouble("Digite o valor do cateto2:");
		
		hipotenusa = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("O valor da hipotenusa é: " + hipotenusa);
		

	}

}
