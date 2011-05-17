/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.ui.card;

import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import starcup.ui.desk.PlayerDesk;

/**
 *
 * @author Akira.Pan
 */
public class Card extends JLabel implements starcup.core.component.Card {

    private boolean seleceted = false;
    private int width = 127;
    private int height = 200;

    public Card() {
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(starcup.StarCupApp.class).getContext().getResourceMap(PlayerDesk.class);
        this.setIcon(resourceMap.getIcon("cardImage.icon")); // NOI18N
        this.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        this.setCardSize(this.width, this.height);
        this.setName("cardImage"); // NOI18N
        this.setToolTipText("<html>卡片名称<br>基本描述</html>");
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClicked();
            }
        });

    }

    private void setCardSize(int x, int y) {
        this.setMaximumSize(new java.awt.Dimension(x, y));
        this.setMinimumSize(new java.awt.Dimension(x, y));
        this.setPreferredSize(new java.awt.Dimension(x, y));
    }

    public void onClicked() {
        if (this.seleceted) {
            this.seleceted = false;
            this.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        } else {
            this.seleceted = true;
            this.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        }

    }
}
