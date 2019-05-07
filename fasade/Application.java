/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasade;

/**
 *
 * @author vadimzubchenko
 */
public class Application {
    public static void main(String[] args) {
       ComputerFasade booting = new ComputerFasade();
        booting.startComputer();
    }
}
