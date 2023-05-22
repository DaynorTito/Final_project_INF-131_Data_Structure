package proyecto_lab131;
import objetos.*;
import Estructuras.*;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		/*CSimpleMercadoMin MMIN = new CSimpleMercadoMin();
		PilaMercadoMay MMAY = new PilaMercadoMay();
		llenarDatos(MMIN, MMAY);
		MMIN.mostrar();*/
               // ArchivoMerMen arch = new ArchivoMerMen("datos1.dat");
                //arch.adicionar();
                //arch.mostrar();
                //ArchivoMerMay arch = new ArchivoMerMay("datos2.dat");
                //arch.adicionar();
                //arch.mostrar();
	}

	private static void llenarDatos(CSimpleMercadoMin mmin, PilaMercadoMay mmay) {
		//--------------------mercado bolivar------------------
		LSimplePr pr111 = new LSimplePr();
		pr111.adifinal("PR001", 12.4, "1 libra");
		pr111.adifinal("PR002", 4, "1/2 libra");
		pr111.adifinal("PR003", 5, "1 libra");
		pr111.adifinal("PR004", 8, "1 kilo");
		LSimplePr pr112 = new LSimplePr();
		pr112.adifinal("PR003", 11, "1 libra");
		pr112.adifinal("PR002", 7, "1/2 libra");
		pr112.adifinal("PR005", 8, "1 libra");
		pr112.adifinal("PR006", 10, "1 kilo");
		LSimplePr pr113 = new LSimplePr();
		pr113.adifinal("PR007", 12.4, "1 libra");
		pr113.adifinal("PR008", 4, "1/2 libra");
		pr113.adifinal("PR009", 5, "1 libra");
		pr113.adifinal("PR010", 8, "1 kilo");
		
		Puesto pu001 = new Puesto("PU001", pr111);
		Puesto pu002 = new Puesto("PU002", pr112);
		Puesto pu003 = new Puesto("PU003", pr113);
		LSimpleCPu lsPuestos01 = new LSimpleCPu();
		lsPuestos01.adiultimo(pu001);
		lsPuestos01.adiultimo(pu002);
		lsPuestos01.adiultimo(pu003);
		//-------------------------------------------------
		//--------------------mercado el carmen-------------------------
		LSimplePr pr114 = new LSimplePr();
		pr114.adifinal("PR001", 12.4, "1 libra");
		pr114.adifinal("PR002", 4, "1/2 libra");
		pr114.adifinal("PR003", 5, "1 libra");
		pr114.adifinal("PR004", 8, "1 kilo");
		LSimplePr pr115 = new LSimplePr();
		pr115.adifinal("PR003", 11, "1 libra");
		pr115.adifinal("PR002", 7, "1/2 libra");
		pr115.adifinal("PR005", 8, "1 libra");
		pr115.adifinal("PR006", 10, "1 kilo");
		LSimplePr pr116 = new LSimplePr();
		pr116.adifinal("PR007", 12.4, "1 libra");
		pr116.adifinal("PR008", 4, "1/2 libra");
		pr116.adifinal("PR009", 5, "1 libra");
		pr116.adifinal("PR010", 8, "1 kilo");
		
		Puesto pu011 = new Puesto("PU011", pr111);
		Puesto pu012 = new Puesto("PU012", pr112);
		Puesto pu013 = new Puesto("PU013", pr113);
		LSimpleCPu lsPuestos02 = new LSimpleCPu();
		lsPuestos02.adiultimo(pu011);
		lsPuestos02.adiultimo(pu012);
		lsPuestos02.adiultimo(pu013);
		//--------------------------------------------------
		mmin.adicionar(new MercadoMinorista("Bolivar","08:00","21:00","max paredes","av jaime freire",2090,lsPuestos01));
		mmin.adicionar(new MercadoMinorista("El carmen","07:00","22:00","centro","c. presvitero medina",3000,lsPuestos02));
		
		
		//----------------PARA MERCADOS MAYORISTAS-------------------------------
		
		PilaSe se001 = new PilaSe();
		LSimplePr pr311 = new LSimplePr();
		pr111.adifinal("PR001", 12.4, "1 libra");
		pr111.adifinal("PR002", 4, "1/2 libra");
		pr111.adifinal("PR003", 5, "1 libra");
		pr111.adifinal("PR004", 8, "1 kilo");
		LSimplePr pr312 = new LSimplePr();
		pr112.adifinal("PR003", 11, "1 libra");
		pr112.adifinal("PR002", 7, "1/2 libra");
		pr112.adifinal("PR005", 8, "1 libra");
		pr112.adifinal("PR006", 10, "1 kilo");
		LSimplePr pr313 = new LSimplePr();
		pr113.adifinal("PR007", 12.4, "1 libra");
		pr113.adifinal("PR008", 4, "1/2 libra");
		pr113.adifinal("PR009", 5, "1 libra");
		pr113.adifinal("PR010", 8, "1 kilo");
		
		Puesto pu301 = new Puesto("PU001", pr311);
		Puesto pu302 = new Puesto("PU002", pr312);
		Puesto pu303 = new Puesto("PU003", pr313);
		LSimpleCPu lsPuestos04 = new LSimpleCPu();
		lsPuestos04.adiultimo(pu301);
		lsPuestos04.adiultimo(pu302);
		lsPuestos04.adiultimo(pu303);
		
		
		LSimplePr pr322 = new LSimplePr();
		pr322.adifinal("PR001", 12.4, "1 libra");
		pr322.adifinal("PR002", 4, "1/2 libra");
		pr322.adifinal("PR003", 5, "1 libra");
		pr322.adifinal("PR004", 8, "1 kilo");
		LSimplePr pr323 = new LSimplePr();
		pr323.adifinal("PR003", 11, "1 libra");
		pr323.adifinal("PR002", 7, "1/2 libra");
		pr323.adifinal("PR005", 8, "1 libra");
		pr323.adifinal("PR006", 10, "1 kilo");
		LSimplePr pr314 = new LSimplePr();
		pr114.adifinal("PR007", 12.4, "1 libra");
		pr114.adifinal("PR008", 4, "1/2 libra");
		pr114.adifinal("PR009", 5, "1 libra");
		pr114.adifinal("PR010", 8, "1 kilo");
		
		Puesto pu307 = new Puesto("PU001", pr311);
		Puesto pu304 = new Puesto("PU002", pr312);
		Puesto pu305 = new Puesto("PU003", pr313);
		LSimpleCPu lsPuestos05 = new LSimpleCPu();
		lsPuestos05.adiultimo(pu307);
		lsPuestos05.adiultimo(pu304);
		lsPuestos05.adiultimo(pu305);

		se001.adicionar(new Sector("granos",211,lsPuestos04));
		se001.adicionar(new Sector("granos",211,lsPuestos05));
		
		LDobleCa ca01 = new LDobleCa();
		ca01.adifinal(new CamionProductos());
		mmay.adicionar(new MercadoMayorista("Uruguay","07:00","20:00","max paredes","calle xxxxx",1200,ca01,se001));
	
	
	}

}
