import java.util.Enumeration;
import java.util.Hashtable;



public class Galpon {
	private String localidad;
	private Hashtable<Producto,Integer> productos;
	
	public Galpon(String l){
		localidad = l;
		productos = new Hashtable<Producto, Integer>();
	}
	
	public boolean sos(String l){
		return localidad.equalsIgnoreCase(l);
	}
	
	public void agregarProducto(Producto p, int cant){
		/*Integer hay = productos.get(p);
		if(hay != null)
			hay += cant;
		else
			hay = cant;
		productos.put(p, hay );*/
		
		if(productos.containsKey(p))
			cant += productos.get(p);
		
		productos.put(p, cant);
		
	}
	
	public int getStockVal(){
		
		Enumeration<Producto> ep = productos.keys();
		int tot=0;
		Producto p;
		while(ep.hasMoreElements()){
			p = ep.nextElement();
			tot += p.getPrecio() * productos.get(p);
		}
		return tot;
	}
	
	public void elimPorStock(){
		Enumeration<Producto> ep = productos.keys();
		Producto p;
		while(ep.hasMoreElements()){
			p = ep.nextElement();
			if(productos.get(p)< p.getStockMin())
				productos.remove(p);
		}
	}

}
