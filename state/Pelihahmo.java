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
public class Pelihahmo {

    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.fly();
        context.fly();
        System.out.println(" ");
        
        context.disapper();
        context.disapper();
        System.out.println(" ");

        context.wizard();
        context.wizard();

    }

}
