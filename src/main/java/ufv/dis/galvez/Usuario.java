package ufv.dis.galvez;

public class Usuario {
	
	String nombre;
	String ape;
	String email;
	int DNI;
	int fnac;
	
	public Usuario(String nombre, String ape, String email, int dNI, int Fnac) {
		super();
		this.nombre = nombre;
		this.ape = ape;
		this.email = email;
		DNI = dNI;
		fnac = Fnac;
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

	public int getFnac() {
		return fnac;
	}

	public void setFnac(int fnac) {
		this.fnac = fnac;
	}

	public boolean IsAdult() { //metodo para comprobar edad
		return fnac >= 2001; //devuelve verdadero o falso
	}

}
