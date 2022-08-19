package modelo;

public class Ventas {
	
	int codigo;
	int total;
	float iva;
	String fecha;
	String detalles;
	String cliente;
	int persona_identificacion;
	int producto_codigo;
	
	public Persona persona ;
	
	public Ventas (int codigo, int subtotal, String productoVendido) {
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getPersona_identificacion() {
		return persona_identificacion;
	}
	public void setPersona_identificacion(int persona_identificacion) {
		this.persona_identificacion = persona_identificacion;
	}
	public int getProducto_codigo() {
		return producto_codigo;
	}
	public void setProducto_codigo(int producto_codigo) {
		this.producto_codigo = producto_codigo;
	}
	
	
	

}
