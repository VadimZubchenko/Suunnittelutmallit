/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author vadimzubchenko
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LaiteOsa motherboard = new Emolevy("Emolevy",140);
        LaiteOsa ram = new Ram("Ram",60); 
        LaiteOsa verkkokortti = new Verkkokortti("Verkkokortti", 40);
        LaiteOsa naytonohjain = new Naytonohjain("Näytonohjain", 300);
        LaiteOsa processor = new Prosessori("Prosessori",500);
        LaiteOsa comp = new Kotelo("Pöytätietokone 'Iskra'", 50);
        
        
        comp.add(processor);
        comp.add(verkkokortti);
        comp.add(naytonohjain);
        comp.add(motherboard);
        comp.add(ram);
        // tietokoneen loppullinen hinta ja sen sisältävät osat. 
        comp.print();
    }
    
}
