package controller;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Aline", "a123");
//		System.out.println(u1);
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(u1);
// Add usuarios de duas formas	
		
		usuarios.add(new Usuario("fabs","1234"));
		usuarios.add(new Usuario("jorge", "5432"));
		usuarios.add(new Usuario("leo","4709"));		
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios);
		
		usuarios.remove(1);
		System.out.println(usuarios.get(2));
	}
	
	
}
