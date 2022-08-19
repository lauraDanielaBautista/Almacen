package modelo;

public class Persona {
	
	int identificacion;
	String nombre;
	String apellido;
	String direccion;
	String telefono;
	
	public Persona (int identificacion, String nombre, String apellido, String direccion, String telefono) {
		 this.identificacion = identificacion;
		 this.nombre = nombre;
		 this.apellido = apellido;
		 this.direccion = direccion;
		 this.telefono = telefono; 

	 }
	
	public Persona(){
		
	}
	
	//natural
	public Persona (String email, String fechaNacimiento) {
		
	}
	//juridica
	public Persona(int nit, int numeroTributario){
		
	}
	
	 // metodos 
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

	
}
