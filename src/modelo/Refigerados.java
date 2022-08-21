package modelo;

public class Refijerados {
	
	int codigoAprobacion;
	float temperatura;
	
	public Refijerados(int codigoAprobacion, float temperatura) {
		super();
		this.codigoAprobacion = codigoAprobacion;
		this.temperatura = temperatura;
	}
	
	

	public Refijerados() {
		super();
	}




	public int getCodigoAprobacion() {
		return codigoAprobacion;
	}
	public void setCodigoAprobacion(int codigoAprobacion) {
		this.codigoAprobacion = codigoAprobacion;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
