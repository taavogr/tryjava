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
import uni.sistemas.entity.Producto;
import uni.sistemas.service.ICrudDao;

/**
 *
 * @author Gustavo
 */
public class ProductoDaoFile implements ICrudDao<Producto>{
    
    FileReader fr=null;
    FileWriter fw=null;
    PrintWriter pw=null;
    BufferedReader br=null;
    File f=null;
    String dato=null;
    String archivo="Productos.txt";
    String temporal="Temporal.txt";


    
    @Override
    public void crear(Producto a) throws Exception {
    
        try{
          
            fw=new FileWriter(archivo,true);
            pw=new PrintWriter(fw);
            dato=a.getCodigo()+"#"+a.getNombre()+"#"+a.getPrecio()+"#"+a.getStock()+"\n";
            pw.write(dato);
            pw.close();
            
        }catch(IOException e){
            throw e;
        }finally{
            fw.close();
        }
    }

    @Override
    public void actualizar(Producto a) throws Exception {
        
        try{
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);
            String nuevo_dato=a.getCodigo()+"#"+a.getNombre()+"#"+a.getPrecio()+"#"+a.getStock()+"\n";
            String linea=br.readLine();
            while (linea !=null){
                StringTokenizer token=new StringTokenizer(linea,"#");
                String codigo= token.nextToken();
                if (Integer.parseInt(codigo)==a.getCodigo()) {
                    pw= new PrintWriter(new FileWriter(temporal,true));
                    pw.write(nuevo_dato);
                    pw.close();
                }else{
                    String linea_temporal=linea+"\n";
                    pw = new PrintWriter(new FileWriter(temporal,true));
                    pw.write(linea_temporal);
                    pw.close();
                }
                linea=br.readLine();
            }
            br.close();
             borrar_archivo(archivo);
            renombrar_archivo(archivo);
        }catch(IOException | NumberFormatException e){
            throw e;
        }       
    }

    @Override
    public void eliminar(Producto a) throws Exception {
        
        try{
            fr=new FileReader(archivo);
            br=new BufferedReader(fr);
            String nuevo_dato=a.getCodigo()+"#"+a.getNombre()+"#"+a.getPrecio()+"#"+a.getStock()+"\n";
            String linea=br.readLine();
            while (linea !=null){
                StringTokenizer token=new StringTokenizer(linea,"#");
                String codigo= token.nextToken();
                if (Integer.parseInt(codigo)==a.getCodigo()) {
                   
                }else{
                    String linea_temporal=linea+"\n";
                    pw = new PrintWriter(new FileWriter(temporal,true));
                    pw.write(linea_temporal);
                    pw.close();
                }
                linea=br.readLine();
            }
            br.close();
            borrar_archivo(archivo);
            renombrar_archivo(archivo);
        }catch(IOException | NumberFormatException e){
            throw e;
        }
    }

    @Override
    public Producto buscar(int a) throws Exception {
        Producto pro=null;
        try{
            fr= new FileReader(archivo);
            br= new BufferedReader(fr);
            dato=br.readLine();
            while (dato!=null) {
                StringTokenizer token = new StringTokenizer(dato,"#");
                int codigo =Integer.parseInt(token.nextToken());
                
                if (codigo== a) {
                pro= new Producto();
                pro.setCodigo(codigo);
                pro.setNombre(token.nextToken());
                pro.setPrecio(Double.parseDouble(token.nextToken()));
                pro.setStock(Integer.parseInt(token.nextToken()));
                }
                
               
                dato=br.readLine();
            }
            br.close();
        }catch(IOException | NumberFormatException e){
            throw e;
        }finally{
            fr.close();
        }
        return pro;
        
    }

    @Override
    public List<Producto> leer() throws Exception {
        List<Producto> lista =new ArrayList<>();
        try{
            fr= new FileReader(archivo);
            br= new BufferedReader(fr);
            dato=br.readLine();
            while (dato!=null) {
                Producto pro= new Producto();
                StringTokenizer token = new StringTokenizer(dato,"#");
                pro.setCodigo(Integer.parseInt(token.nextToken()));
                pro.setNombre(token.nextToken());
                pro.setPrecio(Double.parseDouble(token.nextToken()));
                pro.setStock(Integer.parseInt(token.nextToken()));
                lista.add(pro);
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
    
    public void borrar_archivo(String ruta){
        String archivo_original= ruta;
        File arc=new File(archivo_original);
        if (arc.delete()) {
            System.out.println("Archivo Borrado");
            
        }else{
            System.out.println("No se puedo borrar archivo");
        }
        
    }
    public void renombrar_archivo(String ruta){
        
        File nuevo_archivo=new File(ruta);
        File viejo_nombre=new File(temporal);
        if (viejo_nombre.renameTo(nuevo_archivo)) {
            
        }else{
            System.out.println("No se puede renombrar");
        }
    }

    @Override
    public Producto buscarxnombre(String a) throws Exception {
        
        Producto pro=null;
        try{
            fr= new FileReader(archivo);
            br= new BufferedReader(fr);
            dato=br.readLine();
            while (dato!=null) {
                StringTokenizer token = new StringTokenizer(dato,"#");
                token.nextToken();
                String nombre =token.nextToken();
                
                if (nombre.equals(a) ) {
                StringTokenizer token2 = new StringTokenizer(dato,"#");
                pro= new Producto();
                pro.setCodigo(Integer.parseInt(token2.nextToken()));
                pro.setNombre(nombre);
                pro.setPrecio(Double.parseDouble(token.nextToken()));
                pro.setStock(Integer.parseInt(token.nextToken()));
                }
                
               
                dato=br.readLine();
            }
            br.close();
        }catch(IOException | NumberFormatException e){
            throw e;
        }finally{
            fr.close();
        }
        return pro;
        
    }
    
}
