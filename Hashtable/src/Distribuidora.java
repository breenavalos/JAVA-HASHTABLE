import java.util.ArrayList;


public class Distribuidora {
	private ArrayList<Galpon> galpones;
	private ArrayList<Producto> productos;
	
	public Distribuidora () {
		galpones = new ArrayList<Galpon>();
		productos = new ArrayList<Producto>();
	}
	
	public Galpon buscarGalpon(String l){
		int i=0;
		while(i<galpones.size() && !galpones.get(i).sos(l))
			i++;
		if(i==galpones.size())
			return null;
		else
			return galpones.get(i);
	}
	
	public Producto buscarProducto(int  c){
		int i=0;
		while(i<productos.size() && !productos.get(i).sos(c))
			i++;
		if(i==productos.size())
			return null;
		else
			return productos.get(i);
	}
	
	public void agregarGalpon (String l){
		Galpon g = new Galpon(l);
		galpones.add(g);
	}
	
	public void agregarProducto (int c,int pre, int sm){
		Producto p = new Producto(c,pre,sm);
		productos.add(p);
	}
	
	public void agregarProdGalpon(int cp, String lg, int cant){
		//1
		Producto p = this.buscarProducto(cp);
		if(p!=null)
		{
			Galpon g = this.buscarGalpon(lg);
			if(g!=null)
				g.agregarProducto(p, cant);
		}
	}
	
	public int stockValGalpon(String lg){
		//2
		Galpon g=this.buscarGalpon(lg);
		if(g!=null){
			return g.getStockVal();
		}
		else
			return 0;
	}
	
	public void elimPorStock(){
		//3
		for(Galpon g : galpones){
			g.elimPorStock();
		}
	}
}
