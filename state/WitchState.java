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
public class WitchState implements State {
    private static final String name = "Witch";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly(StateContext context) {
        System.out.println("ROX POX FOX... Olen noussut metsän ylle");
    }

    @Override
    public void wizard(StateContext context) {
        context.changgeState(new WarlockState());
    }

    @Override
    public void disapper(StateContext context) {
        context.changgeState(new NecromancerState());
    }
    
}
