package objetos;
import Estructuras.*;
import java.io.Serializable;
public class Producto implements Serializable{
	private String nombre, tipo, idProd;
	
	public Producto(){
		
	}

	public Producto(String nombre, String tipo, String idProd) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.idProd = idProd;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdProd() {
		return idProd;
	}

	public void setIdProd(String idProd) {
		this.idProd = idProd;
	}
	public void leer() {
		System.out.println("Intro id, nombre y tipo del producto");
		idProd = Leer.dato();
		nombre=Leer.dato();
		tipo = Leer.dato();
	}
	public void mostrar() {
		System.out.println("Prod: "+idProd+" "+nombre+" "+tipo);
	}
	
}
