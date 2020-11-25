package ar.edu.unlam.pb220202c.eva03;

import org.junit.Test;
import static org.junit.Assert.*;

import ar.edu.unlam.pb2202002c.eva03.Automovil;
import ar.edu.unlam.pb2202002c.eva03.Autopista;
import ar.edu.unlam.pb2202002c.eva03.Camion;
import ar.edu.unlam.pb2202002c.eva03.VehiculoNotFounException;

public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		Autopista buenayre=new Autopista();
		Camion  camionsito=new Camion("patente123",3);
		
		buenayre.registrarTelepase(3, camionsito);
		Integer telepasesRegistrados=1;
		assertEquals(buenayre.getTelapase().size(),telepasesRegistrados,0.1);
	}
	@Test (expected = VehiculoNotFounException.class)
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() throws VehiculoNotFounException {
		Autopista buenayre=new Autopista();
		Camion  camionsito=new Camion("patente123",3);
		buenayre.salirAutpista(camionsito);
		
	}
	
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		
		Autopista buenayre=new Autopista();
		Camion  camionsito=new Camion("123",3);
		Camion  camionsito1=new Camion("12",5);
		Camion  camionsito2=new Camion("321",7);
		
		camionsito.incrmentarVelocidad(81);
		camionsito1.incrmentarVelocidad(81);
		camionsito2.incrmentarVelocidad(81);
		
		buenayre.registrarTelepase(1, camionsito);
		buenayre.registrarTelepase(2, camionsito1);
		buenayre.registrarTelepase(3, camionsito2);
		try {
		buenayre.ingresarAutopista(1);
		buenayre.ingresarAutopista(2);
		buenayre.ingresarAutopista(3);
		buenayre.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente();
		
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	@Test 
	public void quepuedanIngresarvariosVehiculosDistintos() throws VehiculoNotFounException {
		Autopista buenayre=new Autopista();
		Camion  camionsito=new Camion("patente123",3);
		Camion  scania=new Camion("patente13",2);
		Automovil autito=new Automovil("patente3");
		try {
			buenayre.registrarTelepase(3, camionsito);
			buenayre.registrarTelepase(2, scania);
			buenayre.registrarTelepase(5, autito);
			buenayre.ingresarAutopista(3);
			buenayre.ingresarAutopista(2);
			buenayre.ingresarAutopista(5);
			Integer telepasesRegistrados=3;
			Integer vehiculosEnCirculacion=3;
			assertEquals(buenayre.getTelapase().size(),telepasesRegistrados,0.1);
			assertEquals(buenayre.getVehiculosEnCirculacion().size(),vehiculosEnCirculacion,0.1);
		}catch(VehiculoNotFounException e) {
			System.out.println("no se encuentra el vehiculo que quiere ingresar");
		}
	
	}
	@Test
	public void QueSepuedaSalirDeLaAutopista() throws VehiculoNotFounException {
		Autopista buenayre=new Autopista();
		Camion  camionsito=new Camion("patente123",3);
		
		try {
			buenayre.registrarTelepase(5, camionsito);
			buenayre.ingresarAutopista(5);
			buenayre.salirAutpista(camionsito);
			Integer cantidadDeVehiculosEnAutopista=0;
			assertEquals(buenayre.getVehiculosEnCirculacion().size(),cantidadDeVehiculosEnAutopista,0.1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
