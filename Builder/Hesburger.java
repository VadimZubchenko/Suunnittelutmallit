/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author vadimzubchenko
 */
public class Hesburger  extends BurgerBuilder{
    
    private Burger hamburger;

    public Hesburger() {
        this.hamburger = new Burger();
    }
    public Burger getBurger() {
        return this.hamburger;
    }
    
    public void buildBurgerKeros1() {
        hamburger.setHamburgerKerros1("sämpylä");
                
    }

    public void buildBurgerKeros2() {
        hamburger.setHamburgerKerros2("maustekurku");
    }

    public void buildBurgerKeros3() {
        hamburger.setHamburgerKerros3("naudanlihapihvi");
    }

    public void buildBurgerKeros4() {
        hamburger.setHamburgerKerros4("sipuli");
    }

    
   
    
}
