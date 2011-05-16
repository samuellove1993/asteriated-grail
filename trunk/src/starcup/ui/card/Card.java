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
    public Card() {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(starcup.StarCupApp.class).getContext().getResourceMap(PlayerDesk.class);
        this.setIcon(resourceMap.getIcon("cardImage.icon")); // NOI18N
        this.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        this.setMaximumSize(new java.awt.Dimension(127, 175));
        this.setMinimumSize(new java.awt.Dimension(127, 175));
        this.setName("cardImage"); // NOI18N
        this.setPreferredSize(new java.awt.Dimension(127, 175));
    }
    public JLabel createImage() {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(starcup.StarCupApp.class).getContext().getResourceMap(PlayerDesk.class);
        JLabel newImage = new javax.swing.JLabel();
        newImage.setIcon(resourceMap.getIcon("cardImage.icon")); // NOI18N
        newImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        newImage.setMaximumSize(new java.awt.Dimension(127, 175));
        newImage.setMinimumSize(new java.awt.Dimension(127, 175));
        newImage.setName("cardImage"); // NOI18N
        newImage.setPreferredSize(new java.awt.Dimension(127, 175));
        return newImage;
    }
}
