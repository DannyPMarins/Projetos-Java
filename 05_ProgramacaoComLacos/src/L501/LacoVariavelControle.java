package L501;

import util.Teclado;

public class LacoVariavelControle {
	
	/*
	 * Algaritomo para pedir a leitura de um valor para a variavel x, multiplicar esse valor por 3,
	 * colorcar o valor obtido na variavel r, e apresentar o valor de r, repetindo a sequencia 5 vezes. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x, r, cont;
			
			//   ponto de partida do contador ; ponto final do contador; incremento do cont
			for ( cont = 1	; cont <= 5	; cont ++ ) {
				
				x = Teclado.lerInt("Informe o valor da variavel:");
				r = x * 3;
				
				System.out.println(x + " multiplicado por 3 é: " + r);
			}
	}

}
