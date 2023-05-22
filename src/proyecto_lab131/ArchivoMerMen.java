/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_lab131;
import Estructuras.*;
/*import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileOutputStream;*/
import java.io.*;
import objetos.*;
import Estructuras.*;
/**
 *
 * @author DAYNOR
 */
public class ArchivoMerMen {
    private String nombreArch;
    private CSimpleMercadoMin regismen;
    
    public ArchivoMerMen(String nom){
        nombreArch = nom;
    }
    
    
    public void adicionar()throws ClassNotFoundException, IOException{
        ObjectOutputStream Registro = null;
        try{
            if(!(new File(nombreArch).exists())){
                Registro = new ObjectOutputStream(new FileOutputStream(nombreArch,true));
            } else{
                Registro = new AddObjectOutputStream(new FileOutputStream(nombreArch,true));
            }
            
        regismen = new CSimpleMercadoMin();
        LSimpleCPu pu001 = new LSimpleCPu();
        LSimplePr prod021 = new LSimplePr();
        prod021.adifinal("pro2", 12, "1 libra");
        prod021.adifinal("pro3", 4, "1 libra");
        prod021.adifinal("pro5", 7, "1 libra");
   
        LSimplePr prod022 = new LSimplePr();
        prod022.adifinal("pro4", 11, "1 libra");
        prod022.adifinal("pro5", 12, "1 libra");

        LSimplePr prod023 = new LSimplePr();
        prod023.adifinal("pro1", 10, "1 kilo");
        prod023.adifinal("pro6", 4, "1 libra");
        prod023.adifinal("pro6", 1, "1 libra");

        LSimplePr prod024 = new LSimplePr();
        prod024.adifinal("pro2", 21, "1 kilo");
        prod024.adifinal("pro4", 7, "1 libra");

        LSimplePr prod025 = new LSimplePr();
        prod025.adifinal("pro5", 4, "1 libra");
        prod025.adifinal("pro3", 4, "1 libra");
        prod025.adifinal("pro11", 21, "1 arroba");

        pu001.adiultimo(new Puesto("p021",prod021));
        pu001.adiultimo(new Puesto("p022",prod022));
        pu001.adiultimo(new Puesto("p023",prod023));
        pu001.adiultimo(new Puesto("p024",prod024));
        pu001.adiultimo(new Puesto("p025",prod025));
        regismen.adicionar(new MercadoMinorista("bolivar","08:00","21:00","periferica","av juan jose torres",400,pu001));
  
        LSimpleCPu pu002 = new LSimpleCPu();
        
        LSimplePr prod031 = new LSimplePr();
        prod031.adifinal("pro1", 12, "1 libra");
        prod031.adifinal("pro5", 6, "1 libra");
        prod031.adifinal("pro7", 5, "1 libra");
   
        LSimplePr prod032 = new LSimplePr();
        prod032.adifinal("pro6", 9, "1 libra");
        prod032.adifinal("pro2", 7, "1 libra");

        LSimplePr prod033 = new LSimplePr();
        prod033.adifinal("pro7", 10, "1 kilo");
        prod033.adifinal("pro3", 14, "1 libra");
        prod033.adifinal("pro6", 11, "1 libra");

        LSimplePr prod034 = new LSimplePr();
        prod034.adifinal("pro5", 2, "1 kilo");
        prod034.adifinal("pro2", 4, "1 libra");

        LSimplePr prod035 = new LSimplePr();
        prod035.adifinal("pro6", 6, "1 libra");
        prod035.adifinal("pro4", 5, "1 libra");
        prod035.adifinal("pro1", 2, "1 libra");

        pu002.adiultimo(new Puesto("p031",prod031));
        pu002.adiultimo(new Puesto("p032",prod032));
        pu002.adiultimo(new Puesto("p033",prod033));
        pu002.adiultimo(new Puesto("p034",prod034));
        pu002.adiultimo(new Puesto("p035",prod035));
        regismen.adicionar(new MercadoMinorista("velas","08:00","21:00","centro","av litoral",500,pu002));
        
        Registro.writeObject(regismen);
        Registro.close();
        
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public void mostrar() throws ClassNotFoundException, IOException{
        ObjectInputStream Registro = null;
        try{
            Registro = new ObjectInputStream(new FileInputStream(nombreArch));
            while(true){
                regismen = new CSimpleMercadoMin();
                regismen = (CSimpleMercadoMin)Registro.readObject();
                regismen.mostrar();
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            Registro.close();
        }
    }
}
