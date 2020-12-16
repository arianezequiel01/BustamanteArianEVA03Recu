package apellido.nombreDNI;

import java.util.ArrayList;

public class Reporte implements ITienda{

	private Double totalVentas;
	private Double totalIva;
	private Double totalNeto;
	
	private ArrayList<Integer> ventas = new ArrayList<Integer>();
	
	public String imprimirReporte() {
		//formato de impresion es totalVenta-totalIva-totalNeto
		
		return this.totalVentas+"-"+this.totalIva+"-"+this.totalNeto;
	}
	
	@Override
	public void vender(Integer idProducto) {
		ventas.add(idProducto);
		
	}	
	
	public Double obtenerNeto() {
		double totalNeto = 0;
		
		for(Integer idProducto: ventas) {
			totalNeto +=  
			
		}
		return totalNeto;
		
		
	}
	
	public Double obtenerIva() {
		double totalIva = 0;	
		for(Producto producto: ventas) {
			totalIva += producto.getPrecio()*0.21;
		}
		return totalIva;		
		
	}


	public Double getTotalVentas() {
		return (double) ventas.size();
	}


	public void setTotalVentas(Double totalVentas) {
		this.totalVentas = totalVentas;
	}


	public Double getTotalIva() {
		return totalIva;
	}


	public void setTotalIva(Double totalIva) {
		this.totalIva = totalIva;
	}


	public Double getTotalNeto() {
		return totalNeto;
	}


	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}



	@Override
	public Reporte cierreZ() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}