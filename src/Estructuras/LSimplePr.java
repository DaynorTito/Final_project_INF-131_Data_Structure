package Estructuras;
import java.io.Serializable;
import objetos.*;

public class LSimplePr implements Serializable{
	private NodoPr p;
	
	public LSimplePr(){
		p = null;
	}
	public NodoPr getP() {
		return p;
	}
	public void setP(NodoPr p) {
		this.p = p;
	}
	public void leerProd(int j) {
		for (int i = 1; i <=j; i++) {
			NodoPr nue = new NodoPr();
			System.out.println("Intro idProd, prec, cant del prod (de "+i+" produ)");
			String idProducto,cantidad;
			double precio;
			idProducto = Leer.dato();
			precio = Leer.datoDouble();
			cantidad = Leer.dato();
			nue.setIdProducto(idProducto);
			nue.setCantidad(cantidad);
			nue.setPrecio(precio);
			if(getP()==null)
				setP(nue);
			else {
				NodoPr x = getP();
				while(x.getSig() != null) 
					x = x.getSig();
				x.setSig(nue);
			}
		}
	}

	public void adifinal(String idProducto, double precio, String cantidad) {
		NodoPr nue = new NodoPr();
		nue.setIdProducto(idProducto);
		nue.setCantidad(cantidad);
		nue.setPrecio(precio);
		if(getP()==null)
			setP(nue);
		else {
			NodoPr x = getP();
			while(x.getSig() != null) 
				x = x.getSig();
			x.setSig(nue);
		}
	}
	public void mostrar() {
		NodoPr q = getP();
		while(q != null) {
			System.out.println("Prod: "+q.getIdProducto()+" "+q.getPrecio()+" Bs. "+q.getCantidad());
			q = q.getSig();
		}
	}
}
