package classes;

public class Users {
	private String usuarios;
	private String clave;
	private String conclave;
	private String nombre;
	private String apellido;
	private String numero_telefono;
	private String email;

	public Users(String usuarios, String clave, String conclave, String nombre, String apellido, String numero_telefono, String email) {
			

		this.usuarios = usuarios;
		this.clave = clave;
		this.conclave = conclave;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero_telefono = numero_telefono;
		this.email = email;
	}

	
	public Users() {

	}

	public String getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getConclave() {
		return conclave;
	}

	public void setConclave(String conclave) {
		this.conclave = conclave;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
