/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author seppo.taskunen
 */
public class AtLeastOne implements Criterion {
    private Criterion[] crit;
    
    public AtLeastOne(Criterion... crit) {
        this.crit = crit;
    }

    @Override
    public boolean complies(String line) {
        for(Criterion c:this.crit) {
            if(c.complies(line)) {
                return true;
            }
        }
        return false;
    }
    
    
}
