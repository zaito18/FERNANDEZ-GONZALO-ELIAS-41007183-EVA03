package ar.edu.unlam.pb2202002c.eva03;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Autopista {

	private HashMap <Integer,Vehiculo> telapase=new HashMap<Integer, Vehiculo>();
	private HashSet <Vehiculo> vehiculosEnCirculacion=new HashSet<Vehiculo>();
	
	public Autopista() {
		
	}
	
	public void registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
			this.telapase.put(numeroTelpase, vehiculo);
	}
	
	public HashMap<Integer, Vehiculo> getTelapase() {
		return telapase;
	}

	public void setTelapase(HashMap<Integer, Vehiculo> telapase) {
		this.telapase = telapase;
	}

	public HashSet<Vehiculo> getVehiculosEnCirculacion() {
		return vehiculosEnCirculacion;
	}

	public void setVehiculosEnCirculacion(HashSet<Vehiculo> vehiculosEnCirculacion) {
		this.vehiculosEnCirculacion = vehiculosEnCirculacion;
	}

	public Boolean ingresarAutopista (Integer numeroTelepase) throws VehiculoNotFounException {
		if(!telapase.containsKey(numeroTelepase)) {
			throw new VehiculoNotFounException("El telepase no esta registrado");
		}else
			vehiculosEnCirculacion.add(telapase.get(numeroTelepase));
			return true;
	}
	
	public void salirAutpista (Vehiculo vehiculo)throws VehiculoNotFounException {
		if(vehiculosEnCirculacion.contains(vehiculo)) {
			vehiculosEnCirculacion.remove(vehiculo);
		}else
			throw new VehiculoNotFounException("El Vehiculo no se encuentra en la autopista");
		
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
		Ordenamiento ordenPorPatente=new Ordenamiento();
		TreeSet<Vehiculo> listaOrdenadaPorPatente=new TreeSet<Vehiculo>(ordenPorPatente);
		for (Vehiculo aux : vehiculosEnCirculacion) {
			if(aux.enInfraccion()==true) {
				listaOrdenadaPorPatente.add(aux);
			}
		}
	return listaOrdenadaPorPatente;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
		return vehiculosEnCirculacion.size();
}
	
	}
