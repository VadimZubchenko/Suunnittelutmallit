/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsibility;

/**
 *
 * @author vadimzubchenko
 */
public abstract class Palkankorotus_abstract {
    
    protected static final double BASE = 5;
    protected Palkankorotus_abstract successor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    public void setSuccessor(Palkankorotus_abstract successor) {
        this.successor = successor;
    }

    public void processRequest(KorotusRequest request){
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " pystyy hyväksymään % " + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        } else {
            System.out.println(this.getRole() + ": Ei missään nimissä hyväksyin % " + request.getAmount());
        }
    }
}
