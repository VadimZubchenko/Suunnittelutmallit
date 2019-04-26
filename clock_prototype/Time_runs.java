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
public class Time_runs implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        Clock clock = new Clock("Clock");
        Clock clone = (Clock) clock.clone();
        clone.setClock("Clone");
        while (count <= 8) {
            System.out.println(clock);
            System.out.println(clone);

            clock.addTime();
            clone.addTime();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 2) {
                System.out.println("Clock has been restarted: \n");
                clock.setAika(0, 0, 0);

            } else if (count == 4) {
                System.out.println("Clone has been restarted: \n");
                clone.setAika(0, 0, 0);
            } else if (count == 6) {
                System.out.println("Clock & clone has been synchronized: \n");
                clock.setAika(0, 0, 6);
                clone.setAika(0, 0, 6);
            }
            count++;

        }
    }
}
