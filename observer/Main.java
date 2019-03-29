/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author vadimzubchenko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        
        DigitalClock digiClock = new DigitalClock(clockTimer);
        
        clockTimer.addObserver(digiClock);
        
        new Thread(clockTimer).start();
    }

}
