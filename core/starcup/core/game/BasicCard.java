/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import starcup.core.game.card.ICard;

/**
 *
 * @author Akira.Pan
 */
public class BasicCard implements ICard {

    private String no;
    private String name;

    public String getName() {
        return this.name;
    }

    public String getNo() {
        return this.no;
    }
}
