package apellido.nombreDNI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Empresa {

	private HashSet<Camion> camiones = new HashSet<Camion>();
	

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota;
	
	

	public Empresa(String nombre) {
		
		this.camiones = camiones;
		this.nombre = nombre;
		this.flota = flota;
	}

	public Empresa() {

	}

	public void agregarCamion(Camion camion) {		
		camiones.add(camion);
		
	}

	public Integer cantidadDeCamiones() {

		return camiones.size();
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		
		
		return null;
	}

}
