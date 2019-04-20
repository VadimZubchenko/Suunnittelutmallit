/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;

/**
 *
 * @author vadimzubchenko
 */
public class Hampurilainen extends BurgerBuilder {

    public Burger burger;
    public ArrayList<String> hampuri;

    
    public Hampurilainen() {
        this.burger = new Burger();
        
        hampuri = new ArrayList<String>();
        hampuri.add("hampurilaissämpylä");
        hampuri.add("kuivasipuli");
        hampuri.add("naudanlihapihvi");
        hampuri.add("suolakurkku");
        
    }
    
    public Burger getBurger() {
        return this.burger;
    }

    public void buildBurgerKeros1() {
        burger.setHamburgerKerros1(hampuri.get(0));

    }

    public void buildBurgerKeros2() {
        burger.setHamburgerKerros2(hampuri.get(1));

    }

    public void buildBurgerKeros3() {
        burger.setHamburgerKerros3(hampuri.get(2));

    }

    public void buildBurgerKeros4() {
        burger.setHamburgerKerros4(hampuri.get(3));

    }


}
