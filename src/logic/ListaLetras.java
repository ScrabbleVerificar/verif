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
 */
public class ListaLetras {

    /**
     *
     * @return
     * @throws IOException
     */
    public Lista palabras() throws IOException{
        Lista palabras = new Lista();
        Palabra A= new Palabra("/Image/palabraA.png",1,"a",48,44);
        Palabra B= new Palabra("/Image/palabraB.png",3,"b", 48,44);
        Palabra C= new Palabra("/Image/palabraC.png",3,"c", 48,44);
        Palabra D= new Palabra("/Image/palabraD.png",2,"d", 48,44);
        Palabra E= new Palabra("/Image/palabraE.png",1,"e", 48,44);
        Palabra F= new Palabra("/Image/palabraF.png",4,"f", 48,44);
        Palabra G= new Palabra("/Image/palabraG.png",2,"g", 48,44);
        Palabra H= new Palabra("/Image/palabraH.png",4,"h", 48,44);
        Palabra I= new Palabra("/Image/palabraI.png",1,"i", 48,44);
        Palabra J= new Palabra("/Image/palabraJ.png",8,"j", 48,44);
        Palabra K= new Palabra("/Image/palabraK.png",5,"k", 48,44);
        Palabra L= new Palabra("/Image/palabraL.png",1,"l", 48,44);
        Palabra M= new Palabra("/Image/palabraM.png",3,"m", 48,44);
        Palabra N= new Palabra("/Image/palabraN.png",1,"n", 48,44);
        Palabra O= new Palabra("/Image/palabraO.png",1,"o", 48,44);
        Palabra P= new Palabra("/Image/palabraP.png",3,"p", 48,44);
        Palabra Q= new Palabra("/Image/palabraQ.png",10,"q", 48,44);
        Palabra R= new Palabra("/Image/palabraR.png",1,"r", 48,44);
        Palabra S= new Palabra("/Image/palabraS.png",1,"s", 48,44);
        Palabra T= new Palabra("/Image/palabraT.png",1,"t", 48,44);
        Palabra U= new Palabra("/Image/palabraU.png",1,"u", 48,44);
        Palabra V= new Palabra("/Image/palabraV.png",4,"v", 48,44);
        Palabra W= new Palabra("/Image/palabraW.png",4,"w", 48,44);
        Palabra X= new Palabra("/Image/palabraX.png",8,"x", 48,44);
        Palabra Y= new Palabra("/Image/palabraY.png",4,"y", 48,44);
        Palabra Z= new Palabra("/Image/palabraZ.png",10,"z", 48,44);
        
        
        
        palabras.insertHead(A);
        palabras.insertHead(B);
        palabras.insertHead(C);
        palabras.insertHead(D);
        palabras.insertHead(E);
        palabras.insertHead(F);
        palabras.insertHead(G);
        palabras.insertHead(H);
        palabras.insertHead(I);
        palabras.insertHead(J);
        palabras.insertHead(K);
        palabras.insertHead(L);
        palabras.insertHead(M);
        palabras.insertHead(N);
        palabras.insertHead(O);
        palabras.insertHead(P);
        palabras.insertHead(Q);
        palabras.insertHead(R);
        palabras.insertHead(S);
        palabras.insertHead(T);
        palabras.insertHead(U);
        palabras.insertHead(V);
        palabras.insertHead(W);
        palabras.insertHead(X);
        palabras.insertHead(Y);
        palabras.insertHead(Z);
        return palabras;
    }
    public Lista numerosLetras() throws IOException{
        Lista numerosPalabras = new Lista();
        numerosPalabras.insertHead(9);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(4);
        numerosPalabras.insertHead(12);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(3);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(9);
        numerosPalabras.insertHead(1);
        numerosPalabras.insertHead(1);
        numerosPalabras.insertHead(4);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(6);
        numerosPalabras.insertHead(8);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(1);
        numerosPalabras.insertHead(6);
        numerosPalabras.insertHead(4);
        numerosPalabras.insertHead(6);
        numerosPalabras.insertHead(4);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(1);
        numerosPalabras.insertHead(2);
        numerosPalabras.insertHead(1);
        return numerosPalabras;
    }
    public Lista letras() throws IOException{
        int cont=0;
        Lista letra = new Lista();
        Lista numeros= numerosLetras();
        Lista palabras = palabras();
        Nodo tmp=numeros.getHead();
        Nodo tmp2=palabras.getHead();
        for(int i=0;i<26;i++){
            for(int j = (int)(numeros.getData(tmp));j>0;j--){
                letra.insertHead(((Palabra)(palabras.getData(tmp2)))); 
            }
            cont++;
            tmp=numeros.listaGetNext(tmp);
            tmp2=palabras.listaGetNext(tmp2);
        }
        return letra;
    }
    
}
