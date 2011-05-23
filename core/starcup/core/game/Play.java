/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import starcup.core.game.card.ICard;

/**
 *
 * @author Administrator
 */
public interface Play {
    /**玩家摸一张牌*/
    void drawCard(ICard card);
    /**玩家打出一张牌*/
    void playCard(ICard card);
    /**执行购买动作*/
    void buy();
    /**执行合成动作*/
    void compose();
    /*执行提炼动作*/
    void extract();
}
