package L501;

import util.Teclado;

public class L503Q08 {
	
	/*
	 * 8)	Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa,
	 *      sexo e idade, e exiba o nome inteiro das pessoas que são do sexo masculino 
	 *      e possuem 21 anos ou mais.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, sexo;
		int idade;
		
		for (int cont = 0 ; cont <= 20 ; cont++ ) {
			nome = Teclado.lerTexto("Qual é o seu nome inteiro?");
			sexo = Teclado.lerTexto("Qual é o seu sexo?");
			idade = Teclado.lerInt("Qual é a sua idade?");
		
		if ( ( sexo.equals("masculino") ) && (idade >= 21) ){
			System.out.println("NOME COMPLETO: " + nome);
					
			}
	}

  }
}