package controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Juridica;
import modelo.Natural;
import modelo.Persona;

public class ControllerPersona {

	Persona persona = new Persona();
	Juridica juridica = new Juridica();
	Natural natural = new Natural();

	static List<Object> todos = new ArrayList();
	static List<Persona> per = new ArrayList();
	static List<Juridica> juri = new ArrayList();
	static List<Natural> natu = new ArrayList();

	// metodo para agregar personas
	public boolean agregarPersona(Persona persona) {

		per.add(persona);

		System.out.println("Lista" + per);
		return true;

	}

	// metodo para agregar personas juridicas
	public boolean agregarPersonaJuridica(Juridica juridica) {
		juri.add(juridica);
		System.out.println("Lista" + juri);
		return true;

	}

	// metodo para agregar personas Naturales
	public boolean agregarPersonaNatural(Natural natural) {
		natu.add(natural);
		System.out.println("Lista" + natu);
		return true;

	}

	// metodo para eliminar personas
	public Persona eliminarPersona(int identificacion) {
		return per.remove(persona.getIdentificacion());
	}

	// metodo para elminiar juridica
	public Juridica eliminarPersonaJuridica(int nit) {
		return juri.remove(juridica.getNit());
	}

	// metodo para eliminar persona natural
	public Natural eliminarPersonaNatural(String email) {
		return natu.remove(Integer.parseInt(natural.getEmail()));
	}

	// metodo para buscar persona
	public List<Persona> buscarpersona(int identificacion) {

		System.out.println("lista" + per);
		
		for(Persona personabuscada : per) {
			if (!personabuscada.equals(identificacion)) {
				JOptionPane.showMessageDialog(null, "se encontro la persona" + personabuscada);
			} else {
				JOptionPane.showMessageDialog(null, "NOO se encontro la persona");
			}
		}
			
		
		
		return per;
	}

	// listar personas
	public List<Persona> obtenerPersona() {
		return per;

	}

	// listar personas juridicas
	public List<Juridica> obtenerPersonaJuridica() {
		return juri;

	}

	// listar personas naturales
	public List<Natural> obtenerPersonaNatural() {
		return natu;

	}
}