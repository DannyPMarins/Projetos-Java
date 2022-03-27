package Lista0302;

import util.Teclado;

public class ex_10 {
	/*
	 * 10)	Escreva um algoritmo pergunte o número total de eleitores de um município, o número de votos brancos, 
	 * 		nulos e válidos e apresente como resposta o percentual que cada um representa em relação ao total de eleitores.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalEleitores, votosBranco, votosNulos, votosValidos, brancoP, nulosP;
		
		totalEleitores = Teclado.lerInt("Qual foi o total de eleitores?");
		votosBranco = Teclado.lerInt("Qual foi o total de votos em branco?");
		votosNulos = Teclado.lerInt("Qual é o total de votos nulos?");
//		votosValidos = Teclado.lerInt("Qual é o total de votos validos?");
		
		votosValidos = totalEleitores - votosBranco - votosNulos;
		
		brancoP = 100 * votosBranco / totalEleitores;
		System.out.println("A porcentagem de votos em branco é " + brancoP + "% ");
		
		nulosP = 100 * votosNulos / totalEleitores;
		System.out.println("A porcentagem de votos em nulos é " + nulosP + "% ");
		
		

	}

}
