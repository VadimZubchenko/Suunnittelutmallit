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
public class Burger implements BurgerOsat {

    private String kerros1;
    private String kerros2;
    private String kerros3;
    private String kerros4;

    public String getKerros1() {
        return kerros1;
    }

    @Override
    public void setHamburgerKerros1(String kerros1) {
        this.kerros1 = kerros1;
    }

    public String getKerros2() {
        return kerros2;
    }

    @Override
    public void setHamburgerKerros2(String kerros2) {
        this.kerros2 = kerros2;
    }

    public String getKerros3() {
        return kerros3;
    }

    @Override
    public void setHamburgerKerros3(String kerros3) {
        this.kerros3 = kerros3;
    }

    public String getKerros4() {
        return kerros4;
    }

    @Override
    public void setHamburgerKerros4(String kerros4) {
        this.kerros4 = kerros4;
    }
    
    
}
