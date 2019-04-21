/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author vadimzubchenko
 */
public class AdapterMain {

    public static void main(String[] args) {
        // tapa1 Luokka-adapteri
        MoottoriKaynistaminen electroCar = new BensaSahkoAdapteri();
        electroCar.kaadaPoltoaine();
        electroCar.kaannaAvain();
        electroCar.painaKaasu();

        // tapa2 olioadapteri (luonnisssa välitetään Adaptee-olio(new PriusHybrid, jolle deligoidaan tehtäväpyynnöt
        PriusHybrid ph = new PriusHybrid();
        MoottoriKaynistaminen electroCar2 = new BensaSahkoAdapteri2(ph);
        electroCar2.kaadaPoltoaine();
        electroCar2.kaannaAvain();
        electroCar2.painaKaasu();

    }
}






