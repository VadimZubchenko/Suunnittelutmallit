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
// tapa2 Olioadapteri
public class BensaSahkoAdapteri2 implements MoottoriKaynistaminen {

    // luodaan adaptee(PriusHybrid) olion
    PriusHybrid ph;

    public BensaSahkoAdapteri2(PriusHybrid ph) {
        this.ph = ph;
    }

    @Override
    public void kaadaPoltoaine() {

        ph.lataaAkku();// delegoidaan tehtäväpyynto PriusHyblrid oliolle
    }

    @Override
    public void kaannaAvain() {
        ph.painaStart();
    }

    @Override
    public void painaKaasu() {
        ph.lisaaJannitetta();
    }

}

