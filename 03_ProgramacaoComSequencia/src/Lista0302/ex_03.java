package Lista0302;

import util.Teclado;

public class ex_03 {
	/*
	 * 3)Desenvolver um programa que pergunte ao usu�rio o seu peso (em quilos) e sua altura (em metros).
	 * Ao final o programa dever� exibir na tela para o usu�rio o valor do peso informado em gramas e a altura em cent�metros.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double metros, kg, gramas, cent;
		
		kg = Teclado.lerDouble("Informe o seu peso em Kg: ");
		metros = Teclado.lerDouble("Informe a sua alture em metros: ");
		
		gramas = kg * 1000;
		cent = metros * 100;
		
		System.out.println("Seu peso em gramas �: " + gramas + " e a sua altura em centimetros �: " + cent);
		

	}

}
