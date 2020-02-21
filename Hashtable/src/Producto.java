
public class Producto {
	private int codigo;
	private int precio;
	private int stockMin;
	
	public Producto(int c, int p, int sm){
		codigo = c;
		precio = p;
		stockMin = sm;
	}
	
	public boolean sos(int c){
		return codigo == c;
	}
	
	public int getPrecio(){
		return precio;
	}
	
	public int getStockMin(){
		return stockMin;
	}
}
