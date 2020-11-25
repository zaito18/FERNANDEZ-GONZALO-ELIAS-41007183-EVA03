package ar.edu.unlam.pb2202002c.eva03;

public class Automovil extends Vehiculo implements Imultable {

	
	public Automovil(String p) {
		super(p,0,130);
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
	
   
	
}
