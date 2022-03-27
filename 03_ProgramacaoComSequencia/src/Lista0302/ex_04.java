package Lista0302;

import util.Teclado;

public class ex_04 {
	/*
	 * 4)	Desenvolver um programa que pergunte ao usuário o seu peso e sua altura.
	 * Ao final o programa deverá exibir na tela o valor do índice de massa corporal desta pessoa (IMC).
	 * Fórmula:  IMC = peso / altura2  -  Obs: peso em quilos e altura em metros.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, imc;
		
		peso = Teclado.lerDouble("Qual é o seu peso em kg:");
		altura = Teclado.lerDouble("Qual é a sua altura em metros:");
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.println("O seu IMC é: " + imc);
	}

}
