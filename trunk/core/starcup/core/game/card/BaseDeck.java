/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game.card;

import java.util.ArrayList;
import java.util.List;

/**
 * 基本Deck类实现大部分共有操作
 * @author Administrator
 */
public abstract class BaseDeck {
    /*游戏使用的套牌组合*/

    private List<ICard> allCards = new ArrayList<ICard>();

    public List<ICard> getAllCards() {
        return allCards;
    }

    public void setAllCards(List<ICard> allCards) {
        this.allCards = allCards;
    }
}
