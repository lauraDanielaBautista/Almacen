package modelo;

public class Perecederos {
	
	int id;
	String fechaVencimiento;
	
	
	public Perecederos(int id, String fechaVencimiento) {
		super();
		this.id = id;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	

	public Perecederos() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	

}
