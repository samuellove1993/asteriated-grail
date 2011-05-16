/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.ui.card;

import javax.swing.JLabel;
import starcup.ui.desk.PlayerDesk;

/**
 *
 * @author Akira.Pan
 */
public class Card extends JLabel implements starcup.core.component.Card {

    private boolean seleceted = false;

    public Card() {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(starcup.StarCupApp.class).getContext().getResourceMap(PlayerDesk.class);
        this.setIcon(resourceMap.getIcon("cardImage.icon")); // NOI18N
        this.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        this.setMaximumSize(new java.awt.Dimension(127, 200));
        this.setMinimumSize(new java.awt.Dimension(127, 200));
        this.setName("cardImage"); // NOI18N
        this.setPreferredSize(new java.awt.Dimension(127, 200));
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toTop();
            }
        });
    }

    public void toTop() {
        this.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    }
}
