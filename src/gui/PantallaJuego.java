package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import logic.Palabra;

public class PantallaJuego extends JFrame{
    private BufferedImage _imageFondo;
    private BufferedImage _imageResalto;
    private BufferedImage _imagePalabra;
    int y=57;
    int x=55;
    private Image imagen;
    private Graphics grd;
    private Palabra _fondo;
    
    private Palabra palabra;
    public PantallaJuego(){
        setSize(1333,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        _fondo=new Palabra("/Image/Fondo1.png",0,"",1365,750);
        
        palabra=new Palabra("/Image/palabraA.png",0,"",48,44);
        _fondo.setPosY(20);
        _fondo.setPosx(5);
        palabra.setPosY(55);
        palabra.setPosx(60);
        
    }
  
    @Override
    public void paint(Graphics g){
        imagen = createImage(getWidth(),getHeight());
        grd= imagen.getGraphics();
        paintComponents(grd);
        g.drawImage(imagen, 0, 0, this);
    }  
    
    @Override
    public void paintComponents(Graphics g){
        // En y mover 43 en x mover 48;
        //g.drawImage(_imageFondo,0,20, this);
        g.drawImage(_fondo.getImage(),_fondo.getPosx(),_fondo.getPosY(),this);
        /*g.drawImage(palabra.getImage(),palabra.getPosx(),palabra.getPosY(),this);
        g.drawImage(_resalto.getImage(),_resalto.getPosx(),_resalto.getPosY(),this);
        palabra.setPosx(_resalto.getPosx());
            palabra.setPosY(_resalto.getPosY());
        if(_resalto.getRectangle().intersects(palabra.getRectangle())){
            System.out.println("intersect");
            _resalto.setPosx(_resalto.getPosx()+48);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(PantallaJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        // MANEJAR CON SUBINDICES MANEJAR RANGOS.. SI RANGO CAMBIA HAY NUEVA PALABRA. SOLO RECORRER 2 LINEAS PARA VALIDAR PALABRAS.
        
        
        /*g.drawImage(_imagePalabra,285,715,this);
        g.drawImage(_imagePalabra,340,715,this);
        g.drawImage(_imagePalabra,395,715,this);
        g.drawImage(_imagePalabra,450,715,this);
        g.drawImage(_imagePalabra,505,715,this);
        g.drawImage(_imagePalabra,560,715,this);
        g.drawImage(_imageResalto,x,y, this);
        Rectangle m = new Rectangle(x, y, 48,44);*/
       
        repaint();
    }
    
    }

