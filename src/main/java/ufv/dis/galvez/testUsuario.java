package ufv.dis.galvez;

import static org.junit.Assert.*;

import org.junit.Test;

import ufv.dis.galvez.Lista;
import ufv.dis.galvez.Usuario;

public class testUsuario {

	@Test
	public void instanciarUsuario() {
		
		Usuario u = new Usuario ("Lucia", "Galvez", "galvez@hotmail.com", 89172638, 2000);
		assertEquals("Lucia", u.getNombre());
		
	}
	
	
	@Test
	public void addUsuarioLista() {
	
		Usuario u = new Usuario ("Lucia", "Galvez", "galvez@hotmail.com", 89172638, 2000);
		
		Lista lista = new Lista();
		lista.addUsuario(u);
		
		assertEquals(1, lista.getListSize());
	
	}
	
	
	@Test
	public void comprobarMayoriaEdad() {
		
		Usuario u = new Usuario ("Lucia", "Galvez", "galvez@hotmail.com", 89172638, 2000);
		assertEquals(true, u.IsAdult());
		
		Usuario u2 = new Usuario ("Pablo", "Galvez", "galvez@hotmail.com", 89172638, 2003);
		assertEquals(false, u2.IsAdult());
	
	}

}
