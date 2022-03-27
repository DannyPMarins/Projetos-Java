package L501;

import util.Teclado;

public class L503Q14 {
	
	/*
	 * 14)	Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 
	 *      15 alunos de uma turma. E exiba a listagem contendo nome, nota1, nota2, 
	 *      média e apresente “APROVADO” se a média for maior ou igual a 5, e “REPROVADO”
	 *       se a média for menor que 5. Ao final, exibir também a média da turma.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, situacao;
		double nota1, nota2, media, mediaTurma, soma = 0;
	
		for ( int cont = 1; cont <= 15; cont++) {
			
				nome = Teclado.lerTexto("Digite o nome do aluno:");
				nota1 = Teclado.lerDouble("Digite o valor da nota 1:");
				nota2 = Teclado.lerDouble("Digite o valor da nota 2:");

				media = (nota1 + nota2) / 2;
				soma = soma + media;
				
				if ( media >= 5) {
					situacao = "Aprovado";
				}else {
					situacao = "Reprovado";
				}
			System.out.println("---Aluno " + cont + "---");
			System.out.println("Aluno " + nome);
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("O aluno esta: " + situacao);
			System.out.println("-------------------------");
		}
		mediaTurma = soma / 15;
		System.out.println("-------------------------");
		System.out.println("Media da turma: " + mediaTurma);
		System.out.println("-------------------------");
	}

}
