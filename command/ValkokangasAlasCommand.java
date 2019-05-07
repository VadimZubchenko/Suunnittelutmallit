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
// Concrete Command
public class ValkokangasAlasCommand implements Command {

    Receiver receiver;

    public ValkokangasAlasCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.Alas();
    }

}
