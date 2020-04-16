/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.Controles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JButton;

/**
 *
 * @author Dell Inspiron
 */
public class ButtonZ extends JButton {

    Image fondo;

    /**
     * Creates new form ButtonZ
     */
    public ButtonZ() {
        initComponents();
    }

    public Image getFondo() {
        return fondo;
    }

    public void setFondo(Image fondo) {
        this.fondo = fondo;
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(89, 24, 24));
        setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setText("Sample");
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(75, 19));
        setPreferredSize(new java.awt.Dimension(75, 19));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formActionPerformed(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(29, 32, 98));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(10, 13, 67));
    }//GEN-LAST:event_formMouseExited

    @Override
    public void paint(Graphics g) {
        if (fondo != null) {
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
