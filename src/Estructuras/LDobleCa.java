package Estructuras;
import java.io.Serializable;
import objetos.*;
public class LDobleCa implements Serializable{
	private NodoCa p;
	
        
        
	public LDobleCa(){
		p = null;
	}
	public NodoCa getP() {
        return p;
    }

    public void setP(NodoCa p) {
        this.p = p;
    }
    public void leerCamiones(int j) {
    	for (int i = 1; i <=j; i++) {
    		NodoCa nue=new NodoCa();
            System.out.println("Leendo el "+i+ " Camion");
            CamionProductos px = new CamionProductos();
            px.leer();
            nue.setCamion(px);
            if(getP()==null)
                setP(nue);
            else{
                NodoCa x=getP();
                while(x.getSig()!=null)
                    x=x.getSig();
                x.setSig(nue);
                nue.setAnt(x);
            }
		}
    }
    public void adifinal(CamionProductos h)
    {
        NodoCa nue=new NodoCa();
        nue.setCamion(h);
        if(getP()==null)
            setP(nue);
        else{
            NodoCa x=getP();
            while(x.getSig()!=null)
                x=x.getSig();
            x.setSig(nue);
            nue.setAnt(x);
        }
    }
    public void mostrar()
    {
        NodoCa q=getP();
        while(q!=null)
        {
            q.getCamion().mostrar();
            q=q.getSig();
        }
    }
	
}
