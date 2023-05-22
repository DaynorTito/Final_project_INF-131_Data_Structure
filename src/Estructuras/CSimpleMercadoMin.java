package Estructuras;
import java.io.Serializable;
import objetos.*;
public class CSimpleMercadoMin implements Serializable{
	private int max = 20;
	private MercadoMinorista v[] = new MercadoMinorista[max + 1];
	private int ini, fin;

	public CSimpleMercadoMin() {
		ini = 0;
		fin = 0;
	}
	public void llenar(int j) {
		for (int i = 1; i <=j; i++) {
			MercadoMinorista mx = new MercadoMinorista();
			System.out.print("leendo el "+i+" Mercado Minorista");
			mx.leer();
			adicionar(mx);
		}
	}
	public boolean esvacia() {
		if (ini == 0 && fin == 0)
			return (true);
		return (false);
	}

	public boolean esllena() {
		if (fin == max)
			return (true);
		return (false);
	}

	public int nroelem() {
		return (fin - ini);
	}

	public void adicionar(MercadoMinorista elem) {
		if (!esllena()) {
			fin++;
			v[fin] = elem;
		} else
			System.out.println("Cola Simple llena");
	}

	public MercadoMinorista eliminar() {
		MercadoMinorista elem = null;
		if (!esvacia()) {
			ini++;
			elem = v[ini];
			if (ini == fin)
				ini = fin = 0;
		} else
			System.out.println("Cola Simple vacia");
		return (elem);
	}

	public void mostrar() {
		if (esvacia())
			System.out.println("Cola vacia");
		else {
			System.out.println("\n Elementos de la Cola ");
			CSimpleMercadoMin aux = new CSimpleMercadoMin();
			while (!esvacia()) {
				MercadoMinorista elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			vaciar(aux);
		}
	}

	public void vaciar(CSimpleMercadoMin a) {
		while (!a.esvacia())
			adicionar(a.eliminar());
	}

}
