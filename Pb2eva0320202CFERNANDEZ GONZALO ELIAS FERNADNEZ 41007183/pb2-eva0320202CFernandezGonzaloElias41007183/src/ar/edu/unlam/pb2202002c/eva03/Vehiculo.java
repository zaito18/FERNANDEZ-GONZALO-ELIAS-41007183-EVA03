package ar.edu.unlam.pb2202002c.eva03;

public abstract class Vehiculo implements Comparable<Vehiculo>,Imultable{

	protected String Patente;
	protected Integer velocidadActual;
	protected Integer limiteVelocidad;

	public Vehiculo (String p,Integer v,Integer l) {
		this.Patente=p;
		this.velocidadActual=v;
		this.limiteVelocidad=l;
	}
	
	public String getPatente() {
		return Patente;
	}

	public void setPatente(String patente) {
		Patente = patente;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}

	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}

	public abstract void incrmentarVelocidad(Integer Velocidad)
	;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Patente == null) ? 0 : Patente.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (Patente == null) {
			if (other.Patente != null)
				return false;
		} else if (!Patente.equals(other.Patente))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Vehiculo o) {
		return this.Patente.compareToIgnoreCase(o.getPatente());
	}
	
}
