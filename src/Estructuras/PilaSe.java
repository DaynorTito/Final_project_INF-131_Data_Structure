package Estructuras;
import java.io.Serializable;
import objetos.*;
public class PilaSe implements Serializable{
	private int max = 50, tope;
	private Sector v[] = new Sector[max + 1]; // cambiar

	public PilaSe() {
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

	public void adicionar(Sector elem) { // cambiar
		if (!esllena()) {
			tope++;
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	public Sector eliminar() { // cambiar
		Sector elem = null;
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	public void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Sector sx = new Sector();
			System.out.print("Leendo el "+i+" sector");
			sx.leer();
			adicionar(sx);
		}
	}

	public void mostrar() { // cambiar
		Sector elem;
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\nPila Sectores");
			PilaSe aux = new PilaSe();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}

	public void vaciar(PilaSe a) {
		while (!a.esvacia())
			adicionar(a.eliminar());
	}
}
