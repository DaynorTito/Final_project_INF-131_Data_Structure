package objetos;
import Estructuras.*;
import java.io.Serializable;
public class CamionProductos implements Serializable{
	private String idCamion, procedencia;
	private LSimplePr productos;
	
	public CamionProductos(){
		productos = new LSimplePr();
	}

	public CamionProductos(String idCamion, String procedencia, LSimplePr productos) {
		this.idCamion = idCamion;
		this.procedencia = procedencia;
		this.productos = productos;
	}

	public String getIdCamion() {
		return idCamion;
	}

	public void setIdCamion(String idCamion) {
		this.idCamion = idCamion;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public LSimplePr getProductos() {
		return productos;
	}

	public void setProductos(LSimplePr productos) {
		this.productos = productos;
	}
	public void leer() {
		System.out.println("Intro idCamion, procedencia y nroProd(LSImplePr)");
		idCamion = Leer.dato();
		procedencia=Leer.dato();
		int nroProd = Leer.datoInt();
		productos.leerProd(nroProd);
	}
	public void mostrar() {
		System.out.println("CAMION: "+idCamion+" Proced: "+procedencia);
		System.out.println("ListaSimple Productos del Camion");
		productos.mostrar();
	}
}
