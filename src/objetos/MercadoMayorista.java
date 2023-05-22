package objetos;
import Estructuras.*;
import java.io.Serializable;
public class MercadoMayorista extends Mercado implements Serializable{
	private LDobleCa camiones;
	private PilaSe sectores;
	
	public MercadoMayorista(){
		super();
		camiones = new LDobleCa();
		sectores = new PilaSe();
	}

	public MercadoMayorista(String nombre, String horaApertura, String horaCierre, String macrodistrito, String direccion,
			int superficie, LDobleCa camiones, PilaSe sectores) {
		super(nombre, horaApertura, horaCierre, macrodistrito, direccion, superficie);
		this.camiones = camiones;
		this.sectores = sectores;
	}

	public LDobleCa getCamiones() {
		return camiones;
	}

	public void setCamiones(LDobleCa camiones) {
		this.camiones = camiones;
	}

	public PilaSe getSectores() {
		return sectores;
	}

	public void setSectores(PilaSe sectores) {
		this.sectores = sectores;
	}
	public void leer() {
		super.leer();
		System.out.println("Intro datos nro Camiones, nro Sectores");
		int nroCamiones = Leer.datoInt();
		int nroSector = Leer.datoInt();
		camiones.leerCamiones(nroCamiones);
		sectores.llenar(nroSector);
	}
	public void mostrar() {
		System.out.println("MERCADO MAYORISTA: ");
		System.out.println("Lista doble de Camiones");
		camiones.mostrar();
		sectores.mostrar();
	}
}
