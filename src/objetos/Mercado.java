package objetos;
import Estructuras.*;
import java.io.Serializable;
public class Mercado implements Serializable{
	private String nombre, horaApertura, horaCierre, macrodistrito, direccion;
	private int superficie;
	
	public Mercado(){
		
	}

	public Mercado(String nombre, String horaApertura, String horaCierre, String macrodistrito, String direccion,
			int superficie) {
		this.nombre = nombre;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
		this.macrodistrito = macrodistrito;
		this.direccion = direccion;
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}

	public String getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public String getMacrodistrito() {
		return macrodistrito;
	}

	public void setMacrodistrito(String macrodistrito) {
		this.macrodistrito = macrodistrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public void leer() {
		System.out.println("Intro nombre, horaAp, horaCie, macroDist, direc, supf");
		this.nombre = Leer.dato();
		this.horaApertura = Leer.dato();
		this.horaCierre = Leer.dato();
		this.macrodistrito = Leer.dato();
		this.direccion = Leer.dato();
		this.superficie = Leer.datoInt();
	}
	

	public void mostrar() {
		System.out.println("MERCADO nombre=" + nombre + " HoraApertura=" + horaApertura + " HoraCierre=" + horaCierre
				+ "\nMacrodistrito=" + macrodistrito + " Direccion=" + direccion + " Superficie=" + superficie);
	}
}
