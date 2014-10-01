/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;
 import java.io.*;
public class LeerTXt {
    private FileReader fr;
    
    public LeerTXt()
    {
        crear();
    }
    public  FileReader getFile()
    {
        return fr;
    }
    
    public void crear()
    {
        File archivo = null;
        fr = null;
      
 
      try 
      {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("/home/jairo/NetBeansProjects/SCRABBLE/es_CR.dic");
         fr = new FileReader (archivo);
         
         
         // Lectura del fichero      
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
                    
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }
    
}
