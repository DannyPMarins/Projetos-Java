package controller;

import util.Teclado;

public class L601Q7 {
	
	/*
	 * 7)	Elabore um programa que pergunte dois n�meros e tamb�m qual opera��o a ser realizada com estes 
	 *      dois n�meros de acordo com a tabela abaixo (esta tabela deve aparecer como menu de escolha para 
	 *      o usu�rio). Caso o usu�rio digite um c�digo que n�o esteja na tabela, informar que o c�digo inserido
	 *      est� errado.

			C�digo	Opera��o
			a	M�dia aritm�tica entre os n�meros digitados
			b	Diferen�a do maior pelo menor
			c	Produto entre os n�meros digitados
			d	Divis�o do primeiro pelo segundo

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String codigo;
		double n1, n2, media, diferenca;
		
		
		n1 = Teclado.lerDouble("Informe um numero:");
		n2 = Teclado.lerDouble("Informe outro numero:");
		
		System.out.println("C�digo	|  Opera��o");
		System.out.println("  a	    | M�dia aritm�tica entre os n�meros digitados");
		System.out.println("  b	    | Diferen�a do maior pelo menor");
		System.out.println("  c	    | Produto entre os n�meros digitados");
		System.out.println("  d	    | Divis�o do primeiro pelo segundo");
		
		codigo = Teclado.lerTexto("Informe o codigo desejado:");
		
		switch ( codigo ) {
		
		case "a":
			media = (n1 + n2) / 2;
			System.out.println("A M�dia aritm�tica entre os n�meros digitados �: " + media);
			break;
			
		case "b":
			if (n1 > n2) {
				diferenca = n1 - n2;
			}else {
				diferenca = n2 - n1;
			}
			System.out.println("A diferen�a do maior numero pelo menor �: " + diferenca);
			break;
		
		case "c":
			System.out.println("O produto entre os dois numeros �: " + (n1 * n2) );
			break;
			
		case "d":
			System.out.println("A divisao do primeiro pelo segundo � " + (n1 / n2));
			break;
			
		default:
			System.out.println("Erro! o codigo inserido n�o � valido");
			break;

	}

	}
}