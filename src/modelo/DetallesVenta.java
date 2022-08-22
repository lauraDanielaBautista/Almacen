package modelo;

public class DetallesVenta {

	int codigo_detalle;
	int cantidadProductos;
	int subtotal;
	Productos codigo_producto;
	Persona identificacion_persona;

	public DetallesVenta() {

	}

	public DetallesVenta(int codigo_detalle, int cantidadProductos, int subtotal, Productos producto, Persona persona) {
		super();
		this.codigo_detalle = codigo_detalle;
		this.cantidadProductos = cantidadProductos;
		this.subtotal = subtotal;
		this.codigo_producto = producto;
		this.identificacion_persona = persona;
	}

	public int getCodigo_detalle() {
		return codigo_detalle;
	}

	public void setCodigo_detalle(int codigo_detalle) {
		this.codigo_detalle = codigo_detalle;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public Productos getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Productos codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public Persona getIdentificacion_persona() {
		return identificacion_persona;
	}

	public void setIdentificacion_persona(Persona identificacion_persona) {
		this.identificacion_persona = identificacion_persona;
	}

}
