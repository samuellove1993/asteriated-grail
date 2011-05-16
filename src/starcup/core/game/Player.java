/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import starcup.core.component.Card;

/**
 *
 * @author Administrator
 */
public class Player implements Action {

    private int cardLimit = 6;

    public void buy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void compose() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void drawCard(int number) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void extract() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void playCard(Card card) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(int cardLimit) {
        this.cardLimit = cardLimit;
    }
    
}
