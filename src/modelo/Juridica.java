package modelo;

public class Juridica {

	int nit;
	int numeroTributario;

	public Juridica(int nit, int numeroTributario) {
		super();
		this.nit = nit;
		this.numeroTributario = numeroTributario;
	}

	public Juridica() {
		super();
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public int getNumeroTributario() {
		return numeroTributario;
	}

	public void setNumeroTributario(int numeroTributario) {
		this.numeroTributario = numeroTributario;
	}

}
