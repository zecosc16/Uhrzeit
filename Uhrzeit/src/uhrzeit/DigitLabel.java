/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhrzeit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author oskar
 */
public class DigitLabel extends JLabel {

    public void setDigit(int digit) throws Exception {
        if (digit < 0 || digit > 9) {
            throw new Exception("Out of range");
        }
        switch (digit) {
            case 0:
                this.setIcon(Digits.Zero.getImage());
                break;
            case 1:
                this.setIcon(Digits.One.getImage());
                break;
            case 2:
                this.setIcon(Digits.Two.getImage());
                break;
            case 3:
                this.setIcon(Digits.Three.getImage());
                break;
            case 4:
                this.setIcon(Digits.Four.getImage());
                break;
            case 5:
                this.setIcon(Digits.Five.getImage());
                break;
            case 6:
                this.setIcon(Digits.Six.getImage());
                break;
            case 7:
                this.setIcon(Digits.Seven.getImage());
                break;
            case 8:
                this.setIcon(Digits.Eigth.getImage());
                break;
            case 9:
                this.setIcon(Digits.Nine.getImage());
                break;

        }
    }

}
