package controller;

import util.Teclado;

public class L701Q9 {
	
	/*
	 * 9)	Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor nomes. Em seguida o programa 
	 * 	    deve informar que enquanto o usu�rio responder SIM, ser� pedido que ele digite um nome e o programa 
	 * 		informar� se este nome existe ou n�o no vetor nomes. Em resumo, o programa dever� fazer o seguinte:
	 *      
			�	Solicitar 10 nomes para preencher o vetor nomes
			�	Perguntar se o usu�rio quer fazer uma pesquisa de nomes no vetor nomes.
			�	Se a resposta for SIM, perguntar qual o nome.
			�	Informar se o nome existe ou n�o no vetor nomes.

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomes[] = new String[10];
		String per, per2;
		int total = 0;
		
		for(int cont = 0; cont < 10; cont++) {
			nomes[cont] = Teclado.lerTexto("Informe os nomes do vetor:");
			
		}
		
		
		do {
			per = Teclado.lerTexto("Voce gostaria de fazer uma pesquisa de nomes?   ...respoda sim ou n�o:");
			
				if(per.equals("sim")) {
					per2 = Teclado.lerTexto("Qual � o nome que voce busca?");
					
						for(int cont = 0; cont < 10; cont++) {
							
								if(per2.equals(nomes[cont])) {
									System.out.println(per2 + " foi encontrado na posi��o " + cont + " do vetor nomes");
									total++;
								}
						}
						
						if(total == 0) {
							System.out.println(per2 + " N�o foi encontrado no vetor");
						}
				}else {
					System.out.println("Fim do programa.");
				}
				
				total = 0;
		}while(per.equals("sim"));
				
	}
}
