/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game.card;

import starcup.core.game.card.Card;
import java.util.ArrayList;
import java.util.List;

/**
 * 基本的套牌
 * @author Akira.Pan
 */
public class Deck {
    /*游戏使用的套牌组合*/

    private List<Card> allCards = new ArrayList<Card>();

    public List<Card> getAllCards() {
        return allCards;
    }

    public void setAllCards(List<Card> allCards) {
        this.allCards = allCards;
    }
}