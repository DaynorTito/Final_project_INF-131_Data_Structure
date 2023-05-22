
package Estructuras;
import java.io.Serializable;
import objetos.*;
public class CCircularPro implements Serializable{
	private int max = 150;
	private Producto v[] = new Producto[max + 1];
	private int ini, fin;

	public CCircularPro() {
		ini = fin = 0;
	}

	public int nroelem() {
		return ((max + fin - ini) % max);
	}

	public boolean esvacia() {
		if (nroelem() == 0)
			return (true);
		return (false);
	}

	public boolean esllena() {
		if (nroelem() == max - 1)
			return (true);
		return (false);
	}

	public void adicionar(Producto elem) {
		if (!esllena()) {

			fin = (fin + 1) % max;
			v[fin] = elem;
		} else
			System.out.println("Cola circular llena");
	}

	public Producto eliminar() {
		Producto elem = null;
		if (!esvacia()) {
			ini = (ini + 1) % max;
			elem = v[ini];
			if (nroelem() == 0)
				ini = fin = 0;
		} else
			System.out.println("Cola circular vacia");
		return (elem);
	}

	public void mostrar() {
		Producto elem;
		if (esvacia())
			System.out.println("Cola vacia xxx");
		else {
			System.out.println("\nColaCircular de Productos");
			CCircularPro aux = new CCircularPro();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();

			}
			vaciar(aux);
		}
	}

	public void vaciar(CCircularPro a) {
		while (!a.esvacia())
			adicionar(a.eliminar());
	}
	public void llenar(int j) {
		for (int i = 1; i <=j; i++) {
			System.out.println("leendo el producto "+i);
			Producto px = new Producto();
			px.leer();
			adicionar(px);
		}
	}
}
