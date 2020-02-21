import java.util.Scanner;


public class Ejecutora {

	
	public static void main(String[] args) {
		Distribuidora dis = new Distribuidora();
		Scanner in = new Scanner (System.in);
        in.useDelimiter(System.getProperty("line.separator"));
        int cp, cant, pre, sm;
        String lg;
        int op=0;
        do {
        	System.out.println("1 - Agregar un producto nuevo");
        	System.out.println("2 - Agregar un galp�n nuevo");
        	System.out.println("3 - Agregar stock de un producto en un galp�n");
        	System.out.println("4 - Stock valorizado de un galp�n");
        	System.out.println("5 - Eliminar productos con stock menor al minimo por galp�n");
        	System.out.println("0 - Salir");
        	op = in.nextInt();
        	switch(op){
        	case 1:
        		System.out.println("Ingrese el c�digo del producto nuevo");
        		cp = in.nextInt();
        		System.out.println("Ingrese el precio del producto nuevo");
        		pre = in.nextInt();
        		System.out.println("Ingrese el stock m�nimo del producto nuevo");
        		sm = in.nextInt();
        		dis.agregarProducto(cp,pre,sm);
        		break;
        	case 2:
        		System.out.println("Ingrese la localidad del galp�n nuevo");
        		lg  = in.next();
        		dis.agregarGalpon(lg);
        		break;
        	case 3:
        		System.out.println("Ingrese el c�digo del producto");
        		cp = in.nextInt();
        		System.out.println("Ingrese la localidad del galp�n");
        		lg  = in.next();
        		System.out.println("Ingrese la cantidad");
        		cant  = in.nextInt();
        		dis.agregarProdGalpon(cp, lg, cant);
        		break;
        	case 4:
        		System.out.println("Ingrese la localidad del galp�n");
        		lg  = in.next();
        		System.out.println("El stock valorizado del galp�n es " + dis.stockValGalpon(lg));
        		break;
        	case 5:
        		dis.elimPorStock();
        		break;
        	}
        	
        }while(op!=0);
	}

}
