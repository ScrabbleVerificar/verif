/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.io.IOException;
import java.util.Random;
/**
 *
 * @author estadm
 */
public class Principal {
    private Lista _coordenadas;
    private Lista _letras;
    private Lista _PalabrasJ1;
    private Lista _PoscicionesPJ1;
    private Lista _MatrizLista;
    private Lista _posPalabras;
    private int _maximo = 98;
    private int _maximoNum = 7;
    private Palabra _resalto;
    private String _tmpPalabra="";
    private Nodo _tmpmov;
    private int columna=0;
    private int fila = 0;
    private String posPal ="";
    private int priLet=0;
    private int ultLet=0;
    private boolean cond;
    
    public Principal() throws IOException {
        this._letras = new ListaLetras().letras();
        _coordenadas= new Lista();
        this._coordenadas.insertHead(230);
        this._coordenadas.insertHead(285);
        this._coordenadas.insertHead(340);
        this._coordenadas.insertHead(395);
        this._coordenadas.insertHead(450);
        this._coordenadas.insertHead(505);
        this._coordenadas.insertHead(560);
        _PalabrasJ1 = new Lista();
        _PoscicionesPJ1 = new Lista();
        _posPalabras = new Lista ();
        seleccionarPalabras();
        seleccionarPalabras();
        seleccionarPalabras();
        seleccionarPalabras();
        seleccionarPalabras();
        seleccionarPalabras();
        seleccionarPalabras();
        _MatrizLista =matriz();
        ingresaMatriz();
        _resalto=new Palabra("/Image/resalto.png",0,"",48,44);
        _resalto.setPosY(55);
        _resalto.setPosx(60);
        _tmpmov = _MatrizLista.getHead();
        validarPalabra();
        

    }
    public void ingresaMatriz(){
        Nodo tmp= _MatrizLista.getHead();
        _MatrizLista.setData(tmp,"a");
        tmp=tmp.getNext();
        _MatrizLista.setData(tmp,"b");
        tmp=tmp.getNext();
        _MatrizLista.setData(tmp,"e");
        tmp=tmp.getNext();
        _MatrizLista.setData(tmp,"j");
        tmp=tmp.getNext();
        _MatrizLista.setData(tmp,"a");
    } 
    
    public void seleccionarPalabras() throws IOException{
        Nodo tmpl=_letras.getHead();// tmpLetras: Nodo que optiene la cabeza del la lista _letras para recorrerla
        Nodo tmpp=_coordenadas.getHead();// tmpPosiciones: Nodo obtiene la cabeza de la lista _coordenadas
        Random rand = new Random();
        int valor= rand.nextInt(_maximo);
      
        for(int i=valor;i!=0;i--){
            tmpl=_letras.listaGetNext(tmpl);     
        }
 
        int valor2 = rand.nextInt(_maximoNum);
        for(int i=valor2;i!=0;i--){
            tmpp=_coordenadas.listaGetNext(tmpp);
        }
        _maximo--;
        _maximoNum--;
        _PalabrasJ1.insertHead(_letras.getData(tmpl)); 
        _PoscicionesPJ1.insertHead(_coordenadas.getData(tmpp));
        //System.out.println("Palabra:"+((Palabra)(_letras.getData(tmpl))).getValorStr()+"  Poscioon"+_coordenadas.getData(tmpp));
        if(_maximoNum >=1){ 
            _coordenadas.delete(_coordenadas.getData(tmpp));
            
        }
        _letras.delete((_letras.getData(tmpl)));
        
    }
    
    public Lista matriz() throws IOException{
        Lista l = new  Lista();
        for(int i =0; i<255 ;i++){
            l.insertHead("");
        }
        return l;  
    }
    
