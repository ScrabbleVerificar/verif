/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.image.BufferedImage;

public class Sprite {
    private BufferedImage spriteSheet;
    
    public Sprite(BufferedImage ss){
        this.spriteSheet=ss;    
    }
    public BufferedImage grabsprite(int x,int y, int with, int height){
        BufferedImage sprite = spriteSheet.getSubimage(x, y, with, height);
        return sprite;
    } 
}
