package Estructuras;
import java.io.Serializable;
import objetos.*;
public class NodoPr implements Serializable{
	private NodoPr sig;
	private String idProducto, cantidad;
	private double precio;
	
	public NodoPr(){
		sig = null;
	}
	public NodoPr getSig() {
		return sig;
	}
	public void setSig(NodoPr sig) {
		this.sig = sig;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
