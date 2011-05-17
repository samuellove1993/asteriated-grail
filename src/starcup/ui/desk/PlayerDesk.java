/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlayerDesk.java
 *
 * Created on 2011-5-13, 16:20:16
 */
package starcup.ui.desk;

import starcup.core.game.Player;
import starcup.ui.card.Card;

/**
 *
 * @author Akira.Pan
 */
public class PlayerDesk extends javax.swing.JPanel {

    private Player player;

    /** Creates new form PlayerDesk */
    public PlayerDesk() {
        initComponents();
    }

    public void display() {
        for (int i = 0; i < player.getCardLimit(); i++) {
            Card card = new Card();
            handDeckPanel.add(card, new org.netbeans.lib.awtextra.AbsoluteConstraints(i*60, 50 , -1, -1));
       //     handDeckPanel.add(card);
            this.revalidate();
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        cardImage = new javax.swing.JLabel();
        publicPanel = new javax.swing.JPanel();
        playerPanel = new javax.swing.JPanel();
        handDeckPanel = new javax.swing.JPanel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(starcup.StarCupApp.class).getContext().getResourceMap(PlayerDesk.class);
        jFormattedTextField1.setText(resourceMap.getString("jFormattedTextField1.text")); // NOI18N
        jFormattedTextField1.setName("jFormattedTextField1"); // NOI18N

        cardImage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardImage.setIcon(resourceMap.getIcon("cardImage.icon")); // NOI18N
        cardImage.setText(resourceMap.getString("cardImage.text")); // NOI18N
        cardImage.setToolTipText(resourceMap.getString("cardImage.toolTipText")); // NOI18N
        cardImage.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cardImage.setName("cardImage"); // NOI18N
        cardImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardImageMouseEntered(evt);
            }
        });

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        publicPanel.setBackground(resourceMap.getColor("publicPanel.background")); // NOI18N
        publicPanel.setMaximumSize(new java.awt.Dimension(800, 270));
        publicPanel.setMinimumSize(new java.awt.Dimension(800, 270));
        publicPanel.setName("publicPanel"); // NOI18N
        publicPanel.setPreferredSize(new java.awt.Dimension(800, 270));
        publicPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        add(publicPanel);

        playerPanel.setBackground(resourceMap.getColor("playerPanel.background")); // NOI18N
        playerPanel.setMaximumSize(new java.awt.Dimension(800, 300));
        playerPanel.setMinimumSize(new java.awt.Dimension(800, 300));
        playerPanel.setName("playerPanel"); // NOI18N
        playerPanel.setPreferredSize(new java.awt.Dimension(800, 300));
        playerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        handDeckPanel.setMaximumSize(new java.awt.Dimension(600, 300));
        handDeckPanel.setMinimumSize(new java.awt.Dimension(600, 300));
        handDeckPanel.setName("handDeckPanel"); // NOI18N
        handDeckPanel.setPreferredSize(new java.awt.Dimension(600, 300));
        handDeckPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        playerPanel.add(handDeckPanel);

        add(playerPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void cardImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardImageMouseClicked
    }//GEN-LAST:event_cardImageMouseClicked

    private void cardImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardImageMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cardImageMouseEntered
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardImage;
    private javax.swing.JPanel handDeckPanel;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JPanel publicPanel;
    // End of variables declaration//GEN-END:variables
}
