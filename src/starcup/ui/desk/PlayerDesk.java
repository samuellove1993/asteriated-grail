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
            jPanel2.add(card);
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

        cardImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(starcup.StarCupApp.class).getContext().getResourceMap(PlayerDesk.class);
        cardImage.setIcon(resourceMap.getIcon("cardImage.icon")); // NOI18N
        cardImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        cardImage.setMaximumSize(new java.awt.Dimension(127, 175));
        cardImage.setMinimumSize(new java.awt.Dimension(127, 175));
        cardImage.setName("cardImage"); // NOI18N
        cardImage.setPreferredSize(new java.awt.Dimension(127, 175));

        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 400));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 200));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 200));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        add(jPanel1);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 200));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 200));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
