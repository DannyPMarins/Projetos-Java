package Lista0302;

import util.Teclado;

public class ex_10 {
	/*
	 * 10)	Escreva um algoritmo pergunte o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, 
	 * 		nulos e v�lidos e apresente como resposta o percentual que cada um representa em rela��o ao total de eleitores.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalEleitores, votosBranco, votosNulos, votosValidos, brancoP, nulosP;
		
		totalEleitores = Teclado.lerInt("Qual foi o total de eleitores?");
		votosBranco = Teclado.lerInt("Qual foi o total de votos em branco?");
		votosNulos = Teclado.lerInt("Qual � o total de votos nulos?");
//		votosValidos = Teclado.lerInt("Qual � o total de votos validos?");
		
		votosValidos = totalEleitores - votosBranco - votosNulos;
		
		brancoP = 100 * votosBranco / totalEleitores;
		System.out.println("A porcentagem de votos em branco � " + brancoP + "% ");
		
		nulosP = 100 * votosNulos / totalEleitores;
		System.out.println("A porcentagem de votos em nulos � " + nulosP + "% ");
		
		

	}

}
