package Lista0302;

import util.Teclado;

public class ex_05 {
	/*
	 * 5)Fazer um algoritmo que pergunte dois n�meros e ao final apresente os seguintes valores: 
	 * a soma dos dois n�meros, a subtra��o do primeiro pelo segundo n�mero, a subtra��o do segundo pelo primeiro n�mero,
	 *  a multiplica��o entre os dois n�meros, a divis�o do primeiro pelo segundo n�mero, 
	 *  e tamb�m o resto da divis�o do primeiro pelo segundo n�mero.
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
		
		System.out.println("A soma dos dois numeros �: " + soma);
		System.out.println("A subtra��o do primeiro numero pelo segundo �: " + sub1);
		System.out.println("A subtra��o do segundo numero pelo primeiro �: " + sub2);
		System.out.println("A multiplica��o entre os dois  numeros � " + mult);
		System.out.println("A divis�o do primeiro numero pelo segundo � :" + div);
		System.out.println("O resto da divis�o do primeiro numero pelo segundo �: " + rest);

	}

}
