package Lista0303;

import util.Teclado;

public class ex_04 {
	/*
	 * 4)Fazer um algoritmo que pergunte 4 números e apresente a média aritmética ponderada, com pesos respectivos de 1, 2, 3 e 4. 
		Obs: Sabe-se que o cálculo da média aritmética ponderada (mp) é feito da seguinte forma: 
		mp = ( (num1 x peso1) + (num2 x peso2) + (num3 x peso3) + (num4 x peso4) ) / (peso1 + peso2 + peso3 + peso4)

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, n4, mp;
		final double peso1, peso2, peso3, peso4;
		
		n1 = Teclado.lerDouble("Digite o primeiro numero: ");
		n2 = Teclado.lerDouble("Digite o segundo numero: ");
		n3 = Teclado.lerDouble("Digite o terceiro numero: ");
		n4 = Teclado.lerDouble("Digite o quarto numero: ");
		
		peso1 = 1;
		peso2 = 2;
		peso3 = 3;
		peso4 = 4;
		
		mp = ( (n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4) ) / (peso1 + peso2 + peso3 + peso4);
		
		System.out.println("A media aritimetica ponderada é " + mp);
	}

}
