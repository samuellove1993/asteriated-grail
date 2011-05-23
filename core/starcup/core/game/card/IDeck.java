/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game.card;

import java.util.List;

/**
 * 基本的套牌类，主要负责组织一副使用的基本手牌库
 * @author Administrator
 */
public interface IDeck {

    /**
     * 获取当前所有的卡牌列表
     * @return 
     */
    public List<ICard> getAllCards();

    /**
     * 获取所有剩余的卡牌
     * @return 
     */
    public List<ICard> getRestCards();

    /**
     * 洗牌，打牌卡牌顺序
     */
    public void shuffle(IDeck IDeck);
}
