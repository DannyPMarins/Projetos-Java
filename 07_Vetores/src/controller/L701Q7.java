package controller;

import util.Teclado;

public class L701Q7 {
	
	/*
	 * 7)	Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por extenso dos dias da semana.
	 * 	    Em seguida pergunte ao usuário um número e apresente o dia correspondente ao número no vetor, ou exiba a
	 *      mensagem “Número não corresponde a um dia da semana.”
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String semana[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"	};
		
		int num;
		
		num = Teclado.lerInt("Informe um numero correspondenta ao dia da semana: ");
		
		if( num >= 1 && num <= 7) {
			System.out.println(semana[num-1]);
		}else {
			System.out.println("Número não corresponde a um dia da semana.");
		}
		
		

	}

}
