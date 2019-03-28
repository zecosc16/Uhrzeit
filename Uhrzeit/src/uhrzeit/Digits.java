/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhrzeit;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author oskar
 */
public enum Digits {
    One(new ImageIcon("./Icons/1.png")),
    Two(new ImageIcon("./Icons/2.png")),
    Three(new ImageIcon("./Icons/3.png")),
    Four(new ImageIcon("./Icons/4.png")),
    Five(new ImageIcon("./Icons/5.png")),
    Six(new ImageIcon("./Icons/6.png")),
    Seven(new ImageIcon("./Icons/7.png")),
    Eigth(new ImageIcon("./Icons/8.png")),
    Nine(new ImageIcon("./Icons/9.png")),
    Zero(new ImageIcon("./Icons/0.png")),
    Dots(new ImageIcon("./Icons/sdots.png"));

    private ImageIcon image;

    private Digits(ImageIcon image) {
        this.image = image;
    }

    public ImageIcon getImage() {
        return image;
    }

}
