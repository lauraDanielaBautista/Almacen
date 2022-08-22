package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Envasados;
import modelo.Juridica;
import modelo.Natural;
import modelo.Perecederos;
import modelo.Persona;
import modelo.Productos;
import modelo.Refigerados;

public class ControllerProducto {
	
	Productos producto = new Productos();
	Envasados envasados = new  Envasados();
	Perecederos perecederos = new Perecederos();
	Refigerados refijerados = new Refigerados();
	

	
	static List<Object> todos = new ArrayList();
	static List<Productos> pro = new ArrayList();
	static List<Envasados> enva = new ArrayList();
	static List<Perecederos> pere = new ArrayList();
	static List<Refigerados> refi = new ArrayList();
	
	
	
	//metodo para agregar productos
	public boolean agregarProducto (Productos producto){
		pro.add(producto);
		System.out.print("Lista" + pro);
		return true;
		
		
	}
	
	// metodo para agregar productos envasados
		public boolean agregarProductoEnvasado(Envasados envasados) {
			enva.add(envasados);
			System.out.print("Lista" + enva);
			return true;

		}
		
	// metodo para agregar productos perecederos
		public boolean agregarProductoPerecedero(Perecederos perecederos) {
			pere.add(perecederos);
			System.out.print("Lista" + pere);
			return true;

		}
		
	// metodo para agregar productos refijerados
		public boolean agregarProductoRefijerado(Refigerados refijerados) {
			refi.add(refijerados);
			System.out.print("Lista" + refi);
			return true;

		}
		
		
		public List<Productos> buscarProductos(int codigo) {

			System.out.println("lista" + pro);
			
			for(Productos productobuscado : pro) {
				if (!productobuscado.equals(codigo)) {
					JOptionPane.showMessageDialog(null, "se encontro el producto" + productobuscado);
				} else {
					JOptionPane.showMessageDialog(null, "NOO se encontro el producto");
				}
			}
				
			
			
			return pro;
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
		public Refigerados eliminarProductosRefijerados(int codigoAprobacion){
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
		public List<Refigerados> obtenerRefijerados(){
			return refi;
			
	}

}
