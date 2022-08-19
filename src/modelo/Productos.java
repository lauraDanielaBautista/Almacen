package modelo;

public class Productos {

	int codigo;
	int valorUnitario;
	int cantidad;
	
	public Productos () {
		
		
	}
	
	// metodo contructor de la clase productos 
	public Productos(int codigo, int valorUnitario, int cantidad) {
		super();
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}


	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
