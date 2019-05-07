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
public class Memory {

    int position;

    public void load(int position, byte[] data) {

        this.position = data[position];

        System.out.println("Loading to memory: " + this.position);

    }
}
