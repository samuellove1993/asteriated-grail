/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import starcup.core.game.card.ICard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Player implements Play {
    /*手牌上限，默认6张*/

    private int cardLimit = 6;
    /*手牌*/
    private List<ICard> handCards;

    public Player() {
        handCards = new ArrayList<ICard>(10);
    }

    public void buy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void compose() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void drawCard(ICard card) {
        this.handCards.add(card);
    }

    public void extract() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void playCard(ICard card) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(int cardLimit) {
        this.cardLimit = cardLimit;
    }

    public List<ICard> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<ICard> handCards) {
        this.handCards = handCards;
    }
}
