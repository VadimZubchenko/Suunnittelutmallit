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
public class StateContext {

    private State state = new WarlockState();

    public void fly() {
        System.out.println("Olen " + state.getName());
        state.fly(this);

    }

    public void wizard() {
        System.out.println("Olen " + state.getName());
        state.wizard(this);
    }

    public void disapper() {
        System.out.println("Olen " + state.getName());
        state.disapper(this);
    }

    public void changgeState(State state) {
        System.out.println("Olen muuttunut " + state.getName() + "iksi...");
        this.state = state;
    }
    
}
