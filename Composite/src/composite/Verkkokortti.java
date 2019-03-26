/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author vadimzubchenko
 */
public class Verkkokortti implements LaiteOsa {

    public String name;
    public double hinta;

    public Verkkokortti(String name, double hinta) {
        this.name = name;
        this.hinta = hinta;
    }
    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHinta() {
        return hinta;
    }

    @Override
    public void print() {

        System.out.println("-------------");
        System.out.println("Name = " + getName());
        System.out.println("Hinta = " + getHinta());
        System.out.println("-------------");
    }

    @Override
    public void add(LaiteOsa osa) {
        // ei toimi täällä, sillä se on node 
    }

    @Override
    public LaiteOsa getChild(int i) {
        // ei toimi täällä, sillä se on node 
        return null;

    }

    @Override
    public void remove(LaiteOsa osa) {
        // ei toimi täällä, sillä se on node 
    }

}
