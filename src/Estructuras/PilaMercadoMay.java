package Estructuras;
import java.io.Serializable;
import objetos.*;
public class PilaMercadoMay implements Serializable{
	private int max = 50, tope;
	private MercadoMayorista v[] = new MercadoMayorista[max + 1]; // cambiar

	public PilaMercadoMay() {
		tope = 0;
	}

	public boolean esvacia() {
		if (tope == 0)
			return true;
		return false;
	}

	public boolean esllena() {
		if (tope == max)
			return true;
		return false;
	}

	public int nroelem() {
		return (tope);
	}

	public void adicionar(MercadoMayorista elem) { // cambiar
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	public MercadoMayorista eliminar() { // cambiar
		MercadoMayorista elem = null;
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			MercadoMayorista sx = new MercadoMayorista();
			System.out.print("Leendo el "+i+" MercadoMayorista");
			sx.leer();
			adicionar(sx);
		}
	}

	public void mostrar() { // cambiar
		MercadoMayorista elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Pila MercadoMayoristas");
			PilaMercadoMay aux = new PilaMercadoMay();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}

	public void vaciar(PilaMercadoMay a) {
		while (!a.esvacia())
			adicionar(a.eliminar());
	}
}
