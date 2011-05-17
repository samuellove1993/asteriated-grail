/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.ui.card;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Akira.Pan
 */
public class JCard extends JLabel implements starcup.core.component.Card {

    private boolean seleceted = false;
    /*默认宽度*/
    public final static int CARD_WIDTH = 127;
    /*整体长度*/
    public final static int CARD_HEIGHT = 220;
    /*图片路径*/
    private String imageUrl = "src/starcup/resources/card/character.jpg";
    private JPanel locatePanel;

    public JCard() {
        this.setIcon(new ImageIcon(imageUrl));
        this.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        this.setCardSize(JCard.CARD_WIDTH, JCard.CARD_HEIGHT);
        this.setName("cardImage"); // NOI18N
        this.setToolTipText("<html>卡片名称<br>基本描述</html>");
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPlay();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                onClicked();
            }
        });
    }

    private void setCardSize(int x, int y) {
        this.setMaximumSize(new java.awt.Dimension(x, y));
        this.setMinimumSize(new java.awt.Dimension(x, y));
        this.setPreferredSize(new java.awt.Dimension(x, y));
    }

    public void onPlay() {
        this.locatePanel.add(this);
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

    public JPanel getLocatePanel() {
        return locatePanel;
    }

    public void setLocatePanel(JPanel locatePanel) {
        this.locatePanel = locatePanel;
    }
}
