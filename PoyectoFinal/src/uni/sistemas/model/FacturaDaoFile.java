/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import uni.sistemas.entity.Factura;
import uni.sistemas.service.FacturaDao;

/**
 *
 * @author Gustavo
 */
public class FacturaDaoFile implements FacturaDao<Factura>{
    
    FileReader fr=null;
    FileWriter fw=null;
    PrintWriter pw=null;
    BufferedReader br=null;
    File f=null;
    String dato=null;
    String archivo="Factura.txt";
    String temporal="Temporal2.txt";
    static int count=1000;

    @Override
    public void facturar(Factura a) throws Exception {
        try{
            count++;
          
            fw=new FileWriter(archivo,true);
            pw=new PrintWriter(fw);
            dato=count+"#"+ a.getCodigo_clitente()+"#"+a.getFecha_venta().toString()+"#"+a.getMonto()+"\n";
            pw.write(dato);
            pw.close();
            
        }catch(IOException e){
            throw e;
        }finally{
            fw.close();
        }
    }

    @Override
    public void actualizar_factura(double a) throws Exception {
        
    }
    
}
