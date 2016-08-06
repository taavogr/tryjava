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
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import uni.sistemas.entity.Detalle;
import uni.sistemas.service.DetalleDao;

/**
 *
 * @author Gustavo
 */
public class DetalleDaoFile implements DetalleDao<Detalle>{

      
    FileReader fr=null;
    FileWriter fw=null;
    PrintWriter pw=null;
    BufferedReader br=null;
    File f=null;
    String dato=null;
    String archivo="Factura.txt";
    String temporal="Temporal2.txt";
    
    @Override
    public void agregar_detalle(Detalle a) throws Exception {
        
        try{
            
          
            fw=new FileWriter(archivo,true);
            pw=new PrintWriter(fw);
            dato=a.getCodigo()+"#"+ a.getNombre()+"#"+a.getPrecio_unitario()+"#"+a.getCantidad()+"\n";
            pw.write(dato);
            pw.close();
            
        }catch(IOException e){
            throw e;
        }finally{
            fw.close();
        }
    
   
    
    }

    @Override
    public List<Detalle> leer_detalles() throws Exception {
        
        List<Detalle> lista =new ArrayList<>();
        try{
            fr= new FileReader(archivo);
            br= new BufferedReader(fr);
            dato=br.readLine();
            dato=br.readLine();
            while (dato!=null) {
                
                Detalle deta= new Detalle();
                StringTokenizer token = new StringTokenizer(dato,"#");
                deta.setCodigo(Integer.parseInt(token.nextToken()));
                deta.setNombre(token.nextToken());
                deta.setPrecio_unitario(Double.parseDouble(token.nextToken()));
                deta.setCantidad(Integer.parseInt(token.nextToken()));
                lista.add(deta);
                dato=br.readLine();
            }
            br.close();
        }catch(IOException | NumberFormatException e){
            throw e;
        }finally{
            fr.close();
        }
        return lista;
    }
}
