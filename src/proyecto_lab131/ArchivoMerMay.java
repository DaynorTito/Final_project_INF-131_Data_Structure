/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_lab131;

import Estructuras.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import objetos.*;

/**
 *
 * @author DAYNOR
 */
public class ArchivoMerMay {
    
    private String nombreArch;
    private PilaMercadoMay regismen;
    
    public ArchivoMerMay(String nom){
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
            
        regismen = new PilaMercadoMay();
        LSimplePr prod0001 = new LSimplePr();
        prod0001.adifinal("pro1", 11, "1 libra");
        prod0001.adifinal("pro3", 5, "1 libra");
        
        LSimplePr prod0002 = new LSimplePr();
        prod0001.adifinal("pro4", 8, "1 libra");
        prod0001.adifinal("pro5", 19, "1 kilo");
        
        LDobleCa cam1 = new LDobleCa();
        cam1.adifinal(new CamionProductos("ca1","achocalla",prod0001));
        cam1.adifinal(new CamionProductos("ca2","sorata",prod0002));
        
        LSimpleCPu pue001 =  new LSimpleCPu();
        pue001.adiultimo(new Puesto("pu001",prod0001));
        pue001.adiultimo(new Puesto("pu001",prod0002));
        
        LSimpleCPu pue002 =  new LSimpleCPu();
        pue002.adiultimo(new Puesto("pu001",prod0002));
        pue002.adiultimo(new Puesto("pu001",prod0001));
        
        PilaSe sec001 = new PilaSe();
        sec001.adicionar(new Sector("frutas",12,pue001));
        sec001.adicionar(new Sector("verduras",14,pue002));
        regismen.adicionar(new MercadoMayorista("Uruguay","8:00","21:00","Max Paredes","c. max paredes", 123,cam1,sec001));

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
                regismen = new PilaMercadoMay();
                regismen = (PilaMercadoMay)Registro.readObject();
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
