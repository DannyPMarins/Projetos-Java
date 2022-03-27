package Lista0302;

import util.Teclado;

public class ex_05 {
	/*
	 * 5)Fazer um algoritmo que pergunte dois números e ao final apresente os seguintes valores: 
	 * a soma dos dois números, a subtração do primeiro pelo segundo número, a subtração do segundo pelo primeiro número,
	 *  a multiplicação entre os dois números, a divisão do primeiro pelo segundo número, 
	 *  e também o resto da divisão do primeiro pelo segundo número.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, soma, sub1, sub2, mult, div, rest;
		
		num1 = Teclado.lerDouble("Digite um numero: ");
		num2 = Teclado.lerDouble("Digite outro numero: ");
		
		soma = num1 + num2;
		sub1 = num1 - num2;
		sub2 = num2 - num1;
		mult = num1 * num2;
		div = num1 / num2;
		rest = num1 % num2;
		
		System.out.println("A soma dos dois numeros é: " + soma);
		System.out.println("A subtração do primeiro numero pelo segundo é: " + sub1);
		System.out.println("A subtração do segundo numero pelo primeiro é: " + sub2);
		System.out.println("A multiplicação entre os dois  numeros é " + mult);
		System.out.println("A divisão do primeiro numero pelo segundo é :" + div);
		System.out.println("O resto da divisão do primeiro numero pelo segundo é: " + rest);

	}

}
