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
public interface Action {

    void drawCard(int number);

    void playCard(Card card);

    void buy();

    void compose();

    void extract();
}
