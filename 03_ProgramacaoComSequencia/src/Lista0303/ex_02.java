package Lista0303;

import util.Teclado;

public class ex_02 { 
	/*
	 * 2)	Desenvolver um programa que calcule o salário líquido de um professor. Para elaborar o programa,
		 *  é necessário possuir alguns dados, tais como: 
		 *  Valor da hora aula, número de horas trabalhadas no mês e percentual de desconto do INSS.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pINSS ,horaA , horasM, total1, total2, totalF;
		
		horaA = Teclado.lerDouble("Qual é o valor da hora aula?");
		horasM = Teclado.lerDouble("Qual é o total de horas trabalhadas no mes?");
		pINSS = Teclado.lerDouble("Digite o percentual de desconto do INSS:");
		
		total1 = ( horaA * horasM );
		
		total2 = total1 * pINSS / 100;
		
		totalF = total1 - total2;
		
		System.out.println("O salario liquido de um professor é " + totalF);

		
				

	}

}
