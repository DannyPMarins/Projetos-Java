package controller;

import util.Teclado;

public class L601Q7 {
	
	/*
	 * 7)	Elabore um programa que pergunte dois números e também qual operação a ser realizada com estes 
	 *      dois números de acordo com a tabela abaixo (esta tabela deve aparecer como menu de escolha para 
	 *      o usuário). Caso o usuário digite um código que não esteja na tabela, informar que o código inserido
	 *      está errado.

			Código	Operação
			a	Média aritmética entre os números digitados
			b	Diferença do maior pelo menor
			c	Produto entre os números digitados
			d	Divisão do primeiro pelo segundo

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String codigo;
		double n1, n2, media, diferenca;
		
		
		n1 = Teclado.lerDouble("Informe um numero:");
		n2 = Teclado.lerDouble("Informe outro numero:");
		
		System.out.println("Código	|  Operação");
		System.out.println("  a	    | Média aritmética entre os números digitados");
		System.out.println("  b	    | Diferença do maior pelo menor");
		System.out.println("  c	    | Produto entre os números digitados");
		System.out.println("  d	    | Divisão do primeiro pelo segundo");
		
		codigo = Teclado.lerTexto("Informe o codigo desejado:");
		
		switch ( codigo ) {
		
		case "a":
			media = (n1 + n2) / 2;
			System.out.println("A Média aritmética entre os números digitados é: " + media);
			break;
			
		case "b":
			if (n1 > n2) {
				diferenca = n1 - n2;
			}else {
				diferenca = n2 - n1;
			}
			System.out.println("A diferença do maior numero pelo menor é: " + diferenca);
			break;
		
		case "c":
			System.out.println("O produto entre os dois numeros é: " + (n1 * n2) );
			break;
			
		case "d":
			System.out.println("A divisao do primeiro pelo segundo é " + (n1 / n2));
			break;
			
		default:
			System.out.println("Erro! o codigo inserido não é valido");
			break;

	}

	}
}