/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsibility;

/**
 *
 * @author vadimzubchenko
 */
class LahiEsimies extends Palkankorotus_abstract {
    
    protected double getAllowable(){
        return BASE-2;
    }

    protected String getRole(){
        return "Lähiesimies";
    }
}
