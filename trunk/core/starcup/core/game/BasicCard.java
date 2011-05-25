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
    private String attr;
    private String type;
    private String skillType;

    public String getName() {
        return this.name;
    }

    public String getNo() {
        return this.no;
    }

    public String getAttribute() {
        return this.attr;
    }

    public String getType() {
        return this.type;
    }
}