    public void validarPalabra() throws IOException{
        validarHorizontal();
        
        
        
    }
    public boolean validarHorizontal( ) throws IOException{
        columna=0;
        fila=0;
        cond=true;
        while (columna<15  && cond==true){
            if (fila<15){
                if (_MatrizLista.getData(_tmpmov).equals("") && _tmpPalabra.equals("")){
                    System.out.print("1");
                    _tmpmov=_tmpmov.getNext();
                    fila+=1;
                }
                else if (_MatrizLista.getData(_tmpmov).equals("") && (_tmpPalabra.length()==1) && fila<15){
                    System.out.print("2");
                    _tmpPalabra="";
                    _tmpmov=_tmpmov.getNext();
                    fila+=1;
                }
                else if (_MatrizLista.getData(_tmpmov).equals("") && (_tmpPalabra.length()>1) && fila<15){
                    System.out.print("ENTRE");
                    if (leer(_tmpPalabra)==true){
                        System.out.print("3");
                        ultLet=fila;
                        posPal=Integer.toString(priLet)+Integer.toString(ultLet);
                        System.out.print(posPal);
                        _posPalabras.insertHead(posPal);  
                        _tmpmov=_tmpmov.getNext();
                        fila+=1;
                        ultLet=0;      
                    }
                    else {
                        cond= false;
                        System.out.print("4");
                        break;  
                    }
                }
                else if ((!_MatrizLista.getData(_tmpmov).equals(""))&& fila<15){
                    if (priLet==0){
                        System.out.print("5");
                        _tmpPalabra+=_MatrizLista.getData(_tmpmov);
                        System.out.print(_tmpPalabra);
                        _tmpmov=_tmpmov.getNext();
                        priLet=fila;
                        fila+=1;
                    }
                    else{
                        System.out.print("6");
                        _tmpPalabra+=_MatrizLista.getData(_tmpmov);
                        System.out.print(_tmpPalabra);
                        _tmpmov=_tmpmov.getNext();
                        fila+=1;
                    }
                }
            }
            else {
                System.out.print("7");
                fila=0;
                columna+=1;
            }
        }
        System.out.print("9");
        System.out.print(cond);
        return cond;  
    }
       
    public boolean validarVertical() throws IOException{
        cond=true;
        columna=0;
        fila=0;
        while (fila<15 && cond==true){
            if (columna==15){
                fila+=1;
                columna=0;
            }
            else{
                if (_MatrizLista.getData(_tmpmov).equals("") && _tmpPalabra.equals("")){
                    columna+=1;
                    _tmpmov=_tmpmov.getNext();
                }
                else if (_MatrizLista.getData(_tmpmov).equals("") && (_tmpPalabra.length()==1)&&columna<15 ){
                    System.out.print("2");
                    _tmpPalabra="";
                    cond=false;
                    priLet=0;
                    break;
                }
                else if (_MatrizLista.getData(_tmpmov).equals("") && (_tmpPalabra.length()>1)&&columna<15){
                    System.out.print("ENTRE");
                    if (leer(_tmpPalabra)==true){
                        System.out.print("3");
                        ultLet=columna;
                        posPal=Integer.toString(priLet)+Integer.toString(ultLet);
                        System.out.print(posPal);
                        _posPalabras.insertHead(posPal);  
                        _tmpmov=_tmpmov.getNext();
                        columna+=1;
                        ultLet=0;
                        priLet=0;
                    }
                    else {
                        System.out.print("4");
                        cond=false;
                        break;
                    }
                }
                else if ((!_MatrizLista.getData(_tmpmov).equals(""))&&columna<15){
                    if (priLet==0){
                        System.out.print("5");
                        _tmpPalabra+=_MatrizLista.getData(_tmpmov);
                        System.out.print(_tmpPalabra);
                        _tmpmov=_tmpmov.getNext();
                        priLet=columna;
                        columna+=1;
                    }
                    else{
                        System.out.print("6");
                        _tmpPalabra+=_MatrizLista.getData(_tmpmov);
                        System.out.print(_tmpPalabra);
                        _tmpmov=_tmpmov.getNext();
                        columna+=1;
                    }
                }
                else {
                    System.out.print("7");
                    fila+=1;
                    columna=0;
                }
            }
          
        }
        System.out.print("9");
        System.out.print(cond);
        return cond;
    }
    
    public boolean leer(String palabra) throws IOException{
        System.out.print(palabra);
        ListaDiccionario ld= new ListaDiccionario();
        Lista lds = ld.agregarTxt();
        return lds.buscar(palabra);
    }
    
}
   
