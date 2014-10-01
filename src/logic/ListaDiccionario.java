/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author estadm
 */
public class ListaDiccionario {// Organiza el diccionario en una lista sugun orden alfabetico.
    public Lista  agregarTxt() throws IOException{
        BufferedReader br = null;
        FileReader freader;
        LeerTXt leer = new LeerTXt();
        freader=leer.getFile();
        br = new BufferedReader(freader);
        String linea;
        
        Lista ListaPrincipal;
        
        Lista H = new Lista();
        Lista A = new Lista();
        Lista B = new Lista();
        Lista C = new Lista();
        Lista D = new Lista();
        Lista E = new Lista();
        Lista F = new Lista();
        Lista G = new Lista();
        Lista I = new Lista();
        Lista J = new Lista();
        Lista K = new Lista();
        Lista L = new Lista();
        Lista M = new Lista();
        Lista N = new Lista();
        Lista O = new Lista();
        Lista P = new Lista();
        Lista Q = new Lista();
        Lista R = new Lista();
        Lista S = new Lista();
        Lista T = new Lista();
        Lista U = new Lista();
        Lista V = new Lista();
        Lista W = new Lista();
        Lista X = new Lista();
        Lista Y = new Lista();
        Lista Z = new Lista();
            
        while((linea=br.readLine())!=null){
            if(linea.substring(0,1).equals("a"))
                A.insertHead(linea);
            else if(linea.substring(0,1).equals("b"))
                B.insertHead(linea);
            else if(linea.substring(0,1).equals("c"))
                C.insertHead(linea);
            else if(linea.substring(0,1).equals("d"))
                D.insertHead(linea);
            else if(linea.substring(0,1).equals("e"))
                E.insertHead(linea);
            else if(linea.substring(0,1).equals("f"))
                F.insertHead(linea);
            else if(linea.substring(0,1).equals("g"))
                G.insertHead(linea);
            else if(linea.substring(0,1).equals("h"))
                H.insertHead(linea);
            else if(linea.substring(0,1).equals("i"))
                I.insertHead(linea);
            else if(linea.substring(0,1).equals("j"))
                J.insertHead(linea);
            else if(linea.substring(0,1).equals("k"))
                K.insertHead(linea);
            else if(linea.substring(0,1).equals("l"))
                L.insertHead(linea);
            else if(linea.substring(0,1).equals("m"))
                M.insertHead(linea);
            else if(linea.substring(0,1).equals("n"))
                N.insertHead(linea);
            else if(linea.substring(0,1).equals("o"))
                O.insertHead(linea);
            else if(linea.substring(0,1).equals("p"))
                P.insertHead(linea);
            else if(linea.substring(0,1).equals("q"))
                Q.insertHead(linea);
            else if(linea.substring(0,1).equals("r"))
                R.insertHead(linea);
            else if(linea.substring(0,1).equals("s"))
                S.insertHead(linea);
            else if(linea.substring(0,1).equals("u"))
                U.insertHead(linea);
            else if(linea.substring(0,1).equals("t"))
                T.insertHead(linea);
            else if(linea.substring(0,1).equals("v"))
                V.insertHead(linea);
            else if(linea.substring(0,1).equals("w"))
                W.insertHead(linea);
            else if(linea.substring(0,1).equals("x"))
                X.insertHead(linea);
            else if(linea.substring(0,1).equals("y"))
                Y.insertHead(linea);
            else if(linea.substring(0,1).equals("z"))
                Z.insertHead(linea);       
        }
         
        ListaPrincipal = new Lista();
        ListaPrincipal.insertHead(A);
        ListaPrincipal.insertHead(B);
        ListaPrincipal.insertHead(C);
        ListaPrincipal.insertHead(D);
        ListaPrincipal.insertHead(E);
        ListaPrincipal.insertHead(F);
        ListaPrincipal.insertHead(G);
        ListaPrincipal.insertHead(H);
        ListaPrincipal.insertHead(I);
        ListaPrincipal.insertHead(J);
        ListaPrincipal.insertHead(K);
        ListaPrincipal.insertHead(L);
        ListaPrincipal.insertHead(M);
        ListaPrincipal.insertHead(N);
        ListaPrincipal.insertHead(O);
        ListaPrincipal.insertHead(P);
        ListaPrincipal.insertHead(Q);
        ListaPrincipal.insertHead(R);
        ListaPrincipal.insertHead(S);
        ListaPrincipal.insertHead(T);
        ListaPrincipal.insertHead(U);
        ListaPrincipal.insertHead(V);
        ListaPrincipal.insertHead(W);
        ListaPrincipal.insertHead(X);
        ListaPrincipal.insertHead(Y);
        ListaPrincipal.insertHead(Z);
        
        return ListaPrincipal;
    }
    
}
