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
public class BurgerDirector {
    
    private BurgerBuilder burgerBuilder;

    public BurgerDirector(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }
    
    public Burger getBurger(){
        
        return this.burgerBuilder.getBurger();
    }
     
    public void makeBurger() {
        burgerBuilder.CreateNewBurger();
        this.burgerBuilder.buildBurgerKeros1();
        this.burgerBuilder.buildBurgerKeros2();
        this.burgerBuilder.buildBurgerKeros3();
        this.burgerBuilder.buildBurgerKeros4();
    }
    
}
