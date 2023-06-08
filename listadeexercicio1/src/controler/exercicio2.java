package controler;

import util.Teclado;

public class exercicio2 {
		/*Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
		*a) Resultado de suas adições
		*b) Resultado de suas multiplicações
		*/

	public static void main(String[] args) {
		// Variável
		int num1, num2, num3, num4, soma, mult;
		//Entrada de Dados
		num1 = Teclado.lerInt("Informe o primeiro número: ");
		num2 = Teclado.lerInt("Informe o segundo número: ");
		num3 = Teclado.lerInt("Informe o terceiro número: ");
		num4 = Teclado.lerInt("Informe o quarto número: ");
		
		//Processamento
		soma = num1 + num2 + num3 + num4;
		mult = num1 * num2 * num3 * num4;
		//Saída de Dados
		System.out.println("O valor da soma é: " + soma);
		System.out.println("O valor da multiplicação é: " + mult);
	}

}
