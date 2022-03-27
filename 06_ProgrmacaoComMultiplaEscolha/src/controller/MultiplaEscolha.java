package controller;

import util.Teclado;

public class MultiplaEscolha {
	
	/*
	 * Programa que pergunte o n� de matr�cula de s�cio de um Clube e
	   exiba o m�s de pagamento da anuidade, conforme a seguinte tabela:
	   
	   N� Final da Matr�cula - M�s de Pagamento
						 0   -   Janeiro
						 1   -   Fevereiro
						 2   -   Mar�o
						 3   -   Abril
					 Outro   -   Final Maio
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matricula, ultimo;
		
		matricula = Teclado.lerInt("Informe o numero da sua matricula: ");
		
		ultimo = matricula % 10;
		//System.out.println("ultimo: " + ultimo);
		
		switch (ultimo) {
		
		case 0:
			System.out.println("Pagamento em Janeiro");
			break;
		
		case 1:
			System.out.println("Pagamento em Fevereiro");
			break;
		
		case 2:
			System.out.println("Pagamento em Mar�o");
			break;
		
		case 3:
			System.out.println("Pagamento em Abril");
			break;
		
		default:
			System.out.println("Pagamento em Maio");
			break;
			
		}

	}

}
