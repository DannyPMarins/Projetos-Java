package controller;

import util.Teclado;

public class L701Q10 {
	
	/*
	 * 10)	Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome,
	 * 	    telefone e endereço de 5 pessoas. Em seguida peça ao usuário para digitar um
	 *      número de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no número
	 *      informado.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome[] = new String[5];
		String endereco[] = new String[5];
		int telefone[] = new int[5];
		int num;
		
		for(int cont = 0; cont < 5; cont++) {
				nome[cont] = Teclado.lerTexto("Informe o nome:");
				telefone[cont] = Teclado.lerInt("Informe o numero de telefone:");
				endereco[cont] = Teclado.lerTexto("Informe o endereço:"); 
				System.out.println("--------------------------");
			}
		num = Teclado.lerInt("Digite um numero de 1 a 5 para exibir a pessoa correspondente:");
		
		if (num >= 1 && num <= 5 ) {
			System.out.println("Pessoa cadastrada na posição " + num + ": ");
			System.out.println("Nome: " + nome[num-1]);
			System.out.println("Telefone: " + telefone[num-1]);
			System.out.println("Endereço: " + endereco[num-1]);
		}else {
			System.out.println("Numero não corresponde a posição do vetor.");
		}
	}

}
