package controller;

import util.Teclado;

public class prova_q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor, desconto;
		
		valor = Teclado.lerDouble("tabela do produto");
		desconto = Teclado.lerDouble("porcentagem do produto");
		
		System.out.println("o valor do desconto é de " + valor * 100 / desconto);
	}

}
