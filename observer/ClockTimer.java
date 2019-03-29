/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/**
 *
 * @author vadimzubchenko
 */
public class ClockTimer extends Observable implements Runnable{
    
    Calendar calendar;
    private int hour;
    private int minute;
    private int second;
    
   
    public ClockTimer() {
    }
    
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void run(){
        while(true){
            tick();
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
    void tick(){
        GregorianCalendar gregorinkalenteri = new GregorianCalendar();
        this.hour = gregorinkalenteri.get(GregorianCalendar.HOUR_OF_DAY);
        this.second = gregorinkalenteri.get(GregorianCalendar.MINUTE); 
        this.minute = gregorinkalenteri.get(GregorianCalendar.SECOND);
        setChanged();
        notifyObservers();
    }
    
}
