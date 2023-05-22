package objetos;
import Estructuras.*;
import java.io.Serializable;
public class MercadoMinorista extends Mercado implements Serializable{
	private LSimpleCPu puestos;
	
	

	public MercadoMinorista(){
		super();
		puestos = new LSimpleCPu();
	}

	public MercadoMinorista(String nombre, String horaApertura, String horaCierre, String macrodistrito, String direccion,
			int superficie, LSimpleCPu puestos) {
		super(nombre,horaApertura, horaCierre, macrodistrito, direccion, superficie);
		this.puestos = puestos;
	}

	public LSimpleCPu getPuestos() {
		return puestos;
	}

	public void setPuestos(LSimpleCPu puestos) {
		this.puestos = puestos;
	}
	public void leer() {
		super.leer();
		System.out.println("Intro nro de puestos ");
		int nroPuest = Leer.datoInt();
		puestos.leerPuestos(nroPuest);
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Lista Simple de puestos");
		puestos.mostrar();
	}
	
}
