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
public class Main {
    public static void main(String[] args) {
        
        BurgerBuilder hesburgerBurger = new Hesburger();
        
        BurgerDirector burgerEngineer = new BurgerDirector(hesburgerBurger);
        
        burgerEngineer.makeBurger();
        
        Burger hesburger = burgerEngineer.getBurger();
        
        System.out.println("Hesburger: ");
        
        System.out.println(hesburger.getKerros1());
        System.out.println(hesburger.getKerros2());
        System.out.println(hesburger.getKerros3());
        System.out.println(hesburger.getKerros4());
        
        System.out.println("");
        
        BurgerBuilder hampuriBurger = new Hampurilainen();
        
        BurgerDirector burgerEngineer2 = new BurgerDirector(hampuriBurger);
        
        burgerEngineer2.makeBurger();
        
        
        Burger hampurilainen = burgerEngineer2.getBurger();
        
        System.out.println("Hampurilainen:");
                
        System.out.println(hampurilainen.getKerros1());
        System.out.println(hampurilainen.getKerros2());
        System.out.println(hampurilainen.getKerros3());
        System.out.println(hampurilainen.getKerros4());
        
    }
}
