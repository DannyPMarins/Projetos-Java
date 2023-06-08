package controller;

import util.Teclado;

public class praticar01 {

	public static void main(String[] args) {
		
		int n1;
		
		System.out.println("Par ou Impar?");
		
		n1 = Teclado.lerInt("Digite um numero: ");
		
		if(n1 %2 == 0) {
			System.out.println("Esse numero é par");
		}else {
			System.out.println("Esse numero é impar");
		}

	}

}
