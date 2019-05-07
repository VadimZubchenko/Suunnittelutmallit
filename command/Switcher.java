/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author vadimzubchenko
 */
// invoiker
public class Switcher {
    Command alas, ylos;

    public Switcher(Command alas, Command ylos) {
        this.alas = alas;
        this.ylos = ylos;
    }
    void kangasAlas(){
        alas.execute();
    }
     void kangasYlos(){
        ylos.execute();
    }
}
