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
public class NecromancerState implements State {
    private static final String name = "Necromancer";

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
        context.changgeState(new WarlockState());
    }

    @Override
    public void disapper(StateContext context) {
        System.out.println("RAX PAX FAX, Olen näkymätön.");
    }
    
}
