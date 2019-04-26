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
public class Viisari implements Cloneable{

    private int aika;

    public Viisari(int aika) {
        this.aika = aika;
    }

    public int getAika() {
        return this.aika;
    }

    public void setAika(int aika) {
        this.aika = aika;
    }

    public void addTime() {
        aika += 1;
    }

    @Override
    public Object clone() {
        Viisari viisari = null;
        try {
            viisari = (Viisari) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return viisari;
    }
}
