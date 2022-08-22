package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.DetallesVenta;
import modelo.Juridica;
import modelo.Persona;
import modelo.Productos;
import modelo.Ventas;

public class ControllerVentas {
	
	Ventas ventas = new Ventas();
	DetallesVenta detallesVenta = new DetallesVenta();
	
	static List<Object> todos = new ArrayList();
	static List<Ventas> ven = new ArrayList();
	static List<DetallesVenta> deta = new ArrayList(); 
	
	//metodo para agregar venta
		public boolean agregarVenta(Ventas ventas){
			ven.add(ventas);
			System.out.print("Lista" + ven);
			return true;
			
			
		}
	
			
	// metodo para agregar el detalle de la venta 
			public boolean agregarDetallesVenta(DetallesVenta detallesVenta) {
				deta.add(detallesVenta);
				System.out.print("Lista" + deta);
				return true;

			}
			
			
	// metodo para eliminar una venta
		public Ventas eliminarVentas(int codigo) {
				return ven.remove(ventas.getCodigo());
			}
			
	// metodo para eliminar un detalle de una  venta
		public DetallesVenta eliminarDetallesVenta(int codigo_detalle) {
			return deta.remove(detallesVenta.getCodigo_detalle());
			}
			
			
		// listar ventas
		public List<Ventas> obtenerVentas() {
			return ven;

		}
		
		// listar detalles de ventas
		public List<DetallesVenta> obtenerDetallesVenta() {
			return deta;

		}
		
}
		