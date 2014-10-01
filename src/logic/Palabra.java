/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;
import gui.CargarImage;
import gui.Sprite;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/**
 *
 * @author estadm
 */
public class Palabra {
    private String _rutaImagen;
    private int _puntos;
    private String _valorStr;
    private int _tamX;
    private int _tamY;
    private int _posX;
    private int _posY;
    private BufferedImage _Image;
    
    public Palabra(String ruta,int valor,String valorstr,int tamx,int tamy){
        this._rutaImagen=ruta;
        this._puntos=valor;
        this._valorStr=valorstr;
        this._tamX=tamx;
        this._tamY= tamy;
        setImage(ruta,tamx,tamy);
    }
    public int getValorNum(){
        return _puntos;
    }
    public String getValorStr(){
        return _valorStr;
    }
    public void setPosx(int posX){
        this._posX=posX;
    }
    public int getPosx(){
        return this._posX;
    }
    public void setPosY(int posY){
        this._posY=posY;
    }
    public int getPosY(){
        return this._posY;
    }
    public BufferedImage getImage(){
        return _Image;
    }
    public Rectangle getRectangle(){
        Rectangle r = new Rectangle(_posX, _posY,_tamX,_tamY);
        return r;
    }
    
    private void setImage(String ruta,int tamx,int tamy){
        CargarImage loaders = new CargarImage();
        BufferedImage Image= null;
        try {
            Image = loaders.loadImage(ruta);
        } catch (Exception e) {
        }
        Sprite sFondo = new Sprite(Image);
        _Image= sFondo.grabsprite(0, 0,tamx,tamy);  
        
    }
    
}
