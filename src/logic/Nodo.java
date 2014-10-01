/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author estadm
 */
public class Nodo <T>{
    private T _data;
    private Nodo _next;
    private Nodo _anterior;
    
    public Nodo(T pData){
        this._data=pData;
    }
    public T get_data(){
        return this._data;
    }
    public void setNext(Nodo next){
        this._next = next;
    }
    public void setAnterior(Nodo anterior){
        this._anterior=anterior;
    }
    public Nodo getNext(){
        return _next;
    }
    public Nodo getAnterior(){
        return _anterior;
    }
    public void set_data(T pdata){
         _data = pdata;
    }
}
    

