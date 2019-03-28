/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhrzeit;

import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author oskar
 */
public class Clock extends JPanel implements Runnable {

    private LocalTime time;
    private DigitLabel[] digits = {new DigitLabel(), new DigitLabel(), new DigitLabel(), new DigitLabel(), new DigitLabel(), new DigitLabel(),
         new DigitLabel(), new DigitLabel()};

    private int sec, min, h;

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Clock(LocalTime time) {
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(1, 8));
        this.time = time;

        for (DigitLabel digit : digits) {
            this.add(digit);
        }
        digits[2].setIcon(Digits.Dots.getImage());
        digits[5].setIcon(Digits.Dots.getImage());

        this.setImg();
        sec = time.getSecond();
        h = time.getHour();
        min = time.getMinute();

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
            time = time.plusSeconds(1);

            this.setImg();
        }
    }

    public void setImg() {
        try {
            digits[0].setDigit(time.getHour() / 10);
            digits[1].setDigit(time.getHour() % 10);
            digits[3].setDigit(time.getMinute() / 10);
            digits[4].setDigit(time.getMinute() % 10);
            digits[6].setDigit(time.getSecond() / 10);
            digits[7].setDigit(time.getSecond() % 10);

        } catch (Exception ex) {
            Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
