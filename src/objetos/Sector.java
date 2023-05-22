package objetos;
import Estructuras.*;
import java.io.Serializable;
public class Sector implements Serializable{
	private String nombre;
	private int superficie;
	private LSimpleCPu puestos;
	
	public Sector(){
		puestos = new LSimpleCPu();
	}

	public Sector(String nombre, int superficie, LSimpleCPu puestos) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.puestos = puestos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public LSimpleCPu getPuestos() {
		return puestos;
	}

	public void setPuestos(LSimpleCPu puestos) {
		this.puestos = puestos;
	}
	public void leer() {
		System.out.println("Intro NombreSec, superf, nroPuestos(LSimpleCPu)");
		nombre = Leer.dato();
		superficie = Leer.datoInt();
		int nroPuestos = Leer.datoInt();
		puestos.leerPuestos(nroPuestos);
	}
	public void mostrar() {
		System.out.println("SECTOR: "+nombre+" superf: "+superficie+"\nListaSimpleCircular de Puestos");
		puestos.mostrar();
		
	}
}
