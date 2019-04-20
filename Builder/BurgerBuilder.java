/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author vadimzubchenko
 */
abstract class BurgerBuilder {

    protected Burger hamburger;

    public void CreateNewBurger() {
        this.hamburger = new Burger();
    }
    
    public Burger getBurger() {
        return hamburger;
    }
    
    
    abstract void buildBurgerKeros1();

    abstract void buildBurgerKeros2();

    abstract void buildBurgerKeros3();

    abstract void buildBurgerKeros4();
    
    
    
}
