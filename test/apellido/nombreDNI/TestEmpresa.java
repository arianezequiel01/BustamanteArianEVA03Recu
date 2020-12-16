package apellido.nombreDNI;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

import apellido.nombreDNI.Camion;
import apellido.nombreDNI.Empresa;
import apellido.nombreDNI.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
		Empresa empresa1 = new Empresa ("Scania");
		Camion camion1 = new Camion("klj948");
		Camion camion2 = new Camion("uhy471");
		 
		empresa1.agregarCamion(camion1);
		empresa1.agregarCamion(camion2);
		Integer ve = 2;
		
		assertEquals(ve, empresa1.cantidadDeCamiones());		
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		
		
	}


}
