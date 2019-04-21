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
// tapa1 Luokka-adapteri
public class BensaSahkoAdapteri extends PriusHybrid implements MoottoriKaynistaminen {

    @Override
    public void kaadaPoltoaine() {
        lataaAkku();
    }

    @Override
    public void kaannaAvain() {
        painaStart();
    }

    @Override
    public void painaKaasu() {
        lisaaJannitetta();
    }
}
