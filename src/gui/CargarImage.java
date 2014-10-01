/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class CargarImage {
    public BufferedImage loadImage(String ruta) throws IOException{
        URL url= this.getClass().getResource(ruta);
        BufferedImage img = ImageIO.read(url);
        return img;
    }
}
