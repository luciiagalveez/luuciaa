package ufv.dis.galvez;

public class Usuario {
	
	String nombre;
	String ape;
	String email;
	int DNI;
	String fnac;
	
	public Usuario(String nombre, String ape, String email, int dNI, String fnac) {
		super();
		this.nombre = nombre;
		this.ape = ape;
		this.email = email;
		DNI = dNI;
		this.fnac = fnac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getFnac() {
		return fnac;
	}

	public void setFnac(String fnac) {
		this.fnac = fnac;
	}
	
	

}
