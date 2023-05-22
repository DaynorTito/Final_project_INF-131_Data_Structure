package objetos;
import Estructuras.*;
import java.io.Serializable;
public class Puesto implements Serializable{
	private String idPuesto;
	private LSimplePr productos;
	
	public Puesto(){
		productos = new LSimplePr();
	}

	public Puesto(String idPuesto, LSimplePr productos) {
		this.idPuesto = idPuesto;
		this.productos = productos;
	}

	public String getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(String idPuesto) {
		this.idPuesto = idPuesto;
	}

	public LSimplePr getProductos() {
		return productos;
	}

	public void setProductos(LSimplePr productos) {
		this.productos = productos;
	}
	public void leer() {
		System.out.println("Intro idPuesto, nroProds");
		idPuesto = Leer.dato();
		int nroProds = Leer.datoInt();
		productos.leerProd(nroProds);
	}
	public void mostrar() {
		System.out.println("PUESTO: "+idPuesto+"\nLista simple Productos");
		productos.mostrar();
	}
}
