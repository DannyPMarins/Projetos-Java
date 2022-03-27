package controller;

import util.Teclado;

public class L701Q10 {
	
	/*
	 * 10)	Crie 3 vetores (nomes, telefones, endere�os) e pergunte ao usu�rio o nome,
	 * 	    telefone e endere�o de 5 pessoas. Em seguida pe�a ao usu�rio para digitar um
	 *      n�mero de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no n�mero
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
				endereco[cont] = Teclado.lerTexto("Informe o endere�o:"); 
				System.out.println("--------------------------");
			}
		num = Teclado.lerInt("Digite um numero de 1 a 5 para exibir a pessoa correspondente:");
		
		if (num >= 1 && num <= 5 ) {
			System.out.println("Pessoa cadastrada na posi��o " + num + ": ");
			System.out.println("Nome: " + nome[num-1]);
			System.out.println("Telefone: " + telefone[num-1]);
			System.out.println("Endere�o: " + endereco[num-1]);
		}else {
			System.out.println("Numero n�o corresponde a posi��o do vetor.");
		}
	}

}
