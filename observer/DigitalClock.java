/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * @author vadimzubchenko
 */
public class DigitalClock implements Observer{
    private int hour;
    private int minute;
    private int second;
    private ClockTimer timer;
    
    
    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
        
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o == timer){
            draw();
        }
    }
    private void draw(){
        this.hour = timer.getHour();
        this.minute = timer.getMinute();
        this.second = timer.getSecond();
        
        System.out.println("Nyt kello on: " + hour + " tuntia, " + minute + " minuttia ja " + second + " sekuntia.");
        
    }   
   
}

    

