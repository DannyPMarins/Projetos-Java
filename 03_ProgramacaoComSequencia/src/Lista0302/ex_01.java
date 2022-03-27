package Lista0302;

import util.Teclado;

public class ex_01 {
	
	/*
	 * 1)	Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante e
	 *  exiba como resposta o valor com o acréscimo dos 10% da gorjeta do garçom.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor, acre;
		
		valor = Teclado.lerDouble("Digite o valor da conta: ");
		acre = valor * 1.10;
		
		System.out.println("O valor da conta com os 10% é: " + acre);

	}

}
