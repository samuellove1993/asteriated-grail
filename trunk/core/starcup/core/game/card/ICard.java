/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game.card;

/**
 *
 * @author Administrator
 */
public interface ICard {
    /*卡牌名称*/

    public String getName();
    /*卡牌编号*/

    public String getNo();

    public String getType();

    public String getAttribute();
}
