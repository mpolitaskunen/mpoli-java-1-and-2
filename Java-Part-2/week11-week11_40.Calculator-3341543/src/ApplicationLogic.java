/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class ApplicationLogic {
    private int tulos;

    public void plus(int value) {
        this.tulos += value;
    }

    public void minus(int value) {
        this.tulos -= value;
    }

    public void reset() {
        this.tulos = 0;
    }

    public int result() {
        return this.tulos;
    }
}