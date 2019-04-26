/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock_prototype;

/**
 *
 * @author vadimzubchenko
 */
public class Clock implements Cloneable {

    private Viisari hour, minute, second;
    private String clock;

    public Clock(String kello) {
        this.hour = new Viisari(0);
        this.minute = new Viisari(0);
        this.second = new Viisari(0);
        this.clock = kello;
    }

    public void setHour(Viisari hour) {
        this.hour = hour;
    }

    public void setMinute(Viisari minute) {
        this.minute = minute;
    }

    public void setSecond(Viisari second) {
        this.second = second;
    }

    public void addTime() {
        if (this.second.getAika() == 59 && this.minute.getAika() == 59 && this.hour.getAika() == 23) {
            this.second.setAika(0);
            this.minute.setAika(0);
            this.hour.setAika(0);
        } else if (this.second.getAika() == 59 && this.minute.getAika() == 59) {
            this.hour.addTime();
            this.second.setAika(0);
            this.minute.setAika(0);
        } else if (this.second.getAika() == 59) {
            this.minute.addTime();
            this.second.setAika(0);
        } else {
            this.second.addTime();
        }
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public void setAika(int hour, int min, int sec) {
        this.hour.setAika(hour);
        this.minute.setAika(min);
        this.second.setAika(sec);
    }

    @Override
    public Object clone() {
        Clock kello = null;
        try {
            kello = (Clock) super.clone();
            kello.setHour((Viisari) hour.clone());
            kello.setMinute((Viisari) minute.clone());
            kello.setSecond((Viisari) second.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return kello;
    }

    @Override
    public String toString() {
        return this.clock + ": " + hour.getAika() + ":" + minute.getAika() + ":" + second.getAika() + "\n";
    }
}
