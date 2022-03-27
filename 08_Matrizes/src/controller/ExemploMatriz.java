package controller;

import util.Teclado;

public class ExemploMatriz {
	
	/*
	 * Elaborar um programa de computador que pergunte as 4 notas de cada um dos oito 
	 * alunos de uma turma, e ao final, exiba o relatório de notas de cada um dos oito
       alunos.
 	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notas[][] = new double[8][4];
		
		for (int linha = 0; linha < 8; linha++ ) {
			
			for ( int col = 0; col < 4; col++ ) {
				
				notas[linha][col] = Teclado.lerDouble("Informe a nota " + (col + 1)  + " do aluno: " + (linha + 1) );
				
			}
		}
		
		System.out.println("Relatorios dos alunos: ");
		
			for (int linha = 0; linha < 8; linha++ ) {
				for ( int col = 0; col < 4; col++ ) {
					
					System.out.println("Aluno: " + (linha + 1) + " | Notas " + ( col + 1 ) + notas[linha][col] );
				
				}
			}
	 }

}
