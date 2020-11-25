package ar.edu.unlam.pb2202002c.eva03;


public class Camion extends Vehiculo implements Imultable{
	
	private Integer cantidadDeEjes;
	
	public Camion(String p,Integer c) {
		super(p,0,80);
		this.setCantidadDeEjes(c);
	}


	@Override
	public Boolean enInfraccion() {
		if(velocidadActual>limiteVelocidad) {
			return true;
		}
		return false;
	}

	@Override
	public void incrmentarVelocidad(Integer Velocidad) {
	 this.velocidadActual=Velocidad;
		
	}


	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}


	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	
}
