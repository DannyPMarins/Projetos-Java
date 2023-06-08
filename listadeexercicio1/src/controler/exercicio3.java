package controler;

import util.Teclado;

public class exercicio3 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente
		 * em Reais. Considere U$1,00 = R$5,42.
		 */
		//Variável
		double d, r;
		//Entrada de Dados
		r = Teclado.lerDouble("Informe o valor dos reais: ");
		//Processamento de Dados
		d = r*5.42;
		//Saída de Dados
		System.out.println("O valor de " + r + "reais em dollares é: " + d);
	}

}
