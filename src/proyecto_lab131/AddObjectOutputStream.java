/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_lab131;
import java.io.*;
/**
 *
 * @author DAYNOR
 */
public class AddObjectOutputStream extends ObjectOutputStream {
    public AddObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException{
        this.reset();
    }
}
