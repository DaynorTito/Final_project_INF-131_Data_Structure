package Estructuras;
import java.io.Serializable;
import objetos.*;
public class NodoPu implements Serializable{
	private NodoPu sig;
	private Puesto puest;
	
	public NodoPu(){
		sig = null;
	}

	public NodoPu getSig() {
		return sig;
	}

	public void setSig(NodoPu sig) {
		this.sig = sig;
	}

	public Puesto getPuest() {
		return puest;
	}

	public void setPuest(Puesto puest) {
		this.puest = puest;
	}
	
}
