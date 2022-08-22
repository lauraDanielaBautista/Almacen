package modelo;

public class Envasados {
	int id;
	int peso;
	String fechaEnvasado;
	String origen;

	public Envasados(int id, int peso, String fechaEnvasado, String origen) {
		super();
		this.id = id;
		this.peso = peso;
		this.fechaEnvasado = fechaEnvasado;
		this.origen = origen;
	}

	public Envasados() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
