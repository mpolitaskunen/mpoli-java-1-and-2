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
public class LengthAtLeast implements Criterion{
    private int length;
    
    public LengthAtLeast(int length) {
        this.length = length;
    }
    
    @Override
    public boolean complies(String line) {
        if(line.length() >= this.length) {
            return true;
        }
        return false;
    }
    
}
