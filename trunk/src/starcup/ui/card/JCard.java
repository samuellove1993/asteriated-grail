/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.ui.card;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import starcup.core.game.Card;

/**
 *
 * @author Akira.Pan
 */
public class JCard extends JLabel {
    /*所代表的卡牌的基本信息*/
    private Card card;
    private boolean seleceted = false;
    /*默认宽度*/
    public final static int CARD_WIDTH = 127;
    /*整体长度*/
    public final static int CARD_HEIGHT = 220;
    /*图片路径*/
    private String imageUrl = "src/starcup/resources/card/character.jpg";

    public JCard() {
        this.setIcon(new ImageIcon(imageUrl));
        this.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        this.setCardSize(JCard.CARD_WIDTH, JCard.CARD_HEIGHT);
        this.setName("cardImage"); // NOI18N
        this.setToolTipText("<html>卡片名称<br>基本描述</html>");
    }

    private void setCardSize(int x, int y) {
        this.setMaximumSize(new java.awt.Dimension(x, y));
        this.setMinimumSize(new java.awt.Dimension(x, y));
        this.setPreferredSize(new java.awt.Dimension(x, y));
    }

    public boolean isSeleceted() {
        return seleceted;
    }

    public void setSeleceted(boolean seleceted) {
        this.seleceted = seleceted;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
