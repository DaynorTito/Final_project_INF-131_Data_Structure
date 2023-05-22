package Estructuras;
import java.io.Serializable;
import objetos.*;

public class LSimpleCPu implements Serializable{
	private NodoPu p;
	
	public LSimpleCPu(){
		p = null;
	}
	public NodoPu getP() {
		return p;
	}

	public void setP(NodoPu p) {
		this.p = p;
	}
	public void leerPuestos(int j) {
		for (int i = 1; i <=j; i++) {
			NodoPu w = new NodoPu();
			Puesto px = new Puesto();
			System.out.print("Leendo el "+i+" puesto");
			px.leer();
			w.setPuest(px);
			if (getP() == null) {
				setP(w);
				getP().setSig(getP());
			} else {
				NodoPu r = getP();
				r = getP();
				while (r.getSig() != getP())
					r = r.getSig();
				r.setSig(w);
				w.setSig(getP());
			}
		}
	}
	public void adiultimo(Puesto px) {
		NodoPu w = new NodoPu();
		w.setPuest(px);
		if (getP() == null) {
			setP(w);
			getP().setSig(getP());
		} else {
			NodoPu r = getP();
			r = getP();
			while (r.getSig() != getP())
				r = r.getSig();
			r.setSig(w);
			w.setSig(getP());
		}
	}

	public void mostrar() {
		NodoPu r = getP();
		while (r.getSig() != getP()) {
			r.getPuest().mostrar();
			r = r.getSig();
		}
		r.getPuest().mostrar();
	}
}
