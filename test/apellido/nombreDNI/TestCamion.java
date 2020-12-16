package apellido.nombreDNI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import apellido.nombreDNI.Camion;
import apellido.nombreDNI.Producto;
import apellido.nombreDNI.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
		Camion camion1 = new Camion("jui467");
		Producto cama = new Producto(1, 2000.00, "Cama 2 plazas", 40.00);
		
		camion1.cargarProducto(cama);
		Integer ve = 1;
		
		assertEquals(ve, camion1.cantidadDeProductos());
		
		
	
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() {
		Camion camion1 = new Camion("jui467");
		Producto cama = new Producto(1, 2000.00, "Cama 2 plazas", 40.00);
		Producto cama2 = new Producto(2, 3000.00, "Cama 1 1/2 plazas", 30.00);
		
		camion1.cargarProducto(cama);
		camion1.cargarProducto(cama2);
		camion1.descargarProducto(1);
		Integer ve = 1;
		
		assertEquals(ve, camion1.cantidadDeProductos());
	
	}
	
	//obligatorio
	@Test
	
	public void queDescargueUnProductoInexistenteLanceUnaException() {
	
	
	}
	
}
