package modelo;

public class Ventas {

	int codigo;
	int total;
	float iva;
	String fecha;
	int codigo_detalle;

	public Ventas() {
		super();
	}

	public Ventas(int codigo, int total, float iva, String fecha, int codigo_detalle) {
		super();
		this.codigo = codigo;
		this.total = total;
		this.iva = iva;
		this.fecha = fecha;
		this.codigo_detalle = codigo_detalle;
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

	public int getCodigo_detalle() {
		return codigo_detalle;
	}

	public void setCodigo_detalle(int codigo_detalle) {
		this.codigo_detalle = codigo_detalle;
	}

}
