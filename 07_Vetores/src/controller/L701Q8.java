package controller;

import util.Teclado;

public class L701Q8 {
	
	/*
	 * 8)	Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos, calcule e armazene a m�dia, 
	 *      armazene tamb�m a situa��o do aluno (AP ou RP). Exibir ao final uma listagem contendo nomes, notas, m�dias
	 *      e situa��o de cada aluno.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pr1[] = new double[15];
		double pr2[] = new double[15];
		
		double soma;
		String situacao, nome;
		
		for (int cont = 1; cont <= 15; cont++) {
			nome = Teclado.lerTexto("Informe o seu nome:");
			pr1[cont] = Teclado.lerDouble("Informe a nota PR1 do aluno: ");
			pr2[cont] = Teclado.lerDouble("Informe a nota PR2 do aluno: ");
			
			soma = (pr1[cont] + pr2[cont]) / 2;
			
			if ( soma < 7) {
				situacao = "Reprovado";
				System.out.println("A sua situa��o � " + situacao);
			}else {
				situacao = "Aprovado";
				System.out.println("A sua situa��o � " + situacao);
			}
			
			System.out.println("-----" + nome + "-----" );
			System.out.println("Nota PR1: " + pr1[cont]);
			System.out.println("Nota PR2: " + pr2[cont]);
			System.out.println("A sua media � " + soma);
			System.out.println("A sua situa��o � " + situacao);
			System.out.println("----------------");
		}
	}

}
