/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.io.IOException;
/**
 *
 * @author estadm
 * @param <T>
 */
public class Lista <T>{
    private Nodo _head;
    private Nodo _tail;
       
    public Lista() throws IOException{
        this._head=null;
        this._tail=null;
    }
    public void insertHead(T pData){
       if(_head==null){
            _head =_tail= new Nodo(pData);
        }
        else{
            Nodo tmp = new Nodo(pData);
            tmp.setNext(_head);
            _head.setAnterior(tmp);
            _head=tmp;
        }
    }    
    
    public boolean buscar(String pData){
        Nodo tmp;
        Nodo cont = _head;
        while(cont!=null){
            tmp = ((Lista)cont.get_data())._head;
            if(pData.substring(0,1).equals(((String)tmp.get_data()).substring(0,1))){
                while(tmp!=null){
                   if(pData.equals((String)tmp.get_data())){
                       return true;
                   }
                   tmp=tmp.getNext();
                }
            }
           cont=cont.getNext();
        }
        return false;
    }
    public void delete(T obs){ 
        boolean estado;
        estado= false;
        Nodo tmp = _head;
        
        if(_head == _tail){
               _head = _tail = null;
               estado= true;
        } 
        
        if(_head.get_data().equals(obs)){
            Nodo tmp2= _head;
            _head=_head.getNext();
            tmp2.setNext(null);
            _head.setAnterior(null);
            estado=true;
        }
        if(_tail.get_data().equals(obs)&& estado==false){
               Nodo tmp2 = _tail;
               _tail= tmp2.getAnterior();
               tmp2.setAnterior(null);
               _tail.setNext(null);
               estado=true;
        }
        
        
        if (estado == false){
            while(tmp != null){
                if(tmp.get_data().equals(obs)){
                    tmp.getNext().setAnterior(tmp.getAnterior());
                    tmp.getAnterior().setNext(tmp.getNext());
                    tmp.setAnterior(null);
                    tmp.setNext(null);
                    tmp = null;
                }
                else{
                    tmp=tmp.getNext();

                
                }
            }
        }
    }
    public T getData(Nodo tmp){
        return (T) (tmp.get_data());
    }
    public void setData(Nodo tmp,T pdata){
         tmp.set_data(pdata);
    }
    public Nodo listaGetNext(Nodo tmp){
        tmp=tmp.getNext();
        return tmp;
        
    }
    public Nodo getHead(){
        return _head;
    }
     public void imprimir(Lista m){
        Nodo tmp=m._head;
        int cont=0;
        while(tmp!=null){
            cont++;
            //System.out.println(((Palabra)(tmp.get_data())).getValorStr());
            System.out.println(((tmp.get_data())));
            tmp=tmp.getNext();
          
        }
         System.out.println(cont);
      
    }
     
}
