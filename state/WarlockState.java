/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author vadimzubchenko
 */
public class WarlockState implements State {
    private static final String name = "Warlock";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly(StateContext context) {
        context.changgeState(new WitchState());
    }

    @Override
    public void wizard(StateContext context) {
        System.out.println("REX PEX FEX! Olen muutunut hiiriksi");
    }

    @Override
    public void disapper(StateContext context) {
        System.out.println(new NecromancerState());
    }

   
    
}
