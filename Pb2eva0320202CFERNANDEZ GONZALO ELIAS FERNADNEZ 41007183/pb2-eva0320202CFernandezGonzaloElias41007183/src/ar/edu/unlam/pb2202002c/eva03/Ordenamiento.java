package ar.edu.unlam.pb2202002c.eva03;

import java.util.Comparator;

public class Ordenamiento implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		if((v1.getPatente().compareToIgnoreCase(v2.getPatente())) > 0) {
			return 1;
		}
		if(v1.getPatente().compareToIgnoreCase(v2.getPatente())==0){
			return 0;
		}
		else
			return -1;
		
	}

}