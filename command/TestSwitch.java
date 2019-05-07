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
public class TestSwitch {
    public static void main(String[] args) {
        
        Receiver receiver = new Receiver();
        
        Command alas = new ValkokangasAlasCommand(receiver);
        Command ylos = new ValkokangasYlosCommand(receiver);
        
        Switcher nappi = new Switcher(alas, ylos);
        nappi.kangasAlas();
        nappi.kangasYlos();
        
               
    }
}
