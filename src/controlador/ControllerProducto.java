package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.Envasados;
import modelo.Juridica;
import modelo.Perecederos;
import modelo.Persona;
import modelo.Productos;
import modelo.Refijerados;

public class ControllerProducto {
	
	Productos producto = new Productos();
	Envasados envasados = new  Envasados();
	Perecederos perecederos = new Perecederos();
	Refijerados refijerados = new Refijerados();
	

	
	public List<Productos> pro = new ArrayList();
	public List<Envasados> enva = new ArrayList();
	public List<Perecederos> pere = new ArrayList();
	public List<Refijerados> refi = new ArrayList();	
	
	
	//metodo para agregar productos
	public boolean agregarProducto (Productos producto){
		pro.add(producto);
		return true;
		
		
	}
	
	// metodo para agregar productos envasados
		public boolean agregarProductoEnvasado(Envasados envasados) {
			enva.add(envasados);
			return true;

		}
		
	// metodo para agregar productos perecederos
		public boolean agregarProductoPerecedero(Perecederos perecederos) {
			pere.add(perecederos);
			return true;

		}
		
	// metodo para agregar productos refijerados
			public boolean agregarProductoRefijerado(Refijerados refijerados) {
				refi.add(refijerados);
				return true;

				}
	// metodo para eliminar producto
	public Productos eliminarProductos(int codigo){
		return pro.remove(producto.getCodigo());
	}
	
	
	// metodo para eliminar productos envasados
		public Envasados eliminarProductosEnvasados(int id){
			return enva.remove(envasados.getId());
		}
	
	// metodo para eliminar productos perecederos
		public Perecederos eliminarProductosPerecederos(int id){
			return pere.remove(perecederos.getId());
		}
			
	// metodo para eliminar productos refijerados
		public Refijerados eliminarProductosRefijerados(int codigoAprobacion){
			return refi.remove(refijerados.getCodigoAprobacion());
		}
		
   //lista productos
	public List<Productos> obtenerProductos(){
		return pro;
		
	}
	
	
	//lista productos envasados
		public List<Envasados> obtenerEnvasados(){
			return enva;
			
	}
		
	 //lista productos perecederos
		public List<Perecederos> obtenerPerecederos(){
			return pere;
			
	}
		
	 //lista productos refijerados
		public List<Refijerados> obtenerRefijerados(){
			return refi;
			
	}

}
