package ufv.dis.galvez;

import java.util.ArrayList;

import ufv.dis.galvez.Usuario;

public class Lista {

private ArrayList <Usuario> usuarios;
	
	public Lista() {
		
		usuarios = new ArrayList<Usuario>();
		
	}
	
	public void addUsuario(Usuario u) {
		usuarios.add(u);
	}
	
	public int getListSize() { //metodo para saber el tamaño de la lista (test comprueba si se ha añadido)
		return usuarios.size();
	}

	
}
