package Estructuras;
import java.io.Serializable;
import objetos.*;
public class NodoCa implements Serializable{
	private NodoCa ant, sig;
	private CamionProductos camion;
	
	public NodoCa(){
		ant = sig = null;
	}

	public NodoCa getAnt() {
		return ant;
	}

	public void setAnt(NodoCa ant) {
		this.ant = ant;
	}

	public NodoCa getSig() {
		return sig;
	}

	public void setSig(NodoCa sig) {
		this.sig = sig;
	}

	public CamionProductos getCamion() {
		return camion;
	}

	public void setCamion(CamionProductos camion) {
		this.camion = camion;
	}
	
}
